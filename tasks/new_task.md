# Create Your First Java Game

For this exercise, you are tasked with creating a simple game application in Java! You will practice designing Java classes and use them to manage player movements, a scoring system, and interactions with enemies. This assignment will help you understand and apply foundational concepts in Java programming.

### 💀 Deadline

This work should be completed before the lab on **Friday, October 27th**.

### 👩‍🏫 Instructions

For detailed instructions on how to complete and submit your assignment, please see the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Please read and review the OLI material for Module 3 before beginning this assignment:

- Read [Designing Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Review the course material on instance fields and constructors.

> **Assistant's Note:** Ensure you understand the Java class design basics before starting the exercises.

### ✅ Learning Goals

This week's learning goals include:

* **Designing Java classes**
* **Adding instance fields**
* **Adding a constructor method**
* **Creating *getters* and *setters***
* **Printing to the terminal**
* **Using the `main` method**
* **Understanding scope (or *variable shadowing*)**

### 🚨 Troubleshooting Guide

If you run into any issues during this assignment, follow these steps:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if other students are experiencing similar problems.
2. If you don’t find a solution, post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Include a descriptive title, starting with "Task *x*: *summary of problem here*".
3. Consult with a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the next lab session.

Collaborate with your peers, but remember **not to share your answers**!

### 🏛 Assignment

In this assignment, you will create a simple Java game that simulates player movement, scoring, and enemy interactions. Let's get started!

#### Exercise 3.0 -- Designing the Player Class

1. In the `src` folder, create a new class called `Player.java`. Your `Player` class should include the following fields:

   - `String name`
   - `int score`
   - `int xPosition` (for horizontal movement)
   - `int yPosition` (for vertical movement)

2. Implement a constructor for the `Player` class that initializes these fields. Use parameters to input the initial values for the player's name, x and y positions, and set the score to zero by default.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int xPosition;
      private int yPosition;

      // Constructor
      public Player(String name, int xPosition, int yPosition) {
          this.name = name;
          this.score = 0;           // Score starts at 0
          this.xPosition = xPosition;
          this.yPosition = yPosition;
      }

      // other methods to follow
  }
  ```
</details>

#### Exercise 3.1 -- Getters and Setters

To control access to the Player class's fields, add private access modifiers and create *getters* and *setters* for each field.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  
  public int getScore() {
      return score;
  }
  
  public void addScore(int points) {
      this.score += points;
  }

  public int getXPosition() {
      return xPosition;
  }
  
  public void setXPosition(int xPosition) {
      this.xPosition = xPosition;
  }

  public int getYPosition() {
      return yPosition;
  }

  public void setYPosition(int yPosition) {
      this.yPosition = yPosition;
  }
  ```
</details>

#### Exercise 3.2 -- Player Movement

Write a method `move(int deltaX, int deltaY)` to change the player's position based on input deltas. After updating the position, print a message showing the new position to the terminal.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public void move(int deltaX, int deltaY) {
      this.xPosition += deltaX;
      this.yPosition += deltaY;
      System.out.println(name + " moved to (" + xPosition + ", " + yPosition + ")");
  }
  ```
  
  When calling `move(1, -1)`, expect:
  
  ```
  John moved to (1, -1)
  ```
</details>

#### Exercise 3.3 -- Enemy Interaction

Create a class `Enemy` with fields similar to `Player` for x and y positions, and a method `challenge(Player player)` that decreases the player's score by 10 points. Print both the enemy's position and the player's new score.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Enemy {
      private int xPosition;
      private int yPosition;

      public Enemy(int xPosition, int yPosition) {
          this.xPosition = xPosition;
          this.yPosition = yPosition;
      }

      public void challenge(Player player) {
          player.addScore(-10); // decrease player's score by 10
          System.out.println("Enemy at (" + xPosition + ", " + yPosition + ") challenges " +
                             player.getName() + "! Score is now: " + player.getScore());
      }
  }
  ```

  Resulting in:
  
  ```
  Enemy at (3, 2) challenges John! Score is now: -10
  ```
</details>

#### Exercise 3.4 -- Main Method and Game Logic

Finally, in the `Game.java` class, employ the `main` method to simulate a basic game loop that creates a `Player` and an `Enemy`, moves the player around, and handles interactions between them.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Game {
      public static void main(String[] args) {
          Player player = new Player("John", 0, 0);
          Enemy enemy = new Enemy(3, 2);

          player.move(1, 1);
          enemy.challenge(player);

          player.move(2, 1);
          enemy.challenge(player);
      }
  }
  ```
  
  This should simulate the player's movement and subsequent interactions with the enemy.
</details>

#### Exercise 3.5 -- Scope and Variable Shadowing

Review the examples below related to variable shadowing. Prepare to discuss understanding and corrections in class, focusing on how to use the `this` keyword to disambiguate shadowed variables.

```java
public class ScopeExample {
    private int scopeValue = 10; // I want to use this one.

    public void printValue() {
        int scopeValue = 20;
        System.out.println(scopeValue); // Prints 20, not 10. Why?
    }

    public static void main(String[] args) {
        ScopeExample ex = new ScopeExample();
        ex.printValue(); // I expect to use the class's field.
    }
}
```

For more resources, look up [Variable Shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and [Java's this Keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

> **Assistant's Note:** Differentiate between variable scopes and rectify shadowing issues using `this`.

By completing these exercises, you'll gain confidence in designing and creating interactive applications in Java, using proper encapsulation practices, and understanding the importance of scope within your programs. Good luck, and let the game begin!