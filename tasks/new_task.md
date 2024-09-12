# **Let's Build a Simple Game! 🎮**

For this exercise, we'll dive into object-oriented programming in Java by crafting a simple game application. You'll work on designing Java classes and get hands-on experience with fundamental Java programming concepts.

### 💀 Deadline

This assignment is due by **Friday, 20th October**. Ensure you submit your work before the deadline to avoid any late penalties.

### 👩‍🏫 Instructions

To submit your assignment, please follow the guidelines in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before you begin, make sure you’ve reviewed the OLI materials for Module 3. Completing these will provide you with key insights needed for this assignment:

- Read [Introduction to Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Visit https://kth.oli.cmu.edu/, register, and use the course key `dd1337-ht22` if you have not done so already.

> **NOTE:** Feel free to read ahead in the OLI materials to better understand the topics mentioned.

### ✅ Learning Goals

This assignment will help you achieve the following learning goals:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any issues or have questions, follow these steps:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if other students have similar questions.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title, starting with "Task *x*: *summary of problem*".
3. Ask a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

Collaborate with classmates to discuss the problems but do not share solutions.

### 🏛 Assignment

You're tasked with creating a simple game where a player navigates past enemies, collecting points. Use Java to encapsulate the logic of player movement, scoring, and enemy interactions.

#### Exercise 1: Design Your Classes

Create a new package named `game`. Inside, create three separate classes: `Player.java`, `Enemy.java`, and `Game.java`.

**Player.java** should have the following fields and methods:

- Fields: `String name`, `int score`, `int positionX`, `int positionY`
- Constructor: Initialize all fields.
- Getters & Setters for each field.
- Method `move(String direction)` to update player's position. Print the new position.
  
```java
public class Player {
  private String name;
  private int score;
  private int positionX;
  private int positionY;

  public Player(String name, int positionX, int positionY) {
    this.name = name;
    this.score = 0;
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public void move(String direction) {
    switch (direction.toLowerCase()) {
      case "up": this.positionY++; break;
      case "down": this.positionY--; break;
      case "left": this.positionX--; break;
      case "right": this.positionX++; break;
    }
    System.out.println("Player moved to (" + this.positionX + ", " + this.positionY + ")");
  }

  // Getters and Setters go here
}
```

#### Exercise 2: Enemy Interactions

**Enemy.java** should look like this:

- Fields: `int positionX`, `int positionY`
- Constructor: Initialize the enemy's position.
- Methods: `interact(Player player)` which checks if the enemy is at the same position as the player.
  
```java
public class Enemy {
  private int positionX;
  private int positionY;

  public Enemy(int positionX, int positionY) {
    this.positionX = positionX;
    this.positionY = positionY;
  }

  public void interact(Player player) {
    if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
      System.out.println("Enemy encountered! Player loses 1 point.");
      player.setScore(player.getScore() - 1);
    }
  }

  // Getters and Setters go here
}
```

#### Exercise 3: The Game Class

**Game.java** will serve as the main class:

- Fields: `Player player`, `ArrayList<Enemy> enemies`
- Constructor: Initialize the player and a list of enemies.
- Method `play()`: Moves the player around and checks for interactions.
- Implement a `printStatus()` method within Game to print the game status.

```java
import java.util.ArrayList;

public class Game {
  private Player player;
  private ArrayList<Enemy> enemies;

  public Game(Player player, ArrayList<Enemy> enemies) {
    this.player = player;
    this.enemies = enemies;
  }

  public void play() {
    // Simplified interaction loop
    player.move("right");
    for (Enemy enemy : enemies) {
      enemy.interact(player);
    }
    printStatus();
  }

  private void printStatus() {
    System.out.println("Player Score: " + player.getScore());
  }

  public static void main(String[] args) {
    Player player = new Player("Hero", 0, 0);
    ArrayList<Enemy> enemies = new ArrayList<>();
    enemies.add(new Enemy(1, 0));

    Game game = new Game(player, enemies);
    game.play();
  }
}
```

#### Exercise 4: Understanding Scope and Shadowing

You've been given examples on variable shadowing in previous materials. Observe the code snippet below and resolve the shadowing issues using the `this` keyword, to ensure the correct values are being utilized:

```java
public class Level {
  private int levelNumber = 1;

  public void printLevel(int levelNumber) {
    System.out.println("Current Level: " + levelNumber); // It prints local variable, fix this!
  }

  public static void main(String[] args) {
    Level level = new Level();
    level.printLevel(2);
  }
}
```

> **TIP:** Use `this.levelNumber` to refer to the class-level field `levelNumber`.

With these instructions, your game should be up and running. Remember to explore and experiment with the code to gain deeper insights. Let the games begin! 🎯