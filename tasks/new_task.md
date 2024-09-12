# Simple Java Game: Brave Explorer

In this exercise, you'll design classes for a simple game application in Java featuring player movement, scoring, and enemy interactions. This assignment is aimed at helping you grasp the mechanics of object-oriented design and coding principles in Java.

### 💀 Deadline

Submit your work by **Friday, 16th September**.

### 👩‍🏫 Instructions

Refer to the [assignment section of the course instructions](https://example.com/course-instructions#assignments) on submission guidelines.

### 📝 Preparation

Read the following materials to prepare:

- [Designing Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Getting Started with Object-Oriented Programming](https://docs.oracle.com/javase/tutorial/java/javaOO/)

#### Essential Concepts:
- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

If you have questions, follow this sequence:

1. Check the [posted issues](https://example.com/help/issues) related to this task.
2. If your question isn't listed, create a [New Issue](https://example.com/help/issues/new).
3. Ask a teaching assistant in person at the [weekly lab](https://example.com/schedule).

Discuss with peers, but **do not share answers**!

### 🏛 Assignment

Embark on a coding journey to build a simple game prototype with three core mechanics: player movement, scoring, and enemy interactions. You'll design three classes: `Player`, `Enemy`, and `Game`. 

#### Example Structure

- **Player** will have position, score, and methods for movement.
- **Enemy** will interact and affect the player's score.
- **Game** will manage interactions and track the game's state.

#### Exercise 1: Designing Classes

Create `Player.java`, `Enemy.java`, and `Game.java` with fields:

- `Player`: `int x, y`, `int score`
- `Enemy`: `int x, y`
- `Game`: `Player player`, `Enemy enemy`

Implement these steps:

1. **Fields**: Initialize variables inside classes.
2. **Print Statements**: Add print statements for field values in `main` methods.
3. **Constructors**: Add constructors for each class to initialize object parameters.

#### Exercise 2: Getters and Setters

Encapsulate fields by making them private. Implement getters and setters:

- Example for Player:
  ```java
  public class Player {
      private int x, y;
      private int score;

      public int getX() { return x; }
      public void setX(int x) { this.x = x; }

      // Similarly, add for y and score.
  }
  ```

- Verify by printing player’s coordinates and score.

#### Exercise 3: Main Method Integration

In `Game.java`, manage invocation:

- Initialize `Player` and `Enemy`.
- Demonstrate movement and score adjustment.
- Use print statements to debug positions and scores.

#### Exercise 4: Variable Shadowing and Scope

Understand variable shadowing by reviewing examples. Fix issues by ensuring correct scope access:

```java
public class Example {
    private int value = 10;

    public void showValue() {
        int value = 5;  // Local variable shadows instance field
        System.out.println(this.value);
    }
}
```

Use such concepts to ensure proper encapsulation and method utilization in your game project.

### Variable Shadowing Examples

Explore scope issues and address using `this`:

```java
public class Example {
    private String name;

    public Example(String name) {
        this.name = name; // Correct usage of 'this' to reference the instance variable
    }

    public void printName() {
        String name = "Temp";
        System.out.println(this.name); // Accesses the instance variable
    }
}
```

**Think carefully about local versus instance scope, avoiding shadowing inadvertently.**

### 🌟 Completion Steps

Test your game to ensure functionality of movement, scoring, and enemy interaction. Compile cleanly and ensure all printouts reflect logical operations.

Good luck, and have fun building your basic game prototype! This is a crucial step in understanding object-oriented programming and Java application design.