# 🍄 AdventureQuest: Java Edition

For this exercise, you will design a simple game application in Java centered around developing an understanding of Java classes and their components. Follow the instructions to implement a game that features player movement, a scoring system, and interactions with enemies.

### ⏰ Deadline

This assignment is due before class on **Friday, 20th October**.

### 📋 Instructions

For instructions on submission and additional information, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📚 Preparation

Familiarize yourself with the basics of object-oriented programming in Java by reading the following:

- [Understanding Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Learning about Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Getters and Setters](https://docs.oracle.com/javase/tutorial/javabeans/writing/properties.html)

> **Assistant's Note:** It's advisable to read ahead if you find some material missing or wish to deepen your understanding.

### 🎯 Learning Goals

By the end of this exercise, you will be able to:

- Design Java classes
- Add instance fields
- Create constructor methods
- Use *getters* and *setters*
- Print information to the terminal
- Work within the `main` method
- Understand scope and variable shadowing

### 🆘 Troubleshooting Guide

If you encounter issues:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues) to see if your question has already been answered.
2. If your question remains unresolved, post a new question via a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new). Please include a descriptive title.
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for lab times.

We encourage discussions with peers, but **do not share solutions**!

---

## 🕹 Assignment: Craft Your Game

You're tasked with creating a simple adventure game where a player can move, gain points, and interact with enemies. You'll employ the principles of Java class design to build the core components.

### ⚔️ Exercise 1: Player Fields and Methods

**Objective**: Implement a `Player` class with the following features:

- **Fields**: Add instance fields for `String` name, `int` score, `int` positionX, and `int` positionY.
- **Constructor**: Develop a constructor to initialize these fields.
- **Getters and Setters**: Create methods to access and modify each field.
- **Method**: Implement `public void printInfo()` that prints the player's current information.

```java
public class Player {

    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Default score
    }

    // Getters and setters here

    public void printInfo() {
        System.out.println("Player: " + this.name);
        System.out.println("Position: (" + this.positionX + ", " + this.positionY + ")");
        System.out.println("Score: " + this.score);
    }
    
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        hero.printInfo();
    }
}
```

### 👾 Exercise 2: Enemy Interactions

**Objective**: Create an `Enemy` class.

- **Fields**: Include `String` type, `int` health, and `int` positionX, `int` positionY.
- **Constructor**: Provide a constructor matching these fields.
- **Methods**:
  - Create *getters* and *setters*.
  - Implement a `public void attackPlayer(Player player)` method that reduces the player's score and prints the encounter result.

```java
public class Enemy {

    private String type;
    private int health;
    private int positionX;
    private int positionY;

    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters here

    public void attackPlayer(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            player.setScore(player.getScore() - 10);
            System.out.println("Enemy " + this.type + " attacked player " + player.getName() + "!");
        }
    }
}
```

### 💰 Exercise 3: Scoring System

**Objective**: Update the `Player` class to handle scoring.

- Add a method `public void increaseScore(int points)` to adjust the player's score when they achieve goals or overcome challenges with enemies.

```java
public void increaseScore(int points) {
    this.score += points;
    System.out.println(this.name + " scored " + points + " points!");
}
```

### 🌑 Exercise 4: Variable Shadowing

**Objective**: Understand the impact of variable shadowing.

Examine the following code and identify what is wrong. Be ready to explain how to fix these examples during the class discussion.

```java
public class ShadowExample {

    private int number = 1; // I want this number printed :(

    public void shadowTest() {
        int number = 5;
        System.out.println(number); // It is printing the wrong number :(
    }

    public static void main(String[] args) {
        new ShadowExample().shadowTest();
    }
}
```

> Consider the scope of variables and the use of the `this` keyword to access instance variables.

## ⚠ Important Note

Use `this` to address variable shadowing issues where necessary. Enjoy crafting your adventure game and solidifying your understanding of Java classes!

---

Embark on your journey and happy coding! 🧑‍💻🏆