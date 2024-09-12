# Create Your Own Simple Game in Java!

Welcome to this exciting exercise where you will design a simple game application in Java! The game will incorporate player movement, a scoring system, and enemy interactions. Throughout this task, you will enhance your understanding of Java by designing classes, adding instance fields, creating constructor methods, using getters and setters, printing outputs to the terminal, utilizing the `main` method, and exploring variable scope or shadowing.

### 💀 Deadline

This work should be completed before the exercise on **Friday 25th November**.

### 👩‍🏫 Instructions

For submission guidelines, please refer to the [assignments section of your course instructions](https://gits-15.sys.kth.se/your-course-id).

### 📝 Preparation

Make sure to complete the readings from the assigned OLI modules to familiarize yourself with the concepts:

- [Designing Classes and Objects](https://your-oli-platform.example.com/designing-classes-and-objects)
- Create an account at [your-oli-platform.example.com](https://your-oli-platform.example.com) and register using the course key `javaclass-23`.

> **Assistant's Note:** Keep up with the readings even if the OLI materials slightly vary this year.

### ✅ Learning Goals

By the end of this assignment, you should be able to:

* Design Java classes with appropriate fields and methods.
* Integrate instance fields into classes.
* Construct and utilize constructor methods.
* Create and use getters and setters.
* Print information to the terminal.
* Apply the `main` method in a Java class.
* Understand and explain variable scope and shadowing.

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/your-course-id/help/issues) for similar problems faced by your peers.
2. If unresolved, post your query by creating a [New Issue](https://gits-15.sys.kth.se/your-course-id/help/issues/new). Begin with "Task *x*: *problem summary*".
3. Seek assistance from a TA during the [weekly lab sessions](https://queue.csc.kth.se/Queue/YOUR-COURSE-NAME).

Collaboration is encouraged, but **do not share solutions**!

### 🏛 Assignment

This assignment will revolve around creating a basic game in Java with functionalities like player movement, scoring, and enemy interaction. Let's walk through the exercises to achieve this:

#### Exercise 1.0 -- Create Player Class

In the `src` folder, create a new class named `Player.java`. This class should have the following fields to represent a player in the game:

- `String` name
- `int` score
- `int` posX (player's position on the X-axis)
- `int` posY (player's position on the Y-axis)

Use the following snippet to structure your class:

```java
public class Player {
    private String name;
    private int score;
    private int posX;
    private int posY;

    // Constructor
    public Player(String name, int posX, int posY) {
        this.name = name;
        this.score = 0; // Score starts at 0
        this.posX = posX;
        this.posY = posY;
    }

    // Getters and Setters
    // Implement getPlayerName, setPlayerName, getScore, addScore, getPosition, etc.

    public void printPlayerInfo() {
        System.out.println("Player: " + name + " Position: (" + posX + ", " + posY + ") Score: " + score);
    }

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        player1.printPlayerInfo();
    }
}
```

#### Exercise 1.1 -- Getters and Setters

Encapsulate the fields by setting them to `private` and create getters and setters for each field. Here's an example of what that might look like:

```java
public String getPlayerName() {
    return name;
}

public void setPlayerName(String name) {
    this.name = name;
}

// Likewise for score, posX, and posY.
```

Complete the setters and getters for all instance fields in the `Player` class.

#### Exercise 1.2 -- Implement Enemy Class

Similarly, create a `Enemy` class with fields representing `String` enemyType, `int` posX, and `int` posY. Implement constructors, getters, and setters.

#### Exercise 1.3 -- Scoring and Interaction

Modify your `Player` class to include methods that interact with an enemy. Implement a `public void interact(Enemy enemy)` method where encountering an enemy increases the player's score by 10.

#### Exercise 1.4 -- Explore Scope and Variable Shadowing

Analyze the concept of variable scope and shadowing using this example:

```java
public class ScopeExample {
    private int value = 10; // Instance field

    public void demonstrateScope() {
        int value = 20; // Local variable
        System.out.println("Local Value: " + value);
        System.out.println("Instance Value: " + this.value);
    }

    public static void main(String[] args) {
        new ScopeExample().demonstrateScope();
    }
}
```

Examine how the `this` keyword is used to differentiate between local and instance variables.

> **Assistant's Note:** Pay careful attention to when variables shadow each other and how you can use the `this` keyword to access instance variables within a method with a shadowing local variable.

### ⚔️ Apply Your Skills

Maintain an organized codebase and comment on your methods for clarity. Once completed, feel free to expand the game by adding more complexities and functionalities like boundaries, multiple players, or different enemy behaviors.

Happy coding, and may the odds be ever in your favor 🍀!