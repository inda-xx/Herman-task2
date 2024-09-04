# Tiny Adventurer Game Development!

For the upcoming programming exercise, you are tasked with creating a simple game application using Java! This exercise will focus on modeling core game components: player movement, scoring, and enemy interactions. You'll learn to design Java classes, use instance fields, create constructors, and more.

### 💀 Deadline

The project should be completed before the exercise session on **Friday 22nd October**.

### 👩‍🏫 Instructions

Refer to the [assignments section of the course instructions](https://xyz.school/course-instructions#assignments) for detailed submission requirements.

### 📝 Preparation

Please complete the readings and activities in the relevant modules before starting this assignment:

- [Designing Java Classes](https://xyz.school/module/designing-classes)
- [OLI Material on Constructing Classes](https://xyz.school/module/class-construction)

> **Important Note:** There might be slight deviations in module content this semester, don't hesitate to read ahead if needed.

### ✅ Learning Goals

This assignment aims to help you gain knowledge and skills in:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any questions or issues, please follow the steps below:

1. Check [posted issues](https://xyz.school/help/issues) from other students.
2. If your issue isn't listed, post your question by creating a [New Issue](https://xyz.school/help/issues/new).
3. Seek assistance during the [weekly lab sessions](https://xyz.school/labs/schedule).

Remember to discuss and collaborate with peers, but do not share direct solutions!

### 🏛 Assignment

Welcome to the Tiny Adventurer's world! In this game, the player will navigate through a world inhabited by enemies. Your task is to model the game's system in Java.

#### Exercise 1 -- Designing Classes and Fields

Create a class named `Player.java` inside the `src` folder that includes:

- `String` name
- `int` score
- `int` position

```java
class Player {

  // Add your fields here!

  public static void main(String[] args) {
    Player hero = new Player();
    hero.name = "Aragorn";
    hero.score = 0;
    hero.position = 0;
    
    System.out.println("Player: " + hero.name);
    System.out.println("Score: " + hero.score);
    System.out.println("Position: " + hero.position);
  }

}
```

#### Exercise 2 -- Constructor Method

Implement a constructor to initialize the player's attributes while creating a new object without calling setters directly.

```java
public Player(String name, int score, int position) {
  this.name = name;
  this.score = score;
  this.position = position;
}
```

#### Exercise 3 -- Getters and Setters

Encapsulate your fields by making them private and add *getters* and *setters* for each.

```java
public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

// Similarly, add for score and position
```

#### Exercise 4 -- Enemy Interaction

Create an `Enemy.java` class with interactions between players and enemies. The class should at least include the fields:

- `int` hitPoints
- `int` attackPower

```java
class Enemy {

  // Fields, constructors, getters, and setters

  public void attack(Player player) {
    int damage = this.attackPower - player.getDefense();
    System.out.println("Enemy attacks " + player.getName() + " with damage: " + damage);
  }
}
```

#### Exercise 5 -- PrintInfo Method

Implement a `printInfo()` method in your Player class to output current player stats to the terminal.

```java
public void printInfo() {
  System.out.println("Player Info:");
  System.out.println("Name: " + name);
  System.out.println("Score: " + score);
  System.out.println("Position: " + position);
}
```

#### Exercise 6 -- Variable Shadowing

Investigate and resolve *variable shadowing* issues in provided snippets:

```java
public class ShadowExample {
  
  private String attribute = "Global";

  public void shadowingDemo() {
    String attribute = "Local";
    System.out.println(attribute); // Print the expected variable with proper use of 'this'
  }
  
}
```

Ensure to explore how `this` keyword resolves shadowing.

> **Reflect:** Keep a reflective journal on your learning regarding local and global variable handling and share insights during class discussions.