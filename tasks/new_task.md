# 🎮 Simple Game Application: Java Adventures!

Welcome to your exciting journey into game development with Java! In this task, you'll create a simple game that simulates a player's movement, scores tracking, and interactions with enemies. Through this project, you'll refine your skills in Java, focusing on essential concepts like class design, instance fields, constructors, getters and setters, and more. Ready your keyboards, and let's begin!

### 📅 Deadline

Please complete this assignment before **Friday, 23rd September**.

### 📜 Instructions

Submit your assignment by following the detailed guidelines in the [assignments section of the course instructions](https://your-course-url.com).

### 🏆 Learning Goals

This week's learning objectives include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🔍 Preparation

Ensure you're well-prepared by reviewing the materials below:

- Read [Understanding Java Classes](https://java-course-materials-url).
- Complete the exercises in Module 3 on [Encapsulation and Constructors](https://java-course-materials-url).

> **Note:** These materials are crucial for completing the assignment successfully.

### 🚨 Troubleshooting Guide

If you encounter any issues, follow this procedure:

1. Consult [this week's questions](https://course-issues-url). Maybe others have already encountered your issue.
2. If you don't find your problem, create a [New Issue](https://course-issues-url/new). Clear titles help, e.g., "Task 3: Problem with player movement".
3. Ask a TA during lab hours. Check your schedule for session timings.

Discuss with peers for clarity, but avoid sharing exact solutions!

### 🎮 Assignment

In this task, you're tasked with building a simple text-based game using Java. The game involves a player character navigating their environment while avoiding and interacting with enemies. Let's dive into the details:

#### Exercise 3.0 -- The Game World

Create a new class called `GameWorld.java`. This class should model the game world, including basic settings like the player's starting coordinates and initial score.

- **Fields**: Define instance fields for player position (`int` x, `int` y), score (`int`), and any other relevant properties (e.g., list of enemies).

- **Main Method**: Initialize the game world and print a welcome message.
  
```java
public class GameWorld {
    // Instance fields
    private int x, y;
    private int score;

    public static void main(String[] args) {
        // Create an instance of the game world
        GameWorld game = new GameWorld();

        // Print the initial state
        System.out.println("Welcome to Java Adventures! Starting at: " + game.getX() + ", " + game.getY());
        System.out.println("Initial Score: " + game.getScore());
    }

    // Constructor and methods will be added in further exercises
}
```

#### Exercise 3.1 -- Player Class

Create a `Player` class to represent the player character in the game.

- **Fields**: Add fields for name (`String`), health (`int`), and position (`int` x, `int` y).

- **Constructor**: Initialize fields with parameters. Implement constructors to facilitate player initialization.

- **Getters and Setters**: Ensure all fields have appropriate accessors and mutators.

```java
public class Player {
    private String name;
    private int health;
    private int x, y;

    public Player(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement other getters and setters
}
```

#### Exercise 3.2 -- Player Movement

Implement methods in the `Player` class to control movement.

- **move(int dx, int dy)**: Adjust the player's position. Demonstrate usage in the `main` method of `GameWorld`.

```java
// Inside class Player
public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
    System.out.println(name + " moved to: " + x + ", " + y);
}
```

#### Exercise 3.3 -- Scoring System

Add scoring functionality to `GameWorld`.

- **Methods**: Implement methods to increase/decrease the score and print to the terminal.

```java
// Inside class GameWorld
public void increaseScore(int points) {
    this.score += points;
    System.out.println("Score increased by " + points + ". Current score: " + score);
}
```

#### Exercise 3.4 -- Enemies and Interactions

Create an `Enemy` class with fields similar to `Player`. Implement interactions such as attacks.

- **Enemy Class**: Include fields like name, health, position.
- **Interaction**: Create attack methods in both `Player` and `Enemy`, with actions printing out results.

```java
public class Enemy {
    // Similar fields and methods as Player
    // Implement interaction logic
}
```

#### Exercise 3.5 -- Variable Shadowing

Explore and solve issues related to variable shadowing. Modify examples to demonstrate understanding using the `this` keyword.

```java
public class ShadowExample {
    private int number = 10; // I want this number printed

    public void printNumber() {
        int number = 20;
        System.out.println(this.number); // Use 'this' to access instance field
    }

    // Implement in main method
}
```

Good luck, and enjoy your coding adventure! Remember, successful games are a blend of creativity and strong programming. Happy coding! 🎮