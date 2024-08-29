# 🎮 Simple Game Development in Java

In this exercise, you'll develop a simple game that involves player movement, scoring system, and enemy interactions. You'll practice designing Java classes and familiarize yourself with core Java concepts.

### 📅 Deadline
Please complete this assignment before your lab session on **Friday, November 10th**.

### 🧑‍🏫 How to Submit
Submit your completed exercise on our [course submission portal](https://courseportal.university.edu).

### 📖 Preparation
Before you start, ensure you have reviewed the following resources:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Encapsulation in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)
- [Introduction to Java Programming](https://www.javatpoint.com/java-tutorial)

### 🎯 Learning Goals

Throughout this exercise, you will:

* Design Java classes
* Add instance fields
* Implement constructor methods
* Create *getters* and *setters*
* Print outputs to the terminal
* Use the `main` method
* Understand variable scope and shadowing

### 🛠 Troubleshooting Guide
If you encounter issues, follow these steps:

1. Check the [course forum](https://courseforum.university.edu) for similar questions.
2. Post your query with a descriptive title, starting with "Game Task: [Your Problem]".
3. Discuss with peers, but remember to work independently on your solution.

### 🎮 Assignment

Create a simple interactive text-based game where a player moves on a grid, scores points, and interacts with enemies.

#### Exercise 1: Create Player and Enemy Classes

1. **Player Class**
   - Fields: `xPosition` (int), `yPosition` (int), `score` (int)
   - Methods: 
     - `move(int x, int y)`: Move the player.
     - `increaseScore(int points)`: Add points to the score.
     - Getters and setters for all fields.

2. **Enemy Class**
   - Fields: `xPosition` (int), `yPosition` (int)
   - Methods:
     - Getters and setters for both fields.

Create these classes in individual files, `Player.java` and `Enemy.java` respectively. 

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  // Player.java
  public class Player {
    private int xPosition;
    private int yPosition;
    private int score;

    public Player(int x, int y) {
      this.xPosition = x;
      this.yPosition = y;
      this.score = 0;
    }

    public void move(int x, int y) {
      this.xPosition = x;
      this.yPosition = y;
      System.out.println("Player moved to (" + x + ", " + y + ")");
    }

    public void increaseScore(int points) {
      this.score += points;
      System.out.println("Score increased by " + points + ". Total score: " + score);
    }

    // Getters and Setters...
  }
  
  // Enemy.java
  public class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int x, int y) {
      this.xPosition = x;
      this.yPosition = y;
    }

    // Getters and Setters...
  }
  ```
</details>

#### Exercise 2: Implement Game Mechanics

3. **Game Class**
   - Create a `Game` class with a `main` method that:
     - Instantiates a `Player` and `Enemy`.
     - Simulates player movement.
     - Handles scoring based on player actions.
     - Prints to the terminal for each action.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
    public static void main(String[] args) {
      Player player = new Player(0, 0);
      Enemy enemy = new Enemy(5, 5);
      
      // Simulate moving and scoring
      player.move(1, 2);
      player.increaseScore(10);
      
      // More interactions...
    }
  }
  ```
</details>

#### Exercise 3: Add Interactions

4. **Player-Enemy Interaction**
   - Implement a method in `Game` to determine if the player meets an enemy:
     - If the player's position coincides with an enemy's, print a message "Encountered an enemy!" and decrease the player's score.
     - Test this interaction in the `main` method.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
    // Existing code…

    public static void checkForEncounter(Player player, Enemy enemy) {
      if (player.getXPosition() == enemy.getXPosition() 
          && player.getYPosition() == enemy.getYPosition()) {
        System.out.println("Encountered an enemy!");
        player.increaseScore(-5); // Decrease score on encounter
      }
    }

    public static void main(String[] args) {
      Player player = new Player(4, 5);
      Enemy enemy = new Enemy(5, 5);

      // Simulate movement
      player.move(5, 5);
      checkForEncounter(player, enemy);
    }
  }
  ```
</details>

#### Exercise 4: Handle Variable Shadowing

5. **Understanding Scope and Shadowing**
   - Review the following code snippet and identify the shadowing issue. Modify the code to correct it using the `this` keyword for clarity between class fields and local variables.

<details>
  <summary> 🛠 Example Code with Shadowing </summary>

  ```java
  public class Example {
    private String message = "Class Scope";

    public void printMessage() {
      String message = "Method Scope"; // Shadowing occurs here
      System.out.println(message);
    }

    public static void main(String[] args) {
      Example ex = new Example();
      ex.printMessage(); // This prints the method scoped variable
    }
  }
  ```

  Correct it by using `this` keyword:

  ```java
  public class Example {
    private String message = "Class Scope";

    public void printMessage() {
      String message = "Method Scope"; 
      System.out.println(this.message); // Fixes shadowing by specifying the instance variable
    }

    public static void main(String[] args) {
      Example ex = new Example();
      ex.printMessage(); // Prints "Class Scope"
    }
  }
  ```
</details>

### 🐞 Found a Bug?
If you notice any buggy behavior in the exercise, submit a detailed error report on our [issue tracker](https://coursebugs.university.edu). Accurate reports may earn a special mention on the course page!