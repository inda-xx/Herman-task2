import os
import sys

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    # Load the solution
    solution_code = load_solution_code()
    if not solution_code:
        sys.exit(1)

    # Load the tests
    test_code = load_test_code()
    if not test_code:
        sys.exit(1)

    # Strip the solution and test code to create a skeleton/template
    template_code = strip_solution_and_tests_to_template(solution_code, test_code)

    # Save the template code
    save_template(template_code)

    # Commit and push changes
    commit_and_push_changes(branch_name, "gen_src")

def load_solution_code():
    solution_files = []
    try:
        for filename in os.listdir(".hidden_tasks"):
            if filename.endswith(".java"):
                with open(os.path.join(".hidden_tasks", filename), "r") as file:
                    solution_files.append(file.read())
    except FileNotFoundError:
        print("Error: Solution files not found in .hidden_tasks directory.")
        return None

    if not solution_files:
        print("Error: No Java solution files found in .hidden_tasks.")
        return None

    return "\n\n".join(solution_files)

def load_test_code():
    test_files = []
    try:
        for filename in os.listdir("gen_test"):
            if filename.endswith(".java"):
                with open(os.path.join("gen_test", filename), "r") as file:
                    test_files.append(file.read())
    except FileNotFoundError:
        print("Error: Test files not found in gen_test directory.")
        return None

    if not test_files:
        print("Error: No Java test files found in gen_test.")
        return None

    return "\n\n".join(test_files)

def strip_solution_and_tests_to_template(solution_code, test_code):
    """Strip the solution and test code to create a general template/skeleton."""
    stripped_solution = strip_code_to_template(solution_code)
    stripped_tests = strip_code_to_template(test_code)
    
    # Combine stripped solution and stripped tests for the final template
    template_code = stripped_solution + "\n\n" + stripped_tests
    return template_code

def strip_code_to_template(code):
    """Remove implementation details from code to create a template."""
    template_code = ""
    in_method = False

    for line in code.splitlines():
        stripped_line = line.strip()
        
        if stripped_line.startswith("public") or stripped_line.startswith("private"):
            if "{" in line:
                in_method = True
                line = line.split("{")[0] + " { // TODO: Implement here"
        elif in_method:
            if "}" in line:
                in_method = False
            else:
                continue  # Skip implementation lines inside methods

        template_code += line + "\n"

    return template_code

def save_template(template_code):
    gen_src_dir = os.path.join("gen_src")
    os.makedirs(gen_src_dir, exist_ok=True)

    template_file_path = os.path.join(gen_src_dir, "new_task_template.java")
    with open(template_file_path, "w") as file:
        file.write(template_code)

def commit_and_push_changes(branch_name, directory):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", directory], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated template code"], check=True)
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
