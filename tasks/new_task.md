# Simple Adventure Game

For this assignment, your objective is to create a simple game application in Java where players can move through a world, interact with enemies, and score points. This task will help you practice fundamental object-oriented programming concepts in Java by designing classes and using instance fields, constructors, getters, and setters. By the end of this assignment, you will have a basic understanding of how to structure a Java application and apply encapsulation effectively.

### 💀 Deadline

This work should be completed by **Friday, October 15th**.

### 👩‍🏫 Instructions

For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://example-university.edu/assignments).

### 📝 Preparation

Make sure to read the following materials before starting the assignment:

- [Designing Java Classes](https://java-course.example-university.edu/designing-classes)
- [Java Constructors](https://java-course.example-university.edu/java-constructors)
- [Getters and Setters](https://java-course.example-university.edu/getters-setters)

### ✅ Learning Goals

This assignment will cover:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

If you encounter any difficulties, follow these steps:

1. Check this week's [discussion board](https://discussion.example-university.edu) for similar issues.
2. Post your question with a detailed description on the [forum](https://forum.example-university.edu).
3. Contact your TA during the lab hours as per the schedule on the course site.

### 🏛 Assignment Overview

Your mission is to create a simple adventure game where the player can move through the world, encounter enemies, and earn points. Your challenge is to model these interactions in Java using object-oriented design principles.

#### Exercise 1: Game Classes

In the `src` folder, create classes `Player` and `Enemy`.

- `Player` class should have the following private fields:
  - `String name`
  - `int score`
  - `int position`
  
- `Enemy` class should have the following private fields:
  - `String type`
  - `int position`
  - `int attackPower`

For both classes, implement the necessary constructor methods to initialize these fields.

#### Exercise 2: Getters and Setters

Encapsulate your classes by making all fields private and providing public getters and setters for each field.

- Ensure that each class includes getters and setters for all attributes.
- Use setters to modify the fields and getters to retrieve their values.
  
Example for `Player`:

```java
public class Player {
    private String name;
    private int score;
    private int position;
    
    public Player(String name, int startPosition) {
        this.name = name;
        this.score = 0;
        this.position = startPosition;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    public int getPosition() {
        return position;
    }
    
    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
    }
}
```

#### Exercise 3: Player Movement and Enemy Interaction

Implement methods that allow a player to move and interact with enemies.

- Add a method `move(int steps)` in the `Player` class to update the `position`.
- Add a method `interact(Player player)` in the `Enemy` class, which prints a combat encounter message and decreases the player's score based on the enemy's `attackPower`.

#### Exercise 4: Printing to the Terminal

Add a method `printStatus()` for both the player and enemy to display their current state to the terminal. This should use the relevant getter methods to retrieve the fields.

```java
public void printStatus() {
    System.out.println("Player " + name + " at position " + position + " has score " + score);
}
```

#### Exercise 5: The Main Method

Create a `Game` class with a `main` method to initiate the game. Instantiate a `Player` and an `Enemy`, and demonstrate their interactions.

```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0);
        Enemy goblin = new Enemy("Goblin", 5, 10);

        player.move(5);
        player.printStatus();
        
        goblin.interact(player);
        player.printStatus();
    }
}
```

#### Exercise 6: Variable Shadowing

Review the following example and understand the concept of variable shadowing. Explain why the code does not work as expected and how it can be fixed.

```java
public class Example {
    private int number = 10;

    public void printNumber() {
        int number = 5;
        System.out.println(number); // Expected to print the instance variable, but prints 5
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.printNumber(); // Discuss why it doesn't print the field value 10
    }
}
```

> **Note:** Pay attention to how Java handles local and instance variables, and use the `this` keyword when required.

---

Complete each exercise by integrating the concepts of classes, fields, methods, and scope. Keep your code organized and make sure to test each part thoroughly. Enjoy building your adventure game!