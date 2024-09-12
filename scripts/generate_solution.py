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

    # Inspirational code snippet for the solution
    inspirational_code = """
    // Example class for reference

    class Indamon {
        private String name;
        private int hp;
        private int attack;
        private int defense;
        boolean fainted;

        public Indamon(){
          // Empty constructor
        }

        public Indamon(String name, int hp, int attack, int defense) {
           this.name = name;
           this.hp = hp;
           this.attack = attack;
           this.defense = defense;
           this.fainted = false;
        }

        public String getName() {
          return name;
        }

        public void setName(String name) {
          this.name = name;
        }

        public int getHp() {
          return hp;
        }

        public void setHp(int hp) {
          this.hp = hp;
        }

        public int getAttack() {
          return attack;
        }

        public void setAttack(int attack) {
          this.attack = attack;
        }

        public int getDefense() {
          return defense;
        }

        public void setDefense(int defense) {
          this.defense = defense;
        }

        public boolean isFainted() {
          return fainted;
        }

        public void setFainted(boolean fainted) {
          this.fainted = fainted;
        }

        public void attack(Indamon foe){
          int attackDamage = this.attack / foe.getDefense();
          foe.setHp(foe.getHp() - attackDamage);
        }

        public static void main(String[] args) {
          Indamon glassey = new Indamon("Glassey", 10, 5, 5);
          System.out.println(glassey.getName());
          System.out.println(glassey.getHp());
          System.out.println(glassey.getAttack());
          System.out.println(glassey.getDefense());
        }
    }
    """

    # Combine task description and inspirational code into a single prompt for solution generation
    prompt = (
        f"Based on the following task description, generate a complete and functional Java solution that meets all the requirements. "
        f"The solution should be well-structured, use meaningful variable names, include necessary comments for clarity, "
        f"and be ready to pass a comprehensive set of unit tests.\n\n"
        f"### Task Description\n\n"
        f"{task_description}\n\n"
        f"### Inspirational Code Snippet\n\n"
        f"{inspirational_code}\n\n"
        "IMPORTANT: The response must be plain Java code with no markdown formatting or ```java blocks. "
        "Ensure that each class is entirely self-contained and is not left incomplete. "
        "No part of the next file should be left in the current file. "
        "Ensure that each class is saved in its own appropriately named file, and that there are no 'leftover' initializers or class definitions from subsequent files."
        "Ensure all imports, public classes, and everything related to the class is included in the appropriate file."
        "Write NO TEXT beyond the code itself, whatsoever. "
    )

    # Call OpenAI API to generate the solution code
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate solution code after multiple retries.")
        sys.exit(1)

    # Ensure the .hidden_tasks directory exists
    hidden_tasks_dir = os.path.join(".hidden_tasks")
    os.makedirs(hidden_tasks_dir, exist_ok=True)

    # Write the generated code to Java files
    write_generated_code_to_files(hidden_tasks_dir, response_content)

    # Commit and push changes
    commit_and_push_changes(branch_name, hidden_tasks_dir)

def write_generated_code_to_files(directory, code_content):
    """
    Write generated Java code to appropriate files in the specified directory.
    Handles cases where leftover comments or initializations are present.
    Also ensures that import statements and public class declarations are captured.
    """
    leftover_content = ""  # To capture leftover content before the first class
    current_imports = ""   # To capture and carry over import statements
    file_blocks = re.split(r'\b(class|public\s+class)\b', code_content)  # Split on 'class' or 'public class'

    for i in range(1, len(file_blocks), 2):  # Iterate over every "class"/"public class" block
        class_declaration = file_blocks[i] + file_blocks[i + 1]  # Reattach split 'class' or 'public class'
        block = leftover_content + class_declaration

        # Extract class name
        class_name_parts = re.split(r'\s+', class_declaration.split("{")[0].strip())
        if len(class_name_parts) > 1:
            class_name = class_name_parts[1]  # Second word is the class name
        else:
            print(f"Skipping block due to missing class name: {class_name_parts}")
            continue

        # Clean up the block, removing content after the last closing brace
        cleaned_block = clean_class_block(block)

        # Prepend any import statements (gathered from previous blocks)
        cleaned_block = current_imports + cleaned_block

        # Clear leftover and import content for the next file
        leftover_content = ""
        current_imports = ""

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
    
    return block

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
            print(f"Error generating solution code: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def commit_and_push_changes(branch_name, directory_path):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", directory_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated solution"], check=True)
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
