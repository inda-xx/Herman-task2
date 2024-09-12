# Catch the Coins! 💰

In the second exercise of our programming course, you will design and implement a simple game in Java. This exercise will introduce you to the essential components of a Java class as you model the elements of a game environment. Get ready to write code that makes a character move, earn points, and dodge enemies!

### 💀 Deadline

Complete this assignment before the exercise on **Friday, 30th September**.

### 👩‍🏫 Instructions

For guidance on submitting the assignment, please visit the [assignments section of the course instructions](https://example-edu-site.com/course-instructions#assignments).

### 📝 Preparation

To get started, please read the material provided in Module 2 on the course platform:

- Review the [Java Classes Overview](https://example-edu-site.com/java/classes-overview).
- If you haven't already, go to [https://example-edu-site.com](https://example-edu-site.com) and sign up for the course using the key `java-gaming-23`.

> **Assistant's Note:** You may encounter content that seems slightly outdated; feel free to explore additional resources as needed.

### ✅ Learning Goals

This week's learning goals include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check this week's [posted issues](https://example-edu-site.com/help/issues) to see if others have the same problem.
2. If not, post your question by creating a [New Issue](https://example-edu-site.com/help/issues/new) with a descriptive title, beginning with "Task *x*: *summary of problem*."
3. You can also ask for help during [weekly labs](https://queue.example-edu-site.com/Queue/CSCourse). Check your schedule for lab timings.

Discuss with peers, but please **avoid sharing direct solutions**!

### 🏛 Assignment

Your challenge is to develop a simple game where a player collects coins and avoids enemies. The player's objective is to collect as many coins as possible without getting caught by enemies.

#### Exercise 1 - Game Elements and Player Class

1. Create a `Player.java` class with the following instance fields:
   - `String name`
   - `int score`
   - `int xPosition`
   - `int yPosition`

2. Add a constructor method to initialize these fields.
   
3. Implement getters and setters for each field to enable encapsulation.

4. Use System.out.println() to display the player's details in the `printPlayerInfo` method.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  class Player {

    // Declare fields here

    // Constructor to initialize the fields

    // Getters and setters here

    public void printPlayerInfo() {
      System.out.println("Player: " + name + ", Score: " + score);
      System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public static void main(String[] args) {
      Player player1 = new Player("Hero", 0, 5, 5);
      player1.printPlayerInfo();
    }
  }
  ```
</details>

#### Exercise 2 - Scoring System

- Implement a method `incrementScore(int points)` to update the player's score when they collect a coin.
- Extend your `printPlayerInfo` method to include updated score information whenever it's called.

#### Exercise 3 - Enemy Class

1. Create an `Enemy.java` class:
   - `int id`
   - `int xPosition`
   - `int yPosition`
   
2. Add a constructor and corresponding getters.

3. Implement a method to print the enemy's position.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  class Enemy {

    // Fields and constructor

    // Getters and setters

    public void printEnemyInfo() {
      System.out.println("Enemy ID: " + id);
      System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
  }
  ```
</details>

#### Exercise 4 - Game Logic

- Implement logic in the `main` method to handle collisions:
  - If a player and enemy reach the same position, print a message indicating the player was caught and reset their score.
- Apply concepts of scope and variable shadowing where helpful.

#### Exercise 5 - Variable Shadowing

Analyze the examples below on variable shadowing. Understand how the keyword `this` is used to manage the shadowing issue. Discuss potential fixes in class.

```java
public class ShadowGame {
    private int level = 0; // I want this level printed :(

    public void printLevel() {
        int level = 5;
        System.out.println(level); // It's printing the wrong level :(
    }

    public static void main(String[] args) {
        new ShadowGame().printLevel();
    }
}
```

**Challenge:** Implement all exercises and extend the game by allowing player movement with arrow keys or similar controls; this will require handling keyboard input and updating positions accordingly.

> **Assistant's Note:** Pay attention to scopes where local variables might shadow instance variables and practice using the `this` reference.

---

Enjoy designing your game! We look forward to seeing the creative solutions you come up with. Keep coding and have fun!