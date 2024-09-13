# 👾 A Simple Game Adventure

For this programming task, you will embark on a journey to create a simple yet engaging game with a focus on object-oriented programming in Java. The game will include player movement, a scoring system, and interactions with enemies. This task will help you reinforce your understanding of Java classes and several core programming concepts.

### 🕗 Deadline

Please complete and submit this work before the exercise session on **Friday 22nd October**.

### 🧑‍💻 Instructions

Follow the instructions below to complete and submit your assignment. For submission guidelines, refer to the [assignments section of the course instructions](https://example.com/assignments).

### 📚 Preparation

Before you begin designing your game, please read and answer the questions in Module 3 of the OLI material.

- Read [Introduction to Java Classes](https://example.com/modules/java-classes)
- Ensure you are registered for the course using the code `java-game-23`.

> **Note from the Assistant:** Some materials may vary slightly this year, so feel free to explore beyond the current module if needed.

### 🎯 Learning Goals

By completing this task, you will achieve the following learning goals:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🛠 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check this week's [discussion board](https://example.com/discussions) for similar queries.
2. If your question hasn't been addressed, post a new query with a descriptive title beginning with "Task *Game*: *issue summary*".
3. Consult a teaching assistant during the [weekly lab session](https://example.com/lab-sessions). Refer to your schedule for lab timings.

Discuss with your peers but remember: **do not share answers!**

### 🎮 Assignment

Welcome to the world of Java Game Development! Your mission is to design a simple game with a player, enemies, and a scoring system. You will implement a `Player` class and `Enemy` class with essential game functionalities. Here’s how you can achieve this:

#### Exercise 1 -- Designing the `Player` Class

In the `src` folder, create a new class called `Player.java`. The `Player` class should contain the following:

- Fields:
  - `String` name
  - `int` position
  - `int` score

- Constructor:
  - Initialize name, position, and score.

- Add getters and setters for each field.

If done correctly, the following main method should compile and run successfully:

```java
class Player {

  // Add your fields, constructor, getters, and setters here!

  public static void main(String[] args) {
    Player hero = new Player("Hero", 0, 0);

    // Update and retrieve player information
    hero.setPosition(5);
    System.out.println("Player: " + hero.getName());
    System.out.println("Position: " + hero.getPosition());
    System.out.println("Score: " + hero.getScore());
  } // end main method

} // end class
```

#### Exercise 2 -- Creating the `Enemy` Class

Design the `Enemy` class with the following specifications:

- Fields:
  - `String` type
  - `int` position
  - `int` damage

- Constructor:
  - Initialize type, position, and damage.

- Add getters and setters for each field.

#### Exercise 3 -- Player Movement and Score

Implement a method in the `Player` class named `move(int steps)` to update the player's position. Additionally, create a method `increaseScore(int points)` to update the player's score.

#### Exercise 4 -- Enemy Interactions

Create a method `interactWithEnemy(Enemy enemy)` within the `Player` class. If the player's position matches the enemy's position, print a message indicating a conflict, and subtract the enemy's damage from the player's score.

```java
public void interactWithEnemy(Enemy enemy) {
  if (this.getPosition() == enemy.getPosition()) {
    System.out.println(this.getName() + " encountered " + enemy.getType());
    this.increaseScore(-enemy.getDamage());
  }
}
```

Test your implementation using the following:

```java
public static void main(String[] args) {
  Player hero = new Player("Hero", 5, 100);
  Enemy goblin = new Enemy("Goblin", 5, 20);

  hero.interactWithEnemy(goblin);
  System.out.println("Score after encounter: " + hero.getScore());
}
```

#### Exercise 5 -- Variable Shadowing

Review the following example of variable shadowing and be ready to discuss how to resolve it during class:

```java
public class ShadowExample {

  private int score = 100; // Desired score to print

  public void printScore() {
    int score = 50;
    System.out.println(score); // Prints the wrong score :( 
  }

  public static void main(String[] args){
    new ShadowExample().printScore();
  }
}
```

Consider using the `this` keyword to address scope issues and properly access instance fields.

> **Note:** Reflect on the differences between local variables, global variables, and instance fields.

---

Good luck with your game development journey! Explore and have fun coding your own simple game.