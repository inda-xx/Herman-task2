# Player Pursuit — A Simple Game

For the second exercise, you will create a simple game application in Java. You will apply your knowledge of object-oriented programming concepts to design a player interacting within an environment filled with enemies. This task will help you understand Java class components more deeply.

### 💀 Deadline

Complete this assignment before our lab session on **Friday 16th September**.

### 👩‍🏫 Instructions

Visit the [assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for submission instructions.

### 📝 Preparation

Ensure you complete and understand the concepts from Module 2 on OLI:

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Sign in at https://kth.oli.cmu.edu/ and use course key `dd1337-ht22`, if not done yet.

### ✅ Learning Goals

This assignment focuses on:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you have issues:

1. Check the [weekly issue tracker](https://gits-15.sys.kth.se/inda-22/help/issues) for similar problems.
2. Submit a new question [here](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Seek help during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).

We encourage discussions with peers but **do not share solutions**!

### 🏛 Assignment

You are tasked to create a simple game using Java classes. The game consists of a player and enemies. The player can move and score points, and interactions with enemies affect the score. Let’s dive into the game creation process!

#### Exercise 1 — Player and Game Fields

In the `src` folder, create a new class named `Player` and another called `Game`. Model the player with the fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY

The `Game` class should have:

- `Player` player
- `List<Enemy>` enemies (Create an `Enemy` class as per instruction)

Example setup:

```java
class Player {
    // Put your fields here!
    
    public static void main(String[] args) {
        Player player = new Player("Explorer", 0, 0, 0);
        System.out.println("Player " + player.getName() + " is at position (" + player.getPositionX() + ", " + player.getPositionY() + ")");
    }
}
```

#### Exercise 2 — Getters and Setters

Implement encapsulation by setting fields to `private` and adding *getters* and *setters*.

Example implementation should allow the following:

```java
player.setPositionX(5);
player.setPositionY(3);
System.out.println("Player position updated to (" + player.getPositionX() + ", " + player.getPositionY() + ")");
```

#### Exercise 3 — Constructor

Streamline object creation with constructors. For example, initialize `Player` with:

```java
public Player(String name, int score, int positionX, int positionY) {
    this.name = name;
    this.score = score;
    this.positionX = positionX;
    this.positionY = positionY;
}
```

Repeat your implementation to efficiently set player attributes during instantiation.

#### Exercise 4 — printInfo() Method

Implement `printInfo()` in the `Player` class for terminal output.

```java
player.printInfo();
// Should print:
// > Player Info:
// > Name: Explorer
// > Score: 0
// > Position: (0, 0)
```

#### Exercise 5 — Enemy Interactions and Scoring

Enhance the game class. An `Enemy` class should have fields and methods:

- `String` type
- `int` positionX
- `int` positionY

Implement a method in the `Game` class for enemy interactions affecting player score. For example, colliding with an enemy decreases the score by one.

```java
public void interact(Player player, Enemy enemy) {
    if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
        player.setScore(player.getScore() - 1);
        System.out.println("Collided with enemy, new score: " + player.getScore());
    }
}
```

#### Exercise 6 — Variable Shadowing

Study the examples and be prepared to discuss variable shadowing and the use of the `this` keyword.

```java
class ShadowExample {
    private int number = 1;

    public void shadowDemo() {
        int number = 2;
        System.out.println("Local variable: " + number);
        System.out.println("Instance variable: " + this.number);
    }
}

public static void main(String[] args) {
    new ShadowExample().shadowDemo();
}
```

### 🌟 Conclusion

Through this project, you will gain practical knowledge on constructing Java applications, object interactions, and better manage object states and methods. Dive in, and let's build a game!