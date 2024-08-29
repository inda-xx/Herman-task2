# Simple Java Game: The Quest of JavaKnight

### 🎮 Challenge Overview

In this exercise, you will embark on the journey of creating a simple game in Java. Your task is to implement a game with player movement, a scoring system, and enemy interaction. Through this challenge, you will get hands-on experience with the fundamental concepts of Java classes, including designing classes, adding fields, implementing constructors, getting familiar with getters and setters, understanding scope and variable shadowing, and printing outputs to the terminal.

### 💼 Deadline

Please ensure that your completed task is submitted by **Friday, 20th October**.

### 🛠️ Instructions
For instructions on submission and further clarifications, please refer to the [course instructions section](https://example-git-course-link.com).

### 📚 Preparation

Before starting, please make sure to review the following materials:

- [Understanding Java Classes](https://example-java-classes-link.com)
- Review sections on **constructors**, **fields**, **getters**, **setters**, and **variable shadowing**.

> **Instructor's Note:** The materials this year might slightly change, so stay updated with the latest resources.

### 🎯 Learning Goals

By the end of this assignment, you will be adept in:
- Designing Java classes with appropriate instance fields and methods.
- Implementing constructor methods for initializing objects.
- Creating getters and setters for encapsulation.
- Printing useful information to the terminal.
- Understanding and applying the concept of variable scope and shadowing.

### 📝 Assignment Description

Bring life to a simple game by implementing a player character, scoring system, and enemy interactions in Java. Just follow the steps below to accomplish this quest!

#### 📐 Exercise 1: Game Components — Classes and Fields

Create a Java class `Game` within the `src` folder. Define three main classes: `Player`, `Score`, and `Enemy`.

**1.1 Player Class:**
- Fields: `String name`, `int health`, `int position`.
- Constructor: Initializes all fields.
- Getters and Setters for each field.

**1.2 Score Class:**
- Fields: `int points`.
- Constructor: Initializes score to zero.
- Getter and Setter for points.

**1.3 Enemy Class:**
- Fields: `String name`, `int position`.
- Constructor: Initializes all fields.
- Getters and Setters for each field.

<details>
  <summary> 💻 Example: Player Class </summary>

  ```java
  public class Player {
      private String name;
      private int health;
      private int position;

      public Player(String name, int health, int position) {
          this.name = name;
          this.health = health;
          this.position = position;
      }

      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      public int getHealth() {
          return health;
      }

      public void setHealth(int health) {
          this.health = health;
      }

      public int getPosition() {
          return position;
      }

      public void setPosition(int position) {
          this.position = position;
      }
  }
  ```
</details>

#### ⚔️ Exercise 2: Player Movement and Scoring System

**2.1 Implement Player Movement:**
- Method `move(int newPosition)`: Updates player’s position.

**2.2 Implement Scoring System:**
- Method `addPoints(int newPoints)`: Updates score. 
- Print updated score to the terminal.

#### 🚨 Exercise 3: Enemy Interactions

**3.1 Enemy Encounter:**
- Method `encounter(Player player)`: Checks if enemy’s position coincides with player’s position and reduces player’s health.

Print the status of encounter and health to the terminal.

#### 🔄 Exercise 4: Initialize Game Using `main` Method

Implement the `main` method within the `Game` class:
- Instantiate Player, Score, and Enemy objects.
- Use methods to simulate movement, scoring, and enemy encounters.
- Demonstrate the concept of scope and variable shadowing through code examples.

### 🛡️ Scope and Variable Shadowing

```java
public class ShadowDemo {

    private int score = 100; // This is the intended score

    public void displayScore() {
        int score = 10;
        System.out.println(score); // Wrong score displayed :(
    }

    public static void main(String[] args){
        ShadowDemo demo = new ShadowDemo();
        demo.displayScore();
    }
}
```

> **Pro Tip:** Use the `this` keyword to correctly reference instance fields.

By completing these exercises, you will develop a functional understanding of creating a simple game app in Java. Enjoy your quest!