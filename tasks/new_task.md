# 🎮 Simple Java Game Project

For this exercise, you will design a simple game application in Java. You will learn how to model components of a game using classes, manage player movement and interactions with enemies, and implement a basic scoring system.

### 💀 Deadline

This project should be completed before next week's lab session on **Friday 25th November**.

### 👩‍🏫 Instructions

For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation

Before starting this assignment, make sure you're familiar with the following concepts:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

Refer to the following resources to get started:

- Read [Classes and Objects Overview](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Review [Encapsulation in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)

### ✅ Learning Goals

The goals for this week's exercise include:

- Designing and implementing Java classes
- Managing game state using instance fields
- Creating constructor methods for class initialization
- Implementing access functions through *getters* and *setters*
- Printing updates to the terminal using `System.out.println`
- Utilizing the `main` method for execution
- Grasping the concept of scope and handling variable shadowing

### 🚨 Troubleshooting Guide

If you encounter any issues, use the following steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have a similar issue.
2. If your issue is unique, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) on the forum with a descriptive title starting with "Game Project: [Brief Problem Summary]".
3. Seek assistance during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) by checking your schedule.

Discussing with peers is encouraged, but do **not share answers**!

### 🏛 Assignment

Your mission is to build a simple Java game featuring a **Player**, **Enemies**, and a **Score System**. Below are detailed exercises guiding you through the process.

#### Exercise 1.0 -- Designing the Player Class

Create `Player.java` in the `src` folder. Players should have:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` score
- `boolean` isAlive

Add a method `movePlayer(int x, int y)` to update player position and another `addScore(int points)` for increasing the score.

<details>
  <summary>🛠 Example 1</summary>

  ```java
  class Player {
    
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;
    private boolean isAlive;

    public Player(String name) {
      this.name = name;
      this.xPosition = 0;
      this.yPosition = 0;
      this.score = 0;
      this.isAlive = true;
    }

    public void movePlayer(int x, int y) {
      this.xPosition += x;
      this.yPosition += y;
      System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    public void addScore(int points) {
      this.score += points;
      System.out.println(name + " scored! Total score: " + score);
    }
    
    public static void main(String[] args) {
      Player player1 = new Player("Hero");
      player1.movePlayer(1, 1);
      player1.addScore(10);
    }
  }
  ```

</details>

#### Exercise 1.1 -- Implementing Getters and Setters

Encapsulate your fields by making them `private`, and implement getter and setter methods for `xPosition`, `yPosition`, and `score`.

<details>
  <summary>🛠 Example 2</summary>

  ```java
  // Add getters and setters for the fields here

  public int getXPosition() {
    return xPosition;
  }

  public void setXPosition(int xPosition) {
    this.xPosition = xPosition;
  }

  public int getYPosition() {
    return yPosition;
  }

  public void setYPosition(int yPosition) {
    this.yPosition = yPosition;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
  ```

</details>

#### Exercise 1.2 -- Creating the Enemy Class

Design a `Enemy.java` class with attributes:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` damage

Whenever a player moves to the same position as an enemy, print a message to indicate damage dealt and update the player's `isAlive` field based on their health.

<details>
  <summary>🛠 Example 3</summary>

  ```java
  class Enemy {

    private String name;
    private int xPosition;
    private int yPosition;
    private int damage;

    public Enemy(String name, int x, int y, int damage) {
      this.name = name;
      this.xPosition = x;
      this.yPosition = y;
      this.damage = damage;
    }

    public void attack(Player player) {
      if (player.getXPosition() == xPosition && player.getYPosition() == yPosition) {
        System.out.println(name + " attacks " + player.getName() + " dealing " + damage + " damage!");
        player.setAlive(false); // Assume player is dead for simplification
      }
    }
  }
  ```

</details>

#### Exercise 1.3 -- Handling Variable Shadowing

Observe the shadowing problem in the Player class when method parameters have the same name as instance variables. Use `this` to correct such scenarios.

<details>
  <summary>⚠️ Example Shadowing</summary>

  ```java
  // Here's a code snippet illustrating a shadowing problem
  public Player(String name) {
    name = name; // This won't work as expected
  }

  // Correct it using 'this'
  public Player(String name) {
    this.name = name; // Correct use of 'this'
  }
  ```

</details>

By completing these exercises, you will have gained experience in designing Java classes with encapsulated variables, using constructors and instance methods, and managing scope to prevent variable shadowing. Happy coding! 🎉