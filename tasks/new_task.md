# Mini Java Game: Block Defender

For this exercise, you're going to model a simple game in Java where a player navigates a field, interacts with enemies, and scores points. This will help you learn to design Java classes, manage instance fields, and work with constructors, setters, and getters. This task will also provide hands-on experience with debugging and understanding variable shadowing in Java.

### 💀 Deadline

This project must be completed before the exercise session on **Friday, 2nd December**.

### 👩‍🏫 Instructions

For submission guidelines, please see the [assignments section of the course instructions](https://yourcoursewebsite.com/assignments).

### 📝 Preparation

You must read and complete the questions in the OLI materials for Java Classes.

- Read [Understanding Java Classes](https://example.io/Java-Classes)
- Register for the course material at https://example.registration.com with the key `java-fall23`

> **Note:** Material might have slight variations, feel free to explore ahead if needed.

### ✅ Learning Goals

This week's learning objectives are:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope (or variable shadowing)

### 🚨 Troubleshooting Guide

If you encounter issues, follow these steps:

1. Check [posted issues](https://yourcoursewebsite.com/help/issues) to see if others have similar problems.
2. If not, post your query by creating a [New Issue](https://yourcoursewebsite.com/help/issues/new).
3. Seek assistance from a TA during [weekly labs](https://yourcoursewebsite.com/schedule). Consult the schedule for upcoming sessions.

Discuss among peers, but **do not share exact answers**!

### 🏛 Assignment

You will be creating a basic game simulation where a player can move, score points, and encounter enemies. Each element of the game will be modeled as a Java class. Refer to the sections below for creating different parts of the game.

#### Exercise 1 -- Player Class

Create a class called `Player` in the `src` folder. This class should have the following fields:

- `String name`
- `int score`
- `int positionX`
- `int positionY`

Add a constructor, getters, and setters for these fields.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int positionX;
      private int positionY;

      public Player(String name, int positionX, int positionY) {
          this.name = name;
          this.score = 0;
          this.positionX = positionX;
          this.positionY = positionY;
      }

      // Getters and setters here...

      public static void main(String[] args) {
          Player player = new Player("PlayerOne", 0, 0);
          player.setScore(100);
          System.out.println("Player Name: " + player.getName());
          System.out.println("Score: " + player.getScore());
          System.out.println("Position: (" + player.getPositionX() + ", " + player.getPositionY() + ")");
      }
  }
  ```
</details>

#### Exercise 2 -- Enemy Class

Create an `Enemy` class with these fields:

- `String type`
- `int health`
- `int positionX`
- `int positionY`

Include a constructor and the necessary getter and setter methods.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Enemy {
      private String type;
      private int health;
      private int positionX;
      private int positionY;

      public Enemy(String type, int health, int positionX, int positionY) {
          this.type = type;
          this.health = health;
          this.positionX = positionX;
          this.positionY = positionY;
      }

      // Getters and setters here...
  }
  ```
</details>

#### Exercise 3 -- Scoring System

Implement a scoring system within the `Player` class. Create a method `increaseScore(int points)`. Call this method whenever a player defeats an enemy.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public void increaseScore(int points) {
      this.score += points;
      System.out.println("New Score: " + this.score);
  }
  ```
</details>

#### Exercise 4 -- Variable Shadowing

Below are examples illustrating variable shadowing. Analyze these and explain how you would resolve the issues using `this`.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class ShadowExample {
      private int level = 1;

      public void displayLevel() {
          int level = 10;
          System.out.println("Current Level: " + level); // Wrong level displayed
      }

      public static void main(String[] args) {
          new ShadowExample().displayLevel();
      }
  }
  ```

  ```java
  public class Character {
      private String characterName;

      public Character(String characterName) {
          characterName = characterName; // Incorrect assignment
      }

      public void announce() {
          System.out.println(characterName + " has joined the game!"); // Incorrect name displayed
      }
  }
  ```
</details>

> **Note:** Think about instances when local variables override instance fields and how to use `this` to distinguish them.

Use these steps and examples to guide your Java game creation, gain practical experience, and master key programming concepts!