# 🎮 Simple Game: Java Adventure!

For this exercise, you will design and implement a basic game application in Java that showcases fundamental concepts in designing classes, handling player movement, implementing a scoring system, and managing interactions with enemies. You'll familiarize yourself with organizing Java classes, data encapsulation, and using methods like constructors, getters, and setters.

### 💀 Deadline

This assignment should be completed and submitted before **Friday, 30th September**.

### 👩‍🏫 Instructions

For detailed submission instructions, please refer to the [course assignments section](https://example.com/course-instructions).

### 📝 Preparation

Before starting, please review the following Java concepts:

- [Looking Inside Classes](https://example.edu/java-tutorial)
- [Encapsulation, Getters, and Setters](https://example.edu/java-encapsulation)

> **Assistant's Note:** Ensure you're familiar with handling object instances and the concept of variable shadowing in Java.

### ✅ Learning Goals

Through this assignment, you will:

* Design Java classes for game components.
* Add and manage instance fields.
* Implement constructor methods to initialize objects.
* Create and use *getters* and *setters*.
* Print updates and game states to the terminal.
* Utilize the `main` method to drive the application.
* Understand and manage scope and variable shadowing.

### 🚨 Troubleshooting Guide

Encounter any issues? Here’s what you can do:

1. Check the [community issues page](https://example.com/help/issues). Others might have encountered the same issue.
2. If unresolved, post a [New Issue](https://example.com/help/issues/new) with a clear title starting with "Task X: Summary of problem."
3. Reach out to a TA during weekly labs. Check your schedule for timings.

Feel free to discuss ideas with classmates, but **do not share solutions**!

### 🏛 Assignment

Welcome to the wild world of Java Adventure! Your task is to build a basic text-based game featuring characters that can move around, score points, and interact with enemies. Let's start by modeling these entities in Java!

#### Exercise 1.0 -- Game Component Fields

In the `src` folder, create the following Java classes:

1. `Player.java` with fields:
   - `String name`
   - `int score`
   - `int posX`
   - `int posY`

2. `Enemy.java` with fields:
   - `String type`
   - `int posX`
   - `int posY`

3. `Game.java` to run your game logic.

Start by creating the fields. Example code:

```java
public class Player {
    // Define your fields here!
    private String name;
    private int score;
    private int posX;
    private int posY;

    // Constructor, getters, setters, and methods...

    public static void main(String[] args) {
        // Instantiate your player and set meaningful defaults
    }
}
```

#### Exercise 1.1 -- Constructors, Getters, and Setters

Implement constructors to initialize your objects and encapsulate fields with getters and setters. Here's a start:

```java
public class Player {
    private String name;
    private int score;
    private int posX;
    private int posY;

    public Player(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.score = 0; // Default score
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // Add more getters and setters...

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        System.out.println("Player: " + player.getName());
    }
}
```

#### Exercise 1.2 -- Player Movement

Create a method `move(int deltaX, int deltaY)` in the `Player` class to update positions:

```java
public void move(int deltaX, int deltaY) {
    this.posX += deltaX;
    this.posY += deltaY;
}
```

Use `System.out.println` to confirm each movement.

#### Exercise 1.3 -- Scoring System

Implement a method `incrementScore(int points)` to update the player's score and print the updated score.

#### Exercise 1.4 -- Enemy Interactions

Add a method `interact(Player player)` in the `Enemy` class that subtracts points from the player's score when they collide:

```java
public void interact(Player player) {
    if (this.posX == player.getPosX() && this.posY == player.getPosY()) {
        player.setScore(player.getScore() - 10);
        System.out.println("Enemy encounter! Score: " + player.getScore());
    }
}
```

#### Exercise 1.5 -- Variable Shadowing and Scope

Explore variable scoping issues with the provided example:

```java
public class ScopeExample {
    private int value = 42; // Intended value

    public void printValue() {
        int value = 5; // Shadowing issue
        System.out.println("Value: " + value); // Incorrect value!
    }

    public static void main(String[] args) {
        new ScopeExample().printValue();
    }
}
```

Resolve the shadowing issue using `this` keyword where necessary:

```java
public void printValue() {
    int value = 5;
    System.out.println("Value: " + this.value); // Correct context!
}
```

> **Assistant's Note:** Pay special attention to the scope of variables and correct object references in your game logic.

By completing these exercises, you will gain a solid understanding of the core programming concepts essential in Java development. Happy coding and enjoy your Java Adventure! 🚀