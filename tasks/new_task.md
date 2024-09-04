# Maze Runner Game Development

For this exercise, you will develop a simple game application modeled in Java, where players navigate through a maze, encounter enemies, and score points by reaching checkpoints. You will strengthen your understanding of designing Java classes, working with fields, and implementing interactions between game objects.

### 🕑 Deadline

This project should be completed before the exercise, on **Friday 23rd September**.

### 👨‍🏫 Instructions

For instructions on submitting the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📚 Preparation

To effectively complete this assignment, engage with the OLI material for Module 3.

- Read [Object-Oriented Programming Principles](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Ensure you have registered for the course on [OLI](https://kth.oli.cmu.edu/) using the course key `dd1337-ht22`.

> **Assistant's Note:** Module content may slightly vary; feel free to explore beyond specified material if needed.

### 🎯 Learning Goals

This assignment will help you achieve the following learning goals:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding Scope (or *variable shadowing*)

### 🛠 Troubleshooting Guide

If you encounter any issues:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have faced similar problems.
2. Post a new query via a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new), with a descriptive title starting with "Task *x*: *brief problem description*".
3. Visit a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA) session for additional assistance.

Collaboration is encouraged; however, sharing answers verbatim is discouraged.

### 🎮 Assignment

In this assignment, you're tasked with creating a simple Maze Runner game in Java. The game features a player navigating a maze, collecting points, and avoiding or confronting enemies.

#### Exercise 3.0 -- Designing the Classes

Create three classes: `Player`, `Enemy`, and `Game`.

1. **Player Class:**

    - **Instance Fields**: `String name`, `int score`, `int positionX`, `int positionY`
    - **Methods**: 
      - Constructor to initialize the player's name and starting position
      - Getter and setter methods for each field

2. **Enemy Class:**

    - **Instance Fields**: `String type`, `int positionX`, `int positionY`
    - **Methods**:
      - Constructor to initialize the enemy type and position
      - Getter and setter methods for each field

3. **Game Class:**

    - **Methods**:
      - `public static void main(String[] args)` to instantiate Player and Enemy objects, initiate game logic, and interact with user input

Ensure proper encapsulation through private fields and public accessor/mutator methods. Use the `main` method for instantiating objects and operating game logic.

#### Exercise 3.1 -- Implementing Player Movement

Enhance the `Player` class to include:

- **Method**: `move(String direction)`, which changes the player's coordinates based on the input direction (i.e., "up", "down", "left", "right").
- Within the `main` method, implement a simple loop to take keyboard input for player movement and print position updates to the terminal.

#### Exercise 3.2 -- Scoring System

Incorporate a scoring mechanism:

- **Method in Player Class**: `increaseScore(int points)`, increasing the player’s score.
- Each time the player reaches a checkpoint, called from `main`, invoke `increaseScore()` and print the updated score.

#### Exercise 3.3 -- Enemy Interaction

Implement a basic enemy interaction feature:

- **Method in Game Class**: `checkForEnemies()`, which checks the player's position against enemy positions.
- If an enemy is at the player's position, print "Enemy encountered!" to the terminal.

#### Exercise 3.4 -- Printing Game State

Implement a `printGameState()` method in the `Game` class to print the current game state, including player position, score, and presence of nearby enemies.

#### Exercise 3.5 -- Understanding Variable Shadowing

Analyze and resolve the following variable shadowing case from your game. Consider using `this` keyword to distinguish between instance fields and parameters:

```java
public class Maze {
    private int width = 10;

    public void resize(int width) {
        width = width * 2; // Incorrectly modifies the parameter, not the instance field
        System.out.println("Maze width: " + this.width); // Use 'this.width' to reference the field
    }

    public static void main(String[] args){
        new Maze().resize(5);
    }
}
```

Reflect on how variable shadowing impacts your game's logic and adjust accordingly using `this`.

> **Assistant's Note:** Distinguish between local variables and instance fields for accurate code functionality.