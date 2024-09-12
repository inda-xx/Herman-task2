# Simple Java Game Application

For this exercise, you will design a basic game application using Java. This task will help you get hands-on experience with designing Java classes, adding fields and methods, and managing object interactions. 

### 🧑‍💻 Instructions

For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

### 📚 Preparation

Before you begin, review the following materials to understand the key concepts:

- Read about [Designing Classes in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html)
- Understand how to [Create Fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html), and use [The Constructor Method](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- Review how to create [Getters and Setters](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html), and issues relating to [Scope and Shadowing](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html)

### 🎯 Learning Goals

This week's learning goals include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you have any questions or problems, follow this procedure:

1. Look at this week's [issues page](https://example.com/issues) to see if your problem has already been addressed.
2. If not, post a question by creating a [New Issue](https://example.com/issues/new). Include a descriptive title.
3. Ask a TA during the [weekly lab](https://example.com/lab_queue).

Discuss with your peers, but **do not share answers**!

### 🚀 Assignment

Create a simple Java game application with core functionalities: player movement, scoring system, and enemy interactions.

#### Exercise 1.0 -- Designing Classes and Fields

- Create a class named `Player` with the following fields:
  - `String` name
  - `int` score
  - `int` xPosition
  - `int` yPosition

- Create a class named `Enemy` with the following fields:
  - `String` type
  - `int` xPosition
  - `int` yPosition

#### Exercise 1.1 -- Constructor Method

- Implement constructors for `Player` and `Enemy` that initialize these fields via parameters.

#### Exercise 1.2 -- Getters and Setters

- Add getters and setters for each field in the `Player` and `Enemy` classes.

#### Exercise 1.3 -- Printing Information

- Add a method `printInfo()` in `Player` and `Enemy` that prints all fields to the terminal in a readable format.

```java
public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Score: " + score);
    System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
}
```

#### Exercise 1.4 -- Basic Movement

- Add a method `move(int x, int y)` in the `Player` class to update player position and print the new position.

#### Exercise 1.5 -- Tracking Score

- To the `Player` class, add a method `increaseScore(int points)` that updates the score and prints the new score.

#### Exercise 1.6 -- Enemy Interaction

- To simulate interaction, let the player `move` or `attack`:
  - Add an `attack(Enemy enemy)` method in `Player` that randomly increases player's score and prints a message.

### ⚔️ Example Usage:

```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Alice", 0, 0, 0);
        Enemy enemy = new Enemy("Goblin", 5, 5);

        player.printInfo();
        player.move(1, 2);
        player.attack(enemy);
        player.increaseScore(10);
    }
}
```

#### Exercise 1.7 -- Variable Shadowing

- Explore variable shadowing with the following example. Explain in class how to fix these issues, and be prepared to discuss the role of `this`:

```java
public class ShadowExample {
    private String name = "Player";

    public void printShadow() {
        String name = "Local Player";
        System.out.println(name); // Displays the local variable
    }
}
```

### ⚡ Deadline

Please complete this assignment by **Friday, 23rd March**.