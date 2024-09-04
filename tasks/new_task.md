# Move, Score, Survive – A Simple Java Game!

For this exercise, you're going to develop a simple game prototype in Java, allowing you to dive deep into designing Java classes and their functionalities. This will enhance your understanding of class structures, object manipulation, and basic game mechanics in a console-based environment.

### 💀 Deadline

This assignment should be completed before the class session on **Friday, 16th September**.

### 👩‍🏫 Instructions

For instructions on how to submit the assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Make sure to review and answer the questions in the OLI material for Module 2:

- Read [Class Design](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven't already, go to https://kth.oli.cmu.edu/, sign up, and register with the course key: `dd1337-ht22`.

> **Assistant's Note:** Some OLI material may be slightly out of sync this year; feel free to read ahead if needed.

### ✅ Learning Goals

This week, you will learn to:

* Design Java classes
* Add instance fields
* Implement a constructor method
* Create *getters* and *setters*
* Print to the terminal
* Use the `main` method
* Understand scope and solve *variable shadowing*

### 🚨 Troubleshooting Guide

If you have any questions or issues, follow this procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Others might have the same query.
2. If unresolved, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Task *x*: *summary of the problem*".
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss with peers but **do not share code**!

### 🏛 Assignment

You are tasked with creating a simple console-based game, encompassing core gameplay elements: player movement, a scoring system, and enemy interactions. Design Java classes to represent each component interactively within the game.

#### Exercise 1 -- Designing Classes and Fields

In the `src` folder, create the following Java classes:

- **Player**
  - Fields: `String name`, `int health`, `int score`, `Position position`
  - The `Position` class (nested or separate) should maintain `int x`, `int y`.

- **Enemy**
  - Fields: `String type`, `int health`, `Position position`

- **GameWorld**
  - Fields: `Player player`, `Enemy[] enemies`

#### Exercise 2 -- Constructor Method and Printing

Implement constructors for `Player`, `Enemy`, and `GameWorld` that take relevant initial values. Ensure you print initial states to the terminal.

<details>
  <summary>Example Initialization</summary>

  ```java
  public class Example {
      public static void main(String[] args) {
          Player player = new Player("Hero", 100, new Position(0, 0));
          Enemy goblin = new Enemy("Goblin", 50, new Position(5, 5));
          GameWorld world = new GameWorld(player, new Enemy[]{goblin});

          // Print player and enemy information
          System.out.println("Player: " + player.getName() + " at " + player.getPosition());
          System.out.println("Enemy: " + goblin.getType() + " at " + goblin.getPosition());
      }
  }
  ```
</details>

#### Exercise 3 -- Getters and Setters (Encapsulation)

Add getters and setters for all fields, which will prevent direct access to class properties while allowing modifications through controlled methods.

```java
// Example getter and setter for Player's health
public int getHealth() {
    return this.health;
}

public void setHealth(int health) {
    this.health = health;
}
```

#### Exercise 4 -- Player Movement and Score

Develop methods in the `Player` class to move (up, down, left, right) and update the score when reaching certain positions.

#### Exercise 5 -- Enemy Interactions

Implement functionality in the `Enemy` class for interaction with the player (e.g., inflict damage). Print the player's remaining health when attacked.

<details>
  <summary>Simple Interaction Example</summary>

  ```java
  public void attack(Player player) {
      int damage = 10;
      player.setHealth(player.getHealth() - damage);
      System.out.println(player.getName() + " was attacked and now has " + player.getHealth() + " health.");
  }
  ```
</details>

#### Exercise 6 -- Scope and Variable Shadowing

Understand the concept of variable shadowing using the examples below. Be prepared to discuss in class:

```java
public class ScopeExample {
    private int counter = 100; // Global variable

    public void demonstrateShadowing() {
        int counter = 10;  // Local variable shadows the global one
        System.out.println(counter); // Prints 10
    }

    public static void main(String[] args) {
        new ScopeExample().demonstrateShadowing();
    }
}
```

Reflect on how the keyword `this` can resolve shadowing issues in constructors:
```java
public class GameObject {
    private String name;

    public GameObject(String name) {
        this.name = name;
    }
}
```

> **Assistant's Note:** Consider implications of local and global variable shadows and how to maintain clarity in code with careful variable naming and use of `this`.

With these exercises, you're building a foundation for understanding object-oriented programming principles within the context of a simple game. Enjoy the challenge, and may it spark further curiosity and learning!