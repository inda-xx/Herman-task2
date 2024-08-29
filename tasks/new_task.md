# Let's Build a Mini-Game in Java

For this exercise, you will bring a simple game to life using Java. You'll design the game to include player movement, a scoring system, and interactions with enemies.

### 💀 Deadline

This assignment is due on **Friday, 1st December**.

### 👩‍🏫 Instructions

To understand and submit this assignment, please refer to the [assignments section of the course materials](https://gits-15.sys.kth.se/indac-23/course-instructions#assignments).

### 📝 Preparation

Ensure you have read and understood the following materials in Module 3:

- Review [Designing Classes in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Complete the activities related to [constructors, instance fields, and methods](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)

> **Note:** The syllabus might be slightly updated, so reading ahead is advisable.

### ✅ Learning Goals

This week's goals include:

- Designing Java classes
- Adding instance fields
- Creating a constructor method
- Implementing *getters* and *setters*
- Printing outputs to the terminal
- Utilizing the `main` method
- Understanding and demonstrating scope and *variable shadowing*

### 🚨 Troubleshooting Guide

Here is how to proceed if you encounter issues:

1. Review [this week's posted issues](https://gits-15.sys.kth.se/indac-23/help/issues) to see if others share your query.
2. If your issue is unique, create a [New Issue](https://gits-15.sys.kth.se/indac-23/help/issues/new) with a description, beginning with "Task *x*: *brief problem description*"
3. Discuss with a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDAC).

You are encouraged to discuss with course mates but refrain from sharing solutions.

### 🏛 Assignment

In this assignment, we'll create a mini-game application. You will create Java classes to simulate player movements and interactions with enemies, along with a scoring system.

#### Exercise 3.0 — Player and Enemy Classes

Make a `Player.java` and an `Enemy.java` class with the following **fields**:

- `String` name
- `int` positionX
- `int` positionY
- `int` score for `Player`
- `int` health for `Enemy`

Add **private access** to these fields.

#### Exercise 3.1 — Getters, Setters, and Constructors

Add appropriate **constructors** for both the `Player` and `Enemy` classes, initializing all fields. Implement **getters** and **setters** for each field in both classes.

Example for `Player`:
```java
public class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // initialize score to zero
    }

    // Getters and Setters here
}
```

#### Exercise 3.2 — Player Movement

Implement a method `move(int dx, int dy)` in the `Player` class to change the player's position, updating `positionX` and `positionY`.

#### Exercise 3.3 — Scoring System

Add a method `incrementScore(int points)` in the `Player` class to increase the player's score based on interactions with enemies or other events.

#### Exercise 3.4 — Enemy Interactions

Add a method `interact(Player player)` in the `Enemy` class. Define interactions like decreasing enemy health or reducing player score.

#### Exercise 3.5 — Main Method and Printing

Populate your **`main` method** in a `Game.java` class to create instances of `Player` and `Enemy`, showcase player movements, score increments, and interactions with enemies. Print relevant details to the terminal.

```java
public class Game {
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 10, 10);

        hero.move(5, 5);
        goblin.interact(hero);

        System.out.println(hero.getName() + " is at position (" + hero.getPositionX() + ", " + hero.getPositionY() + ") with score " + hero.getScore());
        System.out.println(goblin.getName() + " has " + goblin.getHealth() + " health left.");
    }
}
```

#### Exercise 3.6 — Variable Shadowing Example

Review and understand the impact of variable shadowing:

```java
public class ShadowExample {
    private int score = 100;

    public void displayScore() {
        int score = 50; // Local variable shadows the instance field
        System.out.println("Local score is: " + score);
        System.out.println("Instance score is: " + this.score);
    }

    public static void main(String[] args) {
        new ShadowExample().displayScore();
    }
}
```

> **Tip:** Use the `this` keyword to access shadowed instance fields.

### 📜 Final Notes

Make sure your code is well-structured, compiling without errors, and logically demonstrating each feature. Keep experimenting and have fun with your mini-game development!