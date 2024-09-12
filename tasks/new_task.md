# 🎮 Simple Java Game Application

For this exercise, you are going to develop a basic game application using Java. Your game will feature player movement, a scoring system, and interactions with an enemy. This task will help you become familiar with the components of a Java class, particularly through designing classes and utilizing object-oriented programming principles.

### ⏰ Deadline

This assignment must be completed before the exercise on **Friday, 7th October**.

### 🚨 Instructions

For instructions on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

### 📘 Preparation

Read through the OLI material for Module 2 to fully understand the concepts required for this assignment.

- [Looking Inside Classes](https://example.com/module2)
- Register at https://example.com/ with course key `game-app-ht2023`

**Note:** This preparation material may contain content not covered in this year's coursework. It's okay to read ahead if you feel it enhances your understanding.

### 🎯 Learning Goals

This week’s learning goals include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope (or *variable shadowing*)

### 🧰 Troubleshooting Guide

If you have any issues, please follow the steps below:

1. Check [this week's issues](https://example.com/help/issues). Check if another student has already encountered your problem.
2. If not, post a new question by creating a [New Issue](https://example.com/help/issues/new). Be descriptive; start your title with "Task: summary of the problem".
3. Ask a TA during the weekly lab session. Refer to the schedule for the next lab session.

**Discussion is encouraged but refrain from sharing complete answers.**

### 👾 Assignment

At the heart of a bustling city exists a simple yet dynamic game world that you will bring to life in Java! Your task is to construct a game with a player character that can move around, gain points, and interact with an enemy. Here are the steps to achieve this:

#### Exercise 1 -- Fields and Constructor

Create a new class named `GameCharacter.java`. This class should encapsulate the attributes of any game character:

- `String name`
- `int health`
- `int score`
- `int positionX`
- `int positionY`
- `boolean active`

Add a constructor to initialize these fields.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  class GameCharacter {

    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;
    private boolean active;

    // Constructor
    public GameCharacter(String name, int health, int positionX, int positionY) {
      this.name = name;
      this.health = health;
      this.score = 0;
      this.positionX = positionX;
      this.positionY = positionY;
      this.active = true;
    }

    public static void main(String[] args) {
      GameCharacter player = new GameCharacter("Hero", 100, 0, 0);
      System.out.println("Player " + player.name + " created!");
    }
  }
  ```

</details>

#### Exercise 2 -- Getters and Setters

Implement *getters* and *setters* for each field, which will encapsulate the data and allow for safe manipulation.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  class GameCharacter {

    // previous code...

    // Getters and Setters
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getHealth() {
      return health;
    }

    public void setHealth(int health) {
      this.health = health;
    }

    public int getScore() {
      return score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    // Other getters and setters...

    public static void main(String[] args) {
      GameCharacter player = new GameCharacter("Hero", 100, 0, 0);
      player.setScore(10);
      System.out.println("Score: " + player.getScore());
    }
  }
  ```

</details>

#### Exercise 3 -- Player Movement

Add methods to move the player. Implement `moveTo(int x, int y)` which updates the player's position.

<details>
  <summary> 🛠 Example Method </summary>

  ```java
  public void moveTo(int x, int y) {
    this.positionX = x;
    this.positionY = y;
    System.out.println(name + " moved to position (" + x + ", " + y + ")");
  }
  ```

</details>

#### Exercise 4 -- Enemy Interaction and Scoring

Create a `GameEnemy` class with similar attributes to `GameCharacter`. Implement a method `interact(GameCharacter player)` that decreases the player's health or increases the score.

<details>
  <summary> 🛠 Example Implementation </summary>

  ```java
  class GameEnemy {

    private String type;
    private int power;
    private boolean defeated;

    public GameEnemy(String type, int power) {
      this.type = type;
      this.power = power;
      this.defeated = false;
    }

    public void interact(GameCharacter player) {
      if (!defeated) {
        player.setHealth(player.getHealth() - this.power);
        System.out.println(player.getName() + " is attacked! Health: " + player.getHealth());
      }
      // Logic for defeating the enemy can follow here
    }

    public static void main(String[] args){
      GameCharacter player = new GameCharacter("Hero", 100, 0, 0);
      GameEnemy enemy = new GameEnemy("Goblin", 10);
      
      enemy.interact(player);
    }
  }
  ```

</details>

#### Exercise 5 -- Variable Shadowing

Examine the examples below about variable shadowing. Be ready to discuss how to resolve these in class.

```Java
public class ShadowExample {
    private int number = 42;

    public void printShadow() {
        int number = 5;
        System.out.println(number); // Prints 5, the local variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printShadow();
    }
}
```

Be prepared to explore how the `this` keyword can help resolve such issues.

Feel free to experiment and expand your game! This exercise is meant to get you comfortable with the fundamentals and establish a foundation for more complex Java projects. 🎉