# Adventures of Code Monsters!

For this task, you will design and implement a simple game application in Java, encompassing the creation and interaction of players, scoring, and enemies. You will model game elements as Java classes and experiment with creating, managing, and interacting with objects. This project will help you practice crucial concepts in Java programming, including class design, encapsulation, and constructors.

### 💀 Deadline

This task should be completed and submitted before the tutorial session on **Friday 20th November**.

### 👩‍🏫 Instructions

For detailed instructions on how to complete and submit the task, please refer to the [course instructions](https://example.com/course-instructions).

### 📝 Preparation

Ensure you've gone through the OLI material for this module and completed the accompanying questions:

- Study [Java Basics and Object-Oriented Concepts](https://example.com/java-basics).
- Sign up and access course materials using the key `java123`.

> **Assistant's Note:** The course content is subject to minor changes this semester, so read ahead if necessary.

### ✅ Learning Goals

This week's objectives include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you face issues, try these steps:

1. Check this week's [posted issues](https://example.com/help). Other students might have the same questions.
2. If your problem is unique, create a [New Issue](https://example.com/help/new) with a descriptive title starting with "Task X: Summary of Problem".
3. Ask a TA during the [weekly lab](https://example.com/lab-schedule).

Feel free to discuss with peers, but **do not share solutions**!

### 🏛 Assignment

Welcome to the thrilling world of Code Monsters! In this assignment, you'll program various game components using Java. Each exercise will build on the previous to create a fully functioning game with players, enemies, and a scoring system.

#### Exercise 1 -- Game Elements

Create a new class `GameElement.java` in your `src` directory. Each element in the game, like players or enemies, will have:

- `String` name
- `int` health
- `int` score

Define these as private fields and initialize them in a default constructor. Use setters and getters to access these fields.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class GameElement {
      private String name;
      private int health;
      private int score;

      // Constructor
      public GameElement(String name, int health) {
          this.name = name;
          this.health = health;
          this.score = 0;
      }

      // Getters and Setters
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }

      public int getHealth() { return health; }
      public void setHealth(int health) { this.health = health; }

      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }

      // Printing details
      public void printInfo() {
          System.out.println("Name: " + name);
          System.out.println("Health: " + health);
          System.out.println("Score: " + score);
      }

      public static void main(String[] args) {
          GameElement hero = new GameElement("Hero", 100);
          hero.printInfo();
      }
  }
  ```
</details>

#### Exercise 2 -- Player Class

Extend the `GameElement` to create a `Player` class with additional functionalities like movement.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Player extends GameElement {
      private int xPosition;
      private int yPosition;

      public Player(String name, int health) {
          super(name, health);
          this.xPosition = 0;
          this.yPosition = 0;
      }

      public void move(int x, int y) {
          this.xPosition += x;
          this.yPosition += y;
          System.out.println(getName() + " moved to position: (" + xPosition + ", " + yPosition + ")");
      }

      public int getXPosition() { return xPosition; }
      public int getYPosition() { return yPosition; }

      @Override
      public void printInfo() {
          super.printInfo();
          System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
      }

      public static void main(String[] args) {
          Player hero = new Player("Hero", 100);
          hero.move(5, 3);
          hero.printInfo();
      }
  }
  ```
</details>

#### Exercise 3 -- Enemy Class

Create an `Enemy` class, also extending `GameElement`. Add methods to interact with the player (e.g., `attack` method to decrease player's health).

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Enemy extends GameElement {
      public Enemy(String name, int health) {
          super(name, health);
      }

      public void attack(Player player) {
          int damage = 10; // Fixed damage for simplicity
          player.setHealth(player.getHealth() - damage);
          System.out.println(getName() + " attacked " + player.getName() + " for " + damage + " damage!");
      }

      public static void main(String[] args) {
          Player hero = new Player("Hero", 100);
          Enemy goblin = new Enemy("Goblin", 50);
          goblin.attack(hero);
          hero.printInfo();
      }
  }
  ```
</details>

#### Exercise 4 -- Variable Shadowing

Explore the concept of variable shadowing. Consider the examples below and think of how to resolve these issues.

```java
public class ShadowExample {
    private int value = 42; // Desired value to print

    public void printValue() {
        int value = 100;
        System.out.println(value); // Unintended value is printed
    }

    public static void main(String[] args) {
        new ShadowExample().printValue();
    }
}
```

```java
public class Creature {
    private String identity;
    public Creature(String identity) {
        identity = identity; // Doesn't work as intended
    }
}
```

> **Assistant's Note:** Consider using `this` keyword to differentiate between class fields and local variables.

By completing the exercises, you'll solidify your understanding of Java classes and object-oriented programming principles crucial for developing robust Java applications. Enjoy designing your game world and have fun implementing your creative ideas!