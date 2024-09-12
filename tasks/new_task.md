# Game On! Simple Java Game Development

For this exercise in your Java programming journey, you will engage in designing a simple game application. The focus is on modeling the elements of the game using Java classes and fundamental concepts like player movement, scoring, and interactions with enemies.

### 💀 Deadline  

This programming task should be completed before the exercise on **Friday 23rd September**.

### 👩‍🏫 Instructions

For instructions on how to complete and submit the assignment, please see the [assignments section of the course instructions](https://example.com/course-instructions#assignments).

### 📝 Preparation

You must read and understand the concepts of Java classes and objects.

- Read [Understanding Classes and Objects](https://example.com/module-2)
- Ensure you are signed up and registered for the course with the key `dd1337-ht23`.

> **Assistant's Note:** The course materials might differ slightly this year, so ensure you cover the necessary readings.

### ✅ Learning Goals

This week's learning goals include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide  

If you encounter any issues:

1. Check this week's [posted issues](https://example.com/help/issues). Have fellow students asked about your problem?
2. If not, post a query by creating a [New Issue](https://example.com/help/issues/new). Provide a descriptive title, beginning with "Task *x*: *summary of issue*."
3. Ask a teaching assistant in person during the [weekly lab](https://queue.example.com/Queue/Program). Refer to your schedule for the next lab.

Collaborate with peers but **do not share solutions**!

### 🏛 Assignment

In this task, you will create a simple game involving a player character that moves within a defined area, collects points and interacts with enemies. This exercise will familiarize you with designing Java classes representing various aspects of a basic game.

#### Exercise 1 -- GameObjects

In the `src` folder, create a new class called `GameObject.java`. This class will represent any entity within the game, such as the player or an enemy. It should have the following fields:

- `String` name
- `int` x
- `int` y

Here's a basic structure using these fields:

```java
public class GameObject {
    
    private String name;
    private int x;
    private int y;
    
    // Create getters and setters for the fields

    // Implement a constructor for the GameObject class

    // A method to print object info
    public void printInfo() {
        System.out.println("Name: " + name + ", X: " + x + ", Y: " + y);
    }
    
    public static void main(String[] args) {
        // Test the GameObject class
        GameObject player = new GameObject("Player", 0, 0);
        player.printInfo();
    }
    
}
```

#### Exercise 2 -- Player

Create a `Player` class extending `GameObject`:

- **Objectives:**
  - Implement movement (change of `x` and `y` coordinates)
  - Include score tracking with an `int` score field

```java
public class Player extends GameObject {
    
    private int score;

    public Player(String name, int x, int y) {
        super(name, x, y);
        this.score = 0;
    }
    
    // Implement getters and setters for score

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        // Use this keyword to avoid variable shadowing issues
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }

    // A method to print player info
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        player.move(5, 7);
        player.printInfo();
    }
}
```

#### Exercise 3 -- Enemy

Create an `Enemy` class extending `GameObject`, with:

- **Objectives:**
  - Simple interaction with the player

```java
public class Enemy extends GameObject {
    
    public Enemy(String name, int x, int y) {
        super(name, x, y);
    }

    // Method to interact with the player
    public void interact(Player player) {
        System.out.println("Enemy " + this.getName() + " battles with " + player.getName());
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Villain", 10, 10);
        enemy.interact(player);
    }
}
```

#### Exercise 4 -- Variable Shadowing

Consider the `VariableShadowing` class below to understand the impact of shadowing and address potential issues:

```java
public class VariableShadowing {

    private int health = 100;

    public void displayHealth() {
        int health = 50; // This local variable shadows the instance field
        System.out.println("Health: " + health); // Prints the local variable's value
    }

    public static void main(String[] args) {
        VariableShadowing vs = new VariableShadowing();
        vs.displayHealth();
    }
}
```

> **Assistant's Note:** Reflect on the differences between instance fields and local variables. Consider how `this` could be used to avoid variable shadowing.

Explore these exercises to develop a comprehensive understanding of Java class structures, encapsulation practices, and how to manage scope and potential shadowing issues.