# 🚀 Simple Game Application

For the third exercise of this course, you will develop a basic game application in Java. This task will help you delve deeper into Java programming by designing classes and implementing key functionalities for a game. Your game's core functionalities will include player movement, a scoring system, and interactions with enemies. Get ready to start your adventure!

### 📅 Deadline

Please complete and submit this assignment by **Friday, November 10th**.

### 🧑‍🏫 Instructions

Follow the [course instructions](https://your-course-link) for submitting this assignment. 

### 📚 Preparation

Before diving into this assignment, ensure you have completed the materials and exercises for Module 3: [Creating Classes and Objects](https://example-link.com).

- Enroll in the course by using the key `game-101`.

### ✅ Learning Goals

By completing this assignment, you should be able to:

- Design Java classes
- Declare instance fields
- Implement constructor methods
- Develop getters and setters
- Print output to the terminal
- Utilize the `main` method
- Understand variable scope and handle variable shadowing

### 🛠 Troubleshooting Guide

In case you encounter issues, here is your plan of action:

1. Check if others are discussing your issue on [posted issues](https://your-issues-link).
2. If not, create a [new issue](https://your-issues-link/new). Provide a descriptive title, starting with "Task 3: Summary of your problem here."
3. Consult with your instructor or TA during the [weekly lab](https://your-lab-link). Check your schedule for details.

Discuss with peers but remember: **do not share your answers!**

### 🎮 Assignment

This assignment involves creating a simple game application with core game functionalities. You'll design classes to model the game's characters - players and enemies. Let's get started!

#### Task 3.0 -- Class Design and Instance Fields

Create a class `Player.java` in the `src` folder. The `Player` class should contain the following fields:

- `String name`
- `int score`
- `int positionX`
- `int positionY`

These fields will help track the player's personal attributes and current position.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Player {
  
      // Declare your instance fields here!

      public static void main(String[] args) {
          // Create a new Player object
          Player hero = new Player();

          // Assign the instance variables
          hero.name = "Hero";
          hero.score = 0;
          hero.positionX = 0;
          hero.positionY = 0;

          // Print player information
          System.out.println("Player Name: " + hero.name);
          System.out.println("Score: " + hero.score);
          System.out.println("Position: (" + hero.positionX + ", " + hero.positionY + ")");
      }
  }
  ```
</details>

#### Task 3.1 -- Getters and Setters

Encapsulate the player's attributes by making the fields private and providing public getters and setters. This will enable controlled access.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Player {

      // Private fields

      // Add your getters and setters here!

      public static void main(String[] args) {
          // Create a new Player object
          Player hero = new Player();

          // Use setters to initialize the attributes
          hero.setName("Hero");
          hero.setScore(0);
          hero.setPositionX(0);
          hero.setPositionY(0);

          // Use getters to retrieve and print the attributes
          System.out.println("Player Name: " + hero.getName());
          System.out.println("Score: " + hero.getScore());
          System.out.println("Position: (" + hero.getPositionX() + ", " + hero.getPositionY() + ")");
      }
  }
  ```
</details>

#### Task 3.2 -- Constructor Method

Create a constructor for the `Player` class to initialize the attributes when a new player is created.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Player {

      // Add your constructor here!

      public static void main(String[] args) {
          // Initialize Player with a constructor
          Player hero = new Player("Hero", 10, 5, 5);

          // Print player information using the newly created constructor
          System.out.println("Player Name: " + hero.getName());
          System.out.println("Score: " + hero.getScore());
          System.out.println("Position: (" + hero.getPositionX() + ", " + hero.getPositionY() + ")");
      }
  }
  ```
</details>

#### Task 3.3 -- Printing Player Information

Create a method `printInfo()` in the `Player` class to output player details.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class Player {

      // Assume constructor and fields already defined

      public void printInfo() {
          System.out.println("Player Name: " + getName());
          System.out.println("Score: " + getScore());
          System.out.println("Position: (" + getPositionX() + ", " + getPositionY() + ")");
      }

      public static void main(String[] args) {
          Player hero = new Player("Hero", 10, 5, 5);
          hero.printInfo();
      }
  }
  ```
</details>

#### Task 3.4 -- Adding Enemies: Interaction

Define an `Enemy` class with fields for `name`, `positionX`, `positionY`, and interaction capabilities. Then, establish how `Player` and `Enemy` interact, such as a simple encounter printing a message about the interaction.

> **Note:** To model an interaction, you may want to create a method in `Player` that accepts an `Enemy` object as a parameter.

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  public class Enemy {

      private String name;
      private int positionX;
      private int positionY;

      // Constructor, getters, and setters

      public static void main(String[] args) {
          Player hero = new Player("Hero", 10, 5, 5);
          Enemy villain = new Enemy("Villain", 8, 5);

          hero.interact(villain);
      }
  }

  class Player {
      // Fields, constructor, methods like printInfo

      public void interact(Enemy enemy) {
          System.out.println("Player " + getName() + " encounters " + enemy.getName() + "!");
          // Continue interaction logic...
      }
  }
  ```
</details>

#### Task 3.5 -- Understanding Variable Scope and Shadowing

Review and understand variable shadowing. Check the examples below, which might be in the class discussion.

<details>
  <summary> 🛠 Example 6 </summary>

  ```java
  public class ScopeExample {
      
      private String name = "GlobalPlayer"; // The desired default value

      public void demonstrateShadowing() {
          String name = "LocalPlayer";
          System.out.println(name); // This prints "LocalPlayer"
      }

      public static void main(String[] args) {
          ScopeExample example = new ScopeExample();
          example.demonstrateShadowing();
      }
  }
  ```

  ```java
  public class GameEntity {
      private double x;
      private double y;

      public GameEntity(double x, double y) {
          // Incorrectly setting the values
          x = x; // This does not work as intended
          y = y;
      }

      public void printCoordinates() {
          System.out.println("X: " + x + ", Y: " + y); // Unexpected output
      }
  }
  ```

  **Learnings:** Study the examples to understand the concept of *variable shadowing* and how to rectify it using `this` keyword.
</details>

By completing these tasks, you will not only create a simple game application but also solidify your understanding of important Java concepts. Enjoy the process and happy coding!