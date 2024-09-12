# 🚀 Develop a Simple Game in Java

For this exciting assignment, you will create a simple game application using Java. The game will involve a player character that can move, enemies that interact with the player, and a scoring system to track the player's performance. This task will help you become familiar with Java programming concepts such as designing classes, managing variables, and implementing methods.

### 💀 Deadline

This assignment should be completed before the lab session on **Friday, November 10th**.

### 👩‍🏫 Instructions

Follow the instructions provided in the [assignments section of the course website](https://example.com/course-instructions).

### 📝 Preparation

Before starting, review the following materials:

- [Getting Started with Java Classes](https://java.com/getting-started)
- Sign up and enroll with the course key `game-dev-java123` if you haven't yet.

### ✅ Learning Goals

This week's learning goals include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Browse the [course discussion forum](https://example.com/forum) for similar questions.
2. Post your question in a new thread with a descriptive title.
3. Discuss with peers in class, but avoid sharing exact solutions.

---

### 🎮 Game Application Assignment

Your mission is to develop a simple console-based game in Java, where a player can navigate a game world and interact with enemies. You will implement a scoring system to keep track of the player's progress.

#### Game Components:

- **Player**: Can move in four directions (up, down, left, right).
- **Enemies**: Interact with the player by decreasing their score.
- **Scoring System**: Increases or decreases based on player actions.

---

#### Exercise 1: Design Classes

Create Java classes for `Player`, `Enemy`, and `Game` with appropriate instance fields. Your `Player` class should include:

- `String` playerName
- `int` score
- `int` positionX (horizontal position)
- `int` positionY (vertical position)

In your `Enemy` class, include:

- `String` enemyName
- `int` damage

Use the `Game` class to initialize the game environment and manage interactions between the player and enemies.

<details>
  <summary> Example Code Skeleton </summary>

  ```java
  public class Player {
      private String playerName;
      private int score;
      private int positionX;
      private int positionY;

      // Constructor
      public Player(String playerName) {
          this.playerName = playerName;
          this.score = 0;
          this.positionX = 0;
          this.positionY = 0;
      }      

      // Getters and Setters
      public String getPlayerName() {
          return playerName;
      }

      public void setPlayerName(String playerName) {
          this.playerName = playerName;
      }

      public int getScore() {
          return score;
      }

      public void setScore(int score) {
          this.score = score;
      }

      // Add other getters and setters as needed
  }
  ```

</details>

#### Exercise 2: Implement Movement and Interaction

Implement methods in your `Player` class for movement (e.g., `moveUp`, `moveDown`, `moveLeft`, `moveRight`). Ensure these methods adjust the player's position accurately. Add an `interactWithEnemy(Enemy enemy)` method to calculate score changes when colliding with enemies.

<details>
  <summary> Example Player Movement Method </summary>

  ```java
  public void moveUp() {
      positionY += 1;
      System.out.println(playerName + " moved up to position (" + positionX + ", " + positionY + ")");
  }
  ```

</details>

#### Exercise 3: Main Method and Game Loop

Create a `Game` class with a `main` method. Initialize the `Player` and `Enemy` objects and run a simple console-based game loop allowing the player to input commands to move or interact with enemies. Implement scope handling and demonstrate understanding of variable shadowing.

<details>
  <summary> Example Main Method </summary>

  ```java
  public class Game {
      public static void main(String[] args) {
          Player player = new Player("Hero");
          Enemy enemy = new Enemy("Villain", 5);

          // Game interaction
          player.moveUp();
          player.interactWithEnemy(enemy);

          player.printPlayerStatus();
          // Print out the current score and player position
      }
  }
  ```
</details>

---

> **Note:** Be mindful of scope and potential variable shadowing when designing your game. Review how the `this` keyword can resolve conflicts between instance fields and local variables.

---

By completing these exercises, you will gain hands-on experience in designing and implementing a simple Java application that integrates various core programming concepts. Enjoy building your game and have fun with the creative process!