# 🕹️ Simple Adventure Game!

For this exercise in our introductory programming course, you'll design and implement a simple text-based adventure game in Java. The task will help you become familiar with designing Java classes, manipulating objects, and managing simple game mechanics.

### 🎯 Objective

You will create a text-based game featuring a player, scoring system, and enemy interactions. The game will be minimalistic but will include key features of game design: player movement, a scoring system, and enemy interactions.

### 📅 Deadline

Complete this assignment by **Friday, November 17th**.

### 📚 Preparation

To best prepare for this task:

- Review the course materials about [Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Complete the OLI Module on [Java programming basics](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).

### 🧠 Learning Goals

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Scope (or *variable shadowing*)

### 📋 Instructions

In this assignment, you'll model objects in a simple game world. The main components of the game will be the **Player** and **Enemy** classes, each with specific attributes and interactions.

#### 🎮 Game Overview

In the game, the player can move around in a simple grid, score points, and encounter enemies. The player can gain points by collecting treasures and defeating enemies.

---

### 📝 Assignment

#### Exercise 1.0 -- Defining Classes and Fields

In the `src` folder, create a class called `Player`. Define the following fields:

- `String` name
- `int` score
- `int` health
- `int[]` position (e.g., `[0, 0]` for x, y coordinates)

Additionally, create a class called `Enemy` with similar fields but without score. Add a field `int` strength.

#### Exercise 1.1 -- Getters and Setters

Implement *getters* and *setters* for each field in both `Player` and `Enemy` classes. This ensures encapsulation and controlled access to the fields.

If executed correctly, the main method in the example below should compile:

```java
public class Game {

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 100, new int[]{0, 0});
        Enemy enemy = new Enemy("Goblin", 50, new int[]{1, 1});

        player.setScore(10);
        enemy.setStrength(5);

        System.out.println("Player: " + player.getName() + ", Score: " + player.getScore());
        System.out.println("Enemy: " + enemy.getName() + ", Strength: " + enemy.getStrength());
    }
}
```

#### Exercise 1.2 -- Constructors

Introduce constructors in both `Player` and `Enemy` classes to initialize the fields.

Example constructor for Player:

```java
public Player(String name, int score, int health, int[] position) {
    this.name = name;
    this.score = score;
    this.health = health;
    this.position = position;
}
```

Update the main method to utilize these constructors when creating objects.

#### Exercise 1.3 -- Player Movement

Implement a `move` method in your `Player` class that updates the player's position on a 2D grid. The method might look something like this:

```java
public void move(int deltaX, int deltaY) {
    this.position[0] += deltaX;
    this.position[1] += deltaY;
}
```

Incorporate print statements to display the player's new position in the terminal.

#### Exercise 1.4 -- Scoring System

Enhance the player's interaction by collecting points. Implement a method called `collectPoints` in the Player class:

```java
public void collectPoints(int points) {
    this.score += points;
    System.out.println(name + " collected " + points + " points! Total score: " + score);
}
```

#### Exercise 1.5 -- Enemy Interactions

Create a method for enemy interactions, `encounterEnemy`:

```java
public void encounterEnemy(Enemy enemy) {
    this.health -= enemy.getStrength();
    if (this.health <= 0) {
        System.out.println(name + " was defeated by " + enemy.getName());
    } else {
        System.out.println(name + " encountered " + enemy.getName() + " and survived! Health: " + this.health);
    }
}
```

#### Exercise 1.6 -- Variable Shadowing

Explore variable shadowing through a small snippet. Observe and correct if necessary:

```java
class ShadowExample {
    private int number = 10;

    public void demonstrateShadowing() {
        int number = 20;
        System.out.println("Local number: " + number); // prints the local variable
        System.out.println("Instance number: " + this.number); // prints the instance variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.demonstrateShadowing();
    }
}
```

By completing this task, you will have created a fundamental game structure using Java. This project helps establish a strong foundation in object-oriented programming principles and prepares you for more complex game development tasks.

---

### 🚨 Troubleshooting Guide

Follow these steps if you encounter issues:

1. Review the [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have encountered similar problems.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title.
3. Seek help in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Remember, collaboration is encouraged, but sharing direct solutions is not allowed.

Happy coding and enjoy developing your adventure game!