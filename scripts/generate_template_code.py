import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the new task description
    try:
        with open("tasks/new_task.md", "r") as file:
            task_description = file.read()
    except FileNotFoundError:
        print("Error: new_task.md file not found.")
        sys.exit(1)

    # Combine task description into a single prompt for template generation
    prompt = (
        f"Based on the following task description, generate a Java template that provides the class structure, method signatures, and high-level comments, "
        f"but removes detailed implementations, making it suitable for students to fill in the missing parts.\n\n"
        f"### Task Description\n\n"
        f"{task_description}\n\n"
        "IMPORTANT: The response must contain plain Java code, with class and method signatures, but with method bodies left empty or commented. "
        "Keep necessary imports but remove unnecessary complexity. The response should be suitable to use directly as .java files for students to complete."
    )

    # Call OpenAI API to generate the template
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate template code after multiple retries.")
        sys.exit(1)

    # Ensure the gen_src directory exists
    gen_src_dir = os.path.join("gen_src")
    os.makedirs(gen_src_dir, exist_ok=True)

    # Write the generated template to Java files in gen_src
    write_generated_code_to_files(gen_src_dir, response_content)

    # Commit and push changes
    commit_and_push_changes(branch_name, gen_src_dir)

def write_generated_code_to_files(directory, code_content):
    """
    Write generated Java code to appropriate files in the specified directory.
    Remove detailed logic but keep class structure and method signatures for students to fill in.
    """
    file_blocks = code_content.split("class ")
    
    for block in file_blocks:
        block = block.strip()

        if block:
            # Remove any markdown artifacts and unnecessary text
            block = block.replace("```", "").replace("java", "").strip()
            
            lines = block.splitlines()
            class_declaration = lines[0].strip() if lines else ""
            
            if "{" in class_declaration:
                # Extract the class name and create the file
                class_name = class_declaration.split()[1]
                if class_name.isidentifier():
                    file_name = f"{class_name}.java"
                    file_path = os.path.join(directory, file_name)

                    # Simplify the block by leaving method signatures, and removing logic
                    simplified_block = simplify_block(block)

                    try:
                        with open(file_path, "w") as java_file:
                            java_file.write(simplified_block)
                        print(f"Successfully wrote {file_name}")
                    except IOError as e:
                        print(f"Error writing file {file_name}: {e}")
                else:
                    print(f"Invalid class name detected: '{class_name}'. Skipping block.")
            else:
                print(f"Malformed class declaration detected: {class_declaration}. Skipping block.")

def simplify_block(block):
    """
    Simplify the class block by removing method bodies and keeping only method signatures and class structure.
    """
    simplified_block = []
    in_method_body = False
    
    for line in block.splitlines():
        stripped_line = line.strip()

        # If we encounter the start of a method
        if stripped_line.endswith("{") and not stripped_line.startswith("class"):
            simplified_block.append(line)
            in_method_body = True  # Start ignoring lines inside the method body
        elif in_method_body:
            # Look for the closing brace that marks the end of the method body
            if stripped_line == "}":
                simplified_block.append(line)  # Keep the closing brace
                in_method_body = False  # Stop ignoring lines
            else:
                simplified_block.append("    // TODO: Implement this method")  # Add a placeholder
        else:
            simplified_block.append(line)

    return "\n".join(simplified_block)

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
            print(f"Error generating template code: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def commit_and_push_changes(branch_name, directory_path):
    if not branch_name:
        print("Error: Branch name is empty.")
        sys.exit(1)

    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", directory_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated template"], check=True)
        subprocess.run(
            ["git", "push", "--set-upstream", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if len(sys.argv) != 3:
    print("Error: Missing required command line arguments 'api_key' and 'branch_name'")
    sys.exit(1)

api_key = sys.argv[1]
branch_name = sys.argv[2]

main(api_key, branch_name)
