import os
import sys
import difflib
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

    # Read the existing solution files in .hidden_tasks
    solution_files = {}
    for filename in os.listdir(solution_dir):
        if filename.endswith(".java"):
            with open(os.path.join(solution_dir, filename), "r") as file:
                solution_files[filename] = file.read()

    solution_content = "\n\n".join(solution_files.values())

    # Prompt to improve the solution with sanitization
    prompt = (
        f"Given the following task description and solution code, analyze the solution and improve it. "
        f"Correct any issues or missing requirements, and sanitize the code. "
        f"Ensure that each class is complete and does not contain fragments from other classes or unfinished blocks of code.\n\n"
        f"### Task Description\n{task_description}\n\n"
        f"### Current Solution\n{solution_content}\n\n"
        "IMPORTANT: Sanitize the solution by ensuring there are no markdown formatting (e.g., no ```java blocks), "
        "each class is fully self-contained, and no part of the next class is present in the current class. "
        "Ensure that the solution is in plain Java code and ready to run without errors."
    )

    # Generate the improved solution
    improved_solution = generate_with_retries(client, prompt, max_retries=3)
    if improved_solution is None:
        print("Error: Failed to generate an improved solution.")
        sys.exit(1)

    # Compare and show changes made
    show_changes_and_write_improved_solution(solution_dir, solution_files, improved_solution)

def generate_with_retries(client, prompt, max_retries=3):
    """Retries generating solution with the OpenAI API."""
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4",
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

def show_changes_and_write_improved_solution(directory, original_files, improved_solution):
    """Compare and show changes, then overwrite the existing solution files with the improved solution."""
    
    # Split the improved solution into separate classes
    file_blocks = improved_solution.split("class ")
    changes_made = []
    
    for block in file_blocks:
        if block.strip():
            class_name = block.split("{")[0].strip().split()[0]
            file_name = f"{class_name}.java"
            file_path = os.path.join(directory, file_name)

            # Retrieve original file content
            original_content = original_files.get(file_name, "")

            # Reconstruct improved class content
            improved_content = "class " + block

            # Display changes using difflib
            diff = list(difflib.unified_diff(
                original_content.splitlines(), 
                improved_content.splitlines(), 
                fromfile=f"Original {file_name}", 
                tofile=f"Improved {file_name}", 
                lineterm=""
            ))

            if diff:
                changes_made.append(f"Changes in {file_name}:\n" + "\n".join(diff))

            # Write the improved content back to the file
            with open(file_path, "w") as java_file:
                java_file.write(improved_content)
    
    # Output the changes made
    if changes_made:
        print("=== Changes Made ===")
        for change in changes_made:
            print(change)
    else:
        print("No changes were necessary.")

if __name__ == "__main__":
    if len(sys.argv) != 4:
        print("Error: Missing required command line arguments 'api_key', 'task_file', and 'solution_dir'")
        sys.exit(1)

    api_key = sys.argv[1]
    task_file = sys.argv[2]
    solution_dir = sys.argv[3]

    main(api_key, task_file, solution_dir)
