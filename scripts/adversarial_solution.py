import os
import re
import sys
from openai import OpenAI

def main(api_key, task_file, solution_dir):
    client = OpenAI(api_key=api_key)

    # Read the task description
    try:
        with open(task_file, "r") as file:
            task_description = file.read()
    except FileNotFoundError:
        print("Error: task description file not found.")
        sys.exit(1)

    # Read the existing solution files in the solution directory
    solution_files = []
    for filename in os.listdir(solution_dir):
        if filename.endswith(".java"):
            with open(os.path.join(solution_dir, filename), "r") as file:
                solution_files.append(file.read())

    solution_content = "\n\n".join(solution_files)

    # Prompt to improve the solution
    prompt = (
        f"Given the following task description and solution code, analyze the solution and improve it. "
        f"Correct any issues or missing requirements that might be present in the solution.\n\n"
        f"### Task Description\n{task_description}\n\n"
        f"### Current Solution\n{solution_content}\n\n"
        "IMPORTANT: Provide an improved version of the solution with corrections, if necessary, and ensure that the updated code is complete and functional."
        "The response must be in plain Java code with no markdown formatting or ```java blocks."
    )

    # Generate the improved solution
    improved_solution = generate_with_retries(client, prompt, max_retries=3)
    
    # Clean up the improved solution
    improved_solution = clean_up_non_code_content(improved_solution)

    # Overwrite the existing solution files with the cleaned and improved solution
    write_improved_solution(solution_dir, improved_solution)

def clean_up_non_code_content(solution_code):
    """
    This function cleans up non-code content such as misplaced comments, explanations,
    and anything outside the last closing brace '}' in each class.
    """
    # Remove any lines that contain explanations or non-code content
    solution_code = re.sub(r"Here's.*", "", solution_code)
    solution_code = re.sub(r"Save.*", "", solution_code)

    # Ensure that anything outside the last closing '}' is removed
    cleaned_code = ""
    for block in solution_code.split("class "):
        if block.strip():
            # Add back the 'class ' prefix
            block = "class " + block

            # Find the last closing '}'
            last_brace_pos = block.rfind("}")
            if last_brace_pos != -1:
                block = block[:last_brace_pos + 1]  # Keep content up to the last '}'

            # Append cleaned block to the result
            cleaned_code += block + "\n\n"

    return cleaned_code.strip()

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are a helpful assistant."},
                    {"role": "user", "content": prompt}
                ]
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating improved solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def write_improved_solution(directory, improved_solution):
    """Overwrite the existing solution files with the improved solution."""
    
    # Split the solution by class definitions
    file_blocks = improved_solution.split("class ")
    
    for block in file_blocks:
        if block.strip():
            # Extract class name
            class_name_parts = block.split("{")[0].strip().split()
            if len(class_name_parts) > 0:
                class_name = class_name_parts[0]
                if not class_name.isidentifier():
                    print(f"Skipping block with invalid class name: '{class_name}'")
                    continue
            else:
                print("Skipping block due to missing class name.")
                continue

            # Clean the block, removing content after the last closing brace
            cleaned_block = clean_class_block("class " + block)

            # Write cleaned code to a file
            file_name = f"{class_name}.java"
            file_path = os.path.join(directory, file_name)

            try:
                with open(file_path, "w") as java_file:
                    java_file.write(cleaned_block)
                print(f"Successfully wrote {file_name}")
            except IOError as e:
                print(f"Error writing file {file_name}: {e}")

def clean_class_block(block):
    """Ensure the block only contains content until the last closing brace."""
    
    # Find the position of the last closing brace '}' in the block
    last_closing_brace = block.rfind("}")
    
    if last_closing_brace != -1:
        # Truncate the block at the last closing brace
        block = block[:last_closing_brace + 1]
    
    # Remove any content before the first class declaration
    block = re.sub(r'.*?(class\s)', r'class ', block, count=1, flags=re.DOTALL)

    return block

if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Error: Missing required command line arguments 'api_key', 'task_file', and 'solution_dir'")
        sys.exit(1)

    api_key = sys.argv[1]
    task_file = sys.argv[2]
    solution_dir = sys.argv[3]

    main(api_key, task_file, solution_dir)
