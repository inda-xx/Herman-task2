# 🎮 Simple Adventure Game in Java!

For this assignment, you'll design and implement a basic game application using Java. You'll focus on modeling game components such as player, enemy, and score system. Get ready to dive into object-oriented programming and explore Java class structures!

### 🗓️ Deadline

Submit your work by **Friday 20th October** to stay on track.

### 👨‍🏫 Instructions

To submit your assignment, follow the standard procedure outlined in the [course instructions](https://example.com/course-instructions#assignments).

### 📚 Preparation

Before you begin, make sure you’re familiar with the following concepts:

- Read [Exploring Java Classes](https://example.com/java-classes).
- Review [Java OOP Fundamentals](https://example.com/java-oop).

> **Note:** The preparation material might have minor changes, feel free to read ahead if necessary.

### 🎯 Learning Goals

By completing this assignment, you'll achieve the following objectives:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🛠️ Troubleshooting Guide

If you encounter issues, follow these steps:

1. Check the [issue board](https://example.com/help/issues) for similar problems other students face.
2. Post a new question on the [issue board](https://example.com/help/issues/new) with a descriptive title like "Task 3: Issue with player movement".
3. Consult with a TA during scheduled lab hours for direct support.

Feel free to discuss general concepts with peers, but do not share code!

### 🕹️ Assignment

Let's build a basic text-based game where a player can move, interact with enemies, and score points. Here’s how to get started:

#### Exercise 1: Class Design - `Player` and `Enemy`

Create Java classes: `Player` and `Enemy`. Each should include:

- **Player:**
  - `String` name
  - `int` health
  - `int` score

- **Enemy:**
  - `String` type
  - `int` health
  - `boolean` isDefeated

```java
public class Player {
  // Add instance fields here

  // Add a constructor here

  // Add getters and setters here
}

public class Enemy {
  // Add instance fields here

  // Add a constructor here

  // Add getters and setters here
}
```

#### Exercise 2: Constructor and Methods

Implement constructors for initializing each class with appropriate values.

```java
// In Player class
public Player(String name, int health, int score) {
  this.name = name;
  this.health = health;
  this.score = score;
}

public void move() {
  System.out.println(name + " moved to a new position.");
}

// In Enemy class
public Enemy(String type, int health) {
  this.type = type;
  this.health = health;
  this.isDefeated = false;
}
```

#### Exercise 3: Getters and Setters

Encapsulate all fields by setting them to `private` and providing appropriate *getters* and *setters*.

```java
// Example for Player
public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public int getScore() {
  return score;
}

public void setScore(int score) {
  this.score = score;
}
```

#### Exercise 4: Player-Enemy Interaction

Implement interaction methods: Player should be able to attack enemies, reducing their health.

```java
public void attack(Enemy enemy) {
  if(!enemy.isDefeated()) {
    enemy.setHealth(enemy.getHealth() - 10);
    System.out.println(name + " attacked " + enemy.getType() + "!");
  }
}
```

#### Exercise 5: Score System

Update player’s score based on actions. Include a print method for showing scores.

```java
public void addScore(int points) {
  this.score += points;
  System.out.println("Score updated! Current score: " + score);
}
```

#### Exercise 6: Main Method and Testing

Create a `main` method to instantiate objects and test interactions.

```java
public static void main(String[] args) {
  Player player = new Player("Hero", 100, 0);
  Enemy enemy = new Enemy("Goblin", 50);

  player.move();
  player.attack(enemy);
  player.addScore(10);
}
```

#### Exercise 7: Variable Shadowing

Read about [variable shadowing](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html). Reflect on how it can be avoided in Java, exemplified by the use of the `this` keyword in your constructors.

```java
// Example of shadowing
public void setName(String name) {
  this.name = name; // Correct use to avoid shadowing the instance field
}
```

> **Assistant's Note:** Pay attention to the difference between local and instance variables to understand scope better.

By the end of this assignment, you’ll have a foundational game application with player movement, scoring, and enemy interaction, implemented entirely in Java. Enjoy coding! 🎮