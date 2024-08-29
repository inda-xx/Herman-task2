# Let's Build a Simple Game in Java!

For this exercise, you're going to design and implement a simple game application in Java. Your game will feature player movement, a scoring system, and interactions with enemies. Throughout this project, you'll enhance your understanding of Java programming by focusing on important concepts such as defining classes, using instance fields, constructor methods, getters and setters, and understanding variable scope.

### 💀 Deadline

Please make sure to complete this assignment by **Friday 30th November**.

### 👩‍🏫 Instructions

Make sure to submit your completed assignment according to the guidelines provided in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation

Before starting, review the relevant chapters in your course material:

- Read [Understanding Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f3e4e598ac3f088812a2b7de315bac70)
- If needed, visit https://kth.oli.cmu.edu/ and register with the course key `dd1337-ht23`.

> **Assistant's Note:** Some materials might differ slightly this year, so it is okay to explore beyond the given materials.

### ✅ Learning Goals

By completing this assignment, you will:

* Design Java classes
* Add instance fields
* Implement constructor methods
* Develop *getters* and *setters*
* Print messages to the terminal
* Use the `main` method effectively
* Work with variable scope, avoiding *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any issues, here are the steps to resolve them:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues) to see if others have experienced similar problems.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with a concise title that begins with "Task *n*: *summary of problem here*."
3. Consult a TA during [weekly labs](https://queue.csc.kth.se/Queue/INDA) for in-person help. Refer to your schedule for the next lab session.

Feel free to discuss concepts with classmates, but remember **no sharing of actual code answers**!

### 🏛 Assignment

In this project, you'll build a text-based game with the following components:

- **Player Class**: Model a player character who can move around and interact with enemies.
- **Game Logic**: Implement a simple scoring system and enemy interactions.

Below are the tasks you'll need to complete. The tasks emphasize understanding Java object-oriented patterns and practices.

#### Task 1: Design the Player Class

In the `src` folder, create a new Java class named `Player.java`. This class should have the following instance fields:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`

Add a constructor to initialize these fields when a new `Player` object is created.

```java
public Player(String name, int startX, int startY) {
    this.name = name;
    this.xPosition = startX;
    this.yPosition = startY;
    this.score = 0;
}
```

#### Task 2: Add Getters and Setters

Make sure the fields are encapsulated by setting them to `private`. Create and implement getter and setter methods for each field.

For example:
```java
public String getName() {
    return this.name;
}

public void setScore(int score) {
    this.score = score;
}
```

#### Task 3: Implement Player Movement

Add methods to handle player movement. These methods should update the player's position.

```java
public void moveUp() {
    this.yPosition += 1;
}

public void moveDown() {
    this.yPosition -= 1;
}
```

#### Task 4: Enemy Interaction

Implement an `interactWithEnemy` method in the `Player` class. This method should decrease the player's score if they encounter an enemy.

```java
public void interactWithEnemy() {
    System.out.println(name + " encountered an enemy!");
    this.score -= 10;
}
```

#### Task 5: The Main Method

Include a `main` method that instantiates a `Player`, simulates some movements and interactions, and prints out the player’s state to the terminal.

```java
public static void main(String[] args) {
    Player player = new Player("Hero", 0, 0);
    
    player.moveUp();
    player.moveRight();
    
    System.out.println("Player Position: (" + player.getXPosition() + ", " + player.getYPosition() + ")");
    player.interactWithEnemy();
    System.out.println("Score: " + player.getScore());
}
```

#### Task 6: Variable Shadowing

Examine the following example, understand how variable shadowing can occur, and be ready to discuss it:

```java
class Example {
    private int value = 10;

    public void printValue() {
        int value = 20;
        System.out.println(value); // What will this print?
    }
    
    public static void main(String[] args) {
        new Example().printValue();
    }
}
```

Use these insights to ensure your program uses instance fields and variables appropriately, making good use of the `this` keyword to distinguish scope.

> **Assistant's Note:** Be thoughtful about the use of local and global variables. Make sure you are not unintentionally shadowing variables.

This assignment will strengthen your understanding of Java's object-oriented principles and help you apply them to implement game logic. Enjoy building your game!