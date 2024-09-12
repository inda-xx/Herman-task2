import os
import re
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

    # Prompt to generate a student template
    prompt = (
        f"Based on the following task description, generate a Java template where method bodies and complex logic are removed, but class structures, "
        f"method signatures, and high-level comments remain. Ensure that it is suitable for students to fill in the missing parts.\n\n"
        f"### Task Description\n\n"
        f"{task_description}\n\n"
        "IMPORTANT: Provide only the plain Java code, with method bodies removed and high-level comments intact. "
        "Remove all complex logic. No explanations or markdown formatting like ```java blocks or plain text should be included."
    )

    # Call OpenAI API to generate the template
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate template code after multiple retries.")
        sys.exit(1)

    # Ensure the gen_src directory exists
    gen_src_dir = os.path.join("gen_src")
    os.makedirs(gen_src_dir, exist_ok=True)

    # Write the generated code to Java files in gen_src
    write_generated_code_to_files(gen_src_dir, response_content)

    # Commit and push changes
    commit_and_push_changes(branch_name, gen_src_dir)

def write_generated_code_to_files(directory, code_content):
    """
    Write generated Java code to appropriate files in the specified directory.
    Remove explanations, ensure only code is written, and simplify method bodies.
    """
    # Split content by class declarations
    file_blocks = re.split(r'\b(class|public\s+class|abstract\s+class|final\s+class)\b', code_content)

    for i in range(1, len(file_blocks), 2):
        class_declaration = file_blocks[i] + file_blocks[i + 1]
        block = clean_up_block(class_declaration)

        # Extract class name
        class_name_match = re.search(r'class\s+([A-Za-z_]\w*)\s*{', block)
        if class_name_match:
            class_name = class_name_match.group(1)
        else:
            print(f"Skipping block due to missing class name in block: {block[:50]}")
            continue

        # Simplify the block by removing method bodies
        simplified_block = simplify_block(block)

        # Write cleaned code to a file
        file_name = f"{class_name}.java"
        file_path = os.path.join(directory, file_name)

        try:
            with open(file_path, "w") as java_file:
                java_file.write(simplified_block)
            print(f"Successfully wrote {file_name}")
        except IOError as e:
            print(f"Error writing file {file_name}: {e}")

def clean_up_block(block):
    """
    Clean up non-code content such as markdown artifacts, explanations, and unnecessary text.
    """
    block = block.strip()
    # Remove non-code artifacts like markdown
    block = re.sub(r'```.*', '', block)  # Remove any markdown-like ``` blocks
    # Remove explanations or non-code text
    block = re.sub(r'Below is.*', '', block)
    block = re.sub(r'This template.*', '', block)
    block = re.sub(r'//.*', '', block)  # Optionally, remove high-level comments if not needed
    return block

def simplify_block(block):
    """
    Simplify the class block by removing method bodies and keeping only method signatures.
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
