# 👾 Build Your Own Adventure: A Simple Java Game!

In this programming assignment, you will design a simple console-based game in Java. The game will involve player movement, a scoring system, and interactions with enemies. Through this task, you'll practice designing and structuring Java classes and get acquainted with the concepts of object-oriented programming.

### 📅 Deadline
Submit your completed work by **Friday, 25th November**.

### 📖 Preparation
Before beginning this assignment, ensure you have reviewed the following materials:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Understanding Instance Fields and Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html)
- Register and explore the course resources at [Java Basics Online](https://java-basics.kth.se/), using course key `bt4527-fw23`.

### 🎯 Learning Goals
By completing this assignment, you will:

- Design Java classes with instance fields.
- Implement constructors to initialize objects.
- Use getters and setters to encapsulate data.
- Print outputs to the terminal.
- Employ the `main` method as the entry point of your application.
- Gain insights into scope and variable shadowing in Java.

### 🛠️ Troubleshooting Guide
If you encounter issues:

1. Check the [course forum](https://community.kth.se/group/java-23) for similar queries.
2. If unresolved, post your question in the forum or during the [weekly Lab](https://schedule.kth.se/java-lab).
3. Engage with peers but avoid sharing direct solutions.

### 🎮 Game Development Tasks

Develop your own console-based adventure game where a player navigates through obstacles, scoring points, and encountering enemies. Below are the guided exercises to build your game.

#### Exercise 1: Designing the Game Class

1. In the `src` folder, create a new class named `Game.java`. This class will represent the game environment.
2. Add the following instance fields to the class:
   - `String playerName`
   - `int playerScore`
   - `int playerPosition`
   - `int enemyPosition`
   - `boolean gameOver`

<details>
  <summary>🛠 Example 1</summary>

  ```java
  class Game {
      // Declare instance fields here

      public static void main(String[] args) {
          // Create a new Game object
          Game adventure = new Game();

          // Initialize fields
          adventure.playerName = "Hero";
          adventure.playerScore = 0;
          adventure.playerPosition = 0;
          adventure.enemyPosition = 5;

          // Print initial state
          System.out.println("Player: " + adventure.playerName);
          System.out.println("Score: " + adventure.playerScore);
          System.out.println("Player Position: " + adventure.playerPosition);
          System.out.println("Enemy Position: " + adventure.enemyPosition);
      }
  }
  ```

</details>

#### Exercise 2: Implement Getters and Setters

- Change the access modifier of the fields in the `Game` class to `private`.
- Implement getters and setters for each field to control access.

<details>
  <summary>🛠 Example 2</summary>

  ```java
  class Game {
      // Private fields
      private String playerName;
      private int playerScore;
      private int playerPosition;
      private int enemyPosition;
      private boolean gameOver;

      // Getters
      public String getPlayerName() { return playerName; }
      public int getPlayerScore() { return playerScore; }
      public int getPlayerPosition() { return playerPosition; }
      public int getEnemyPosition() { return enemyPosition; }
      public boolean isGameOver() { return gameOver; }

      // Setters
      public void setPlayerName(String playerName) { this.playerName = playerName; }
      public void setPlayerScore(int playerScore) { this.playerScore = playerScore; }
      public void setPlayerPosition(int playerPosition) { this.playerPosition = playerPosition; }
      public void setEnemyPosition(int enemyPosition) { this.enemyPosition = enemyPosition; }
      public void setGameOver(boolean gameOver) { this.gameOver = gameOver; }

      public static void main(String[] args) {
          Game adventure = new Game();
          
          // Initialize using setters
          adventure.setPlayerName("Hero");
          adventure.setPlayerScore(0);
          adventure.setPlayerPosition(0);
          adventure.setEnemyPosition(5);

          // Use getters to display state
          System.out.println("Player: " + adventure.getPlayerName());
          System.out.println("Score: " + adventure.getPlayerScore());
          System.out.println("Player Position: " + adventure.getPlayerPosition());
          System.out.println("Enemy Position: " + adventure.getEnemyPosition());
      }
  }
  ```

</details>

#### Exercise 3: Implementing Constructors

1. Add a constructor to the `Game` class to set initial values for the fields.
2. Modify Example 2 to use this constructor.

<details>
  <summary>🛠 Example 3</summary>

  ```java
  class Game {
      // Fields and accessors...

      // Constructor
      public Game(String playerName, int playerScore, int playerPosition, int enemyPosition) {
          this.playerName = playerName;
          this.playerScore = playerScore;
          this.playerPosition = playerPosition;
          this.enemyPosition = enemyPosition;
          this.gameOver = false;
      }

      public static void main(String[] args) {
          Game adventure = new Game("Hero", 0, 0, 5);
          adventure.printInfo();
      }

      public void printInfo() {
          System.out.println("> INFO");
          System.out.println("> Player: " + getPlayerName());
          System.out.println("> Score: " + getPlayerScore());
          System.out.println("> Player Position: " + getPlayerPosition());
          System.out.println("> Enemy Position: " + getEnemyPosition());
          System.out.println("> Game Over: " + isGameOver());
      }
  }
  ```

</details>

#### Exercise 4: Player Movement and Scoring

1. Create a method `movePlayer(int steps)` to update the player's position and score.
2. If the player reaches the enemy's position, grant 10 points and set the `gameOver` to `true`.

<details>
  <summary>🛠 Example 4</summary>

  ```java
  public void movePlayer(int steps) {
      this.playerPosition += steps;
      this.playerScore += Math.abs(steps);
      if (playerPosition == enemyPosition) {
          playerScore += 10;
          gameOver = true;
          System.out.println("> " + playerName + " reached the enemy and won the game!");
      } else {
          System.out.println("> " + playerName + " moves to position " + playerPosition);
      }
  }
  ```

</details>

#### Exercise 5: Variable Shadowing

Review the concepts of variable shadowing and the `this` keyword with this example.

```java
public class ScopeExample {
    private int data = 1;

    public void shadowExample(int data) {
        // The parameter 'data' shadows the instance field
        System.out.println("Local data: " + data); // Prints the local value
        System.out.println("Instance data: " + this.data); // Prints the instance value
    }

    public static void main(String[] args) {
        ScopeExample example = new ScopeExample();
        example.shadowExample(2);
    }
}
```

> **Note:** Understand how to correctly use `this` to access the instance fields overshadowed by parameters or local variables.

By completing these exercises, you will have a foundational understanding of Java's object-oriented principles and the creation of basic game mechanics. Good luck, and may your coding adventure be epic! 🎮