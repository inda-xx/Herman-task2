# Simple Java Game: Your Adventure Begins!

For this assignment, you will create a simple text-based game application in Java. The game will feature essential elements of any adventure: player movement, a scoring system, and interactions with enemies. This exercise will enhance your skills in Java class design and object-oriented programming (OOP).

### 💀 Deadline

This assignment should be completed before the exercise, on **Friday 16th October**.

### 👩‍🏫 Instructions

For instructions on how to submit your assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting, read and answer the questions in the OLI material for Module 3:

- Read [Classes and Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't signed up, go to https://kth.oli.cmu.edu/, and register with the course key `dd1337-ht22`.

### ✅ Learning Goals

This week's learning goals include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (variable shadowing)

### 🚨 Troubleshooting Guide

Should you encounter any issues, follow this procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if other students have similar problems.
2. If not, post a new question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Use a descriptive title that begins with "Task *x*: *summary of problem here*"
3. Seek assistance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for lab times.

Discuss with peers, but **do not share solutions!**

### 🏛 Assignment

Welcome to your Java game adventure! In this task, you will model a simple game scenario with players and enemies using Java. Your main objectives are to implement game features like movement, scoring, and enemy interactions. Let's start your journey:

#### Exercise 1.0 -- Fields and Class Design

In the `src` folder, create a new class called `Player.java`. The `Player` class should have:

- `String` name
- `int` score
- `int` positionX
- `int` positionY
- `boolean` isAlive

Similarly, create another class called `Enemy.java`. The `Enemy` class should have:

- `String` type
- `int` positionX
- `int` positionY
- `int` damage

This exercise focuses on defining the blueprint for your game characters. 

#### Exercise 1.1 -- Constructor and Object Creation

Implement constructor methods for both `Player` and `Enemy` classes to initialize the objects with specific values upon creation.

```java
public class Player {
    // Fields here

    // Constructor
    public Player(String name, int positionX, int positionY) {
        // Initialize fields
    }
}

public class Enemy {
    // Fields here

    // Constructor
    public Enemy(String type, int positionX, int positionY, int damage) {
        // Initialize fields
    }
}
```

#### Exercise 1.2 -- Getters and Setters

For each class, add appropriate **getters** and **setters** for all fields. This will help in maintaining encapsulation and allow controlled access to your object data.

#### Exercise 1.3 -- Player Movement

Implement a method in `Player.java` called `move(int deltaX, int deltaY)` which changes the player's position. Ensure to update the player's position accurately and print out the new coordinates.

```java
public void move(int deltaX, int deltaY) {
    // Update position
    // Print new position
}
```

#### Exercise 1.4 -- Scoring System

Update the `Player` class to handle scoring. Create a method `incrementScore(int points)` to add to the player's score and print the new score.

#### Exercise 1.5 -- Enemy Interaction

Add a method in `Enemy.java` called `interact(Player player)` to interact with players. When a player interacts with an enemy, the player's score should decrease by the enemy's damage if a certain condition is met (e.g., same position).

#### Exercise 1.6 -- Printing Information

Implement a `printInfo()` method in both `Player` and `Enemy` classes to display all current field values. Use this method as a tool to observe changes and debug your application.

#### Exercise 1.7 -- Scope and Variable Shadowing

Review the following examples and be prepared to discuss variable shadowing. Analyze which variables are causing shadowing issues and how to resolve them:

```java
public class ShadowExample {
    private int value = 10;

    public void shadowingMethod() {
        int value = 5;
        System.out.println("Shadowed value: " + value);
    }
}
```

```java
public class Character {
    private String name;

    public Character(String name) {
        name = name;
    }

    public void display() {
        System.out.println("Character name: " + name);
    }
}
```

> **Assistant's Note:** Reflect on variable scope and the `this` keyword to understand how to fix shadowing problems.

With these exercises, you'll build a solid understanding of Java classes while creating an engaging game scenario. Assemble your code and prepare to test your application in the `main` method. Embrace the challenge, and happy coding!