# Galactic Battle Arena: Simple Game Development in Java

For this exercise, your mission is to design a simple game in Java that encompasses player movement, a scoring system, and enemy interactions. This assignment will help you apply and integrate essential concepts of Java classes into a game environment.

### 💀 Deadline

The project should be completed by **Friday 30th October**.

### 👩‍🏫 Instructions

To submit your assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting, make sure to review the OLI materials for Module 3:

- [Introduction to Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't enrolled yet, visit https://kth.oli.cmu.edu/ and register using the course key `dd1337-ht22`.

> **Note:** Some materials may vary this year, so feel free to reference additional resources if necessary.

### ✅ Learning Goals

This assignment aims to strengthen your understanding of:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter issues, please follow this procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have similar problems.
2. If not, post your own question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Provide a detailed title beginning with "Task *x*: *summary of problem here*".
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for lab timings.

Remember, you can discuss with peers, but **do not share code**!

### 🏛 Assignment

In this project, you'll simulate a simple game environment where a player maneuvers through a galactic battlefield, interacts with enemies, and accumulates points. Each component of the game should be represented by a Java class with appropriate fields and methods.

#### Exercise 3.0 -- Player Class Design

Create a new class `Player.java` in the `src` folder. This class should have:

- `String` name
- `int` positionX
- `int` positionY
- `int` score

These fields will model the player's attributes: their name, position on a 2D grid, and current score.

#### Exercise 3.1 -- Fields and Constructor

Initialize the player attributes with a constructor:

```java
public class Player {
    // Instance fields
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.positionX = 0;
        this.positionY = 0;
        this.score = 0;
    }
}
```

#### Exercise 3.2 -- Adding Getters and Setters

Implement *getters* and *setters* for each field to promote encapsulation:

```java
// Getters and Setters
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getPositionX() {
    return positionX;
}

public void setPositionX(int positionX) {
    this.positionX = positionX;
}

// Additional getters and setters for other fields...
```

#### Exercise 3.3 -- Printing Player Info

Create a method `printPlayerInfo()` that outputs the player's details to the console:

```java
public void printPlayerInfo() {
    System.out.println("Player: " + name);
    System.out.println("Position: (" + positionX + ", " + positionY + ")");
    System.out.println("Score: " + score);
}
```

#### Exercise 3.4 -- Implementing Movement

Add methods for moving the player:

```java
public void move(int deltaX, int deltaY) {
    this.positionX += deltaX;
    this.positionY += deltaY;
    System.out.println(name + " moved to position (" + positionX + ", " + positionY + ")");
}
```

#### Exercise 3.5 -- Enemy Class Setup

Design another class, `Enemy.java`, to interact with the player. Include fields for position and interaction behavior.

#### Exercise 3.6 -- Scoring System

In the `Player` class, implement a method to update the score:

```java
public void increaseScore(int points) {
    this.score += points;
    System.out.println(name + " scored! Current score: " + score);
}
```

#### Exercise 3.7 -- Game Main Method

Create a `Game.java` class with a `main` method to test your setup by creating a `Player` and interacting with `Enemy` objects:

```java
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        player.printPlayerInfo();
        
        // Move player
        player.move(1, 2);
        
        // Simulate scoring
        player.increaseScore(10);
        
        // Interactions with enemies can be added here
        
        player.printPlayerInfo();
    }
}
```

This should help simulate a basic game loop where the player can move and score, preparing the stage for enemy interactions. As you complete each part, make sure you're using print statements to verify execution and value changes.