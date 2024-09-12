# 🎮 Simple Game Application: Adventure Quest

For this programming assignment, you will unleash your creativity by designing a simple game application using Java. This is an excellent opportunity to practice designing classes, managing data with instance fields, and ensuring encapsulation with constructors and accessors. Also, you'll have fun creating game elements like player movements, scoring systems, and enemy interactions.

### 💀 Deadline

This assignment must be submitted by **Friday, November 10th** to meet the course schedule.

### 👩‍🏫 Instructions

Please read and understand the instructions below thoroughly before attempting the assignment:

Refer to the [assignment submission guidelines](https://your-institute.edu/assignments) for more information.

### 📝 Preparation

Ensure you complete the following preparation to enhance your understanding:

- Read the Java tutorials on [object-oriented principles](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html).
- Familiarize yourself with [scope and variable shadowing](https://www.geeksforgeeks.org/variable-shadowing-in-java/) and the `this` keyword.
  
> **Note:** The provided resources are fundamental to understanding how encapsulation and scope affect the design and functionality of your classes.

### ✅ Learning Goals

By completing this task, you should aim to:
- Design Java classes tailored to game functionality.
- Add and manage instance fields effectively.
- Implement constructor methods to initialize objects.
- Create and use *getters* and *setters* to manage access to private fields.
- Print detailed information to the terminal to track game status.
- Use the `main` method for execution.
- Understand scope and variable shadowing to avoid common pitfalls in Java.

### 🚨 Troubleshooting Guide

If you encounter any problems, follow these steps:

1. Check this week's [posted issues](https://your-institute.edu/help/issues).
2. Post the issue yourself if it has not been discussed.
3. Seek assistance from a TA during lab sessions.

Discuss your challenges with peers but do not share code directly.

### 🎮 Assignment

Welcome to Adventure Quest! In this game, you will script code representing the simple mechanics of player movements, scoring systems, and enemy interactions. Embark on this adventure in Java programming and make your first game come to life!

#### Exercise 1: Designing Game Classes

Start by creating a class called `Player.java`. The `Player` class should have the following instance fields:

- `String` playerName
- `int` score
- `int` playerPositionX
- `int` playerPositionY

Ensure you encapsulate these fields by declaring them as `private`.

#### Exercise 2: Constructor and Main Method

Develop a constructor for the `Player` class to initialize the fields. The constructor should accept parameters for the player's name and starting position.

Implement the `main` method within the `Player` class to demonstrate object creation and initialization. Your `main` method should create a player, set their initial position, and print the player’s initial information to the terminal.

```java
public class Player {
    private String playerName;
    private int score;
    private int playerPositionX;
    private int playerPositionY;

    public Player(String playerName, int startX, int startY) {
        this.playerName = playerName;
        this.score = 0; // default score
        this.playerPositionX = startX;
        this.playerPositionY = startY;
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        hero.printPlayerInfo();
    }
}
```

#### Exercise 3: Getters and Setters

Implement getters and setters for each field in the `Player` class. Ensure each field can be accessed and modified according to the encapsulation principles.

```java
public String getPlayerName() {
    return playerName;
}

public void setPlayerName(String playerName) {
    this.playerName = playerName;
}

// Implement similar getters and setters for score, playerPositionX, and playerPositionY
```

#### Exercise 4: Print Player Information

Add a method `printPlayerInfo()` in the `Player` class to output the player's name, score, and current position to the terminal. 

```java
public void printPlayerInfo() {
    System.out.println("Player: " + getPlayerName());
    System.out.println("Score: " + score);
    System.out.println("Position: (" + playerPositionX + ", " + playerPositionY + ")");
}
```

#### Exercise 5: Basic Interactions (Variable Shadowing)

Next, create another class called `Enemy.java` to represent enemies in the game. Introduce the following fields:

- `String` enemyName
- `int` damagePoints

Test your understanding of scope by introducing variable shadowing. Make sure you know how to resolve it using the `this` keyword.

```java
public class Enemy {
    private String enemyName;
    private int damagePoints;

    public Enemy(String enemyName, int damagePoints) {
        this.enemyName = enemyName; // resolve shadowing with 'this'
        this.damagePoints = damagePoints;
    }
}
```

> **Note:** Reflect on the provided examples and be prepared to explain your understanding of variable shadowing and how you resolved it using the `this` keyword.

### 🎮 Going Beyond

Integrate further by creating a small dialogue between a player and an enemy using the terminal output. Expand on interactions and game functionalities as you see fit!

This is your chance to explore further object-oriented principles and be creative. Unleash your full potential and polish your initial game application with enhanced features!