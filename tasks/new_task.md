# Pixel Adventure: Java Game Development

For this assignment, you will design and implement a simple game application in Java. This project will help you explore the components of Java classes, practice object-oriented programming principles, and create an interactive console-based game. Are you ready to dive into the world of Java game development?

### 💀 Deadline

Ensure you complete this assignment by **Friday, September 16th**.

### 👩‍🏫 Instructions

Detailed instructions on submission are available in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting the assignment, make sure to complete the following:

- Read [Looking Inside Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).
- Register for the course key `dd1337-ht22` at [OLI](https://kth.oli.cmu.edu/).

### ✅ Learning Goals

In this assignment, you will:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding variable *scope* (and *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter issues, follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues).
2. If your problem isn't mentioned, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss freely with peers but **do not share solutions**!

### 🎮 Assignment

You've been entrusted to create a simple game application named *Pixel Adventure*. The game involves a player that can move around, interact with enemies, and score points. Your task is to model the core components of this game in Java.

#### Exercise 1: Designing Game Entities

Create a Java class named `Player` with the following attributes:

- `String name`
- `int positionX`
- `int positionY`
- `int score`

Also, define another class named `Enemy` with these attributes:

- `String type`
- `int positionX`
- `int positionY`

In a file `Game.java`, implement the following operations in the `main` method:

1. Instantiate a `Player` object named `hero`.
2. Set initial values using constructor methods.
3. Print the `Player` object's initial state to the terminal using *getters*.

<details>
  <summary>🛠 Example</summary>

  ```java
  class Player {
      private String name;
      private int positionX;
      private int positionY;
      private int score;

      // Constructor
      public Player(String name, int positionX, int positionY) {
          this.name = name;
          this.positionX = positionX;
          this.positionY = positionY;
          this.score = 0;
      }

      // Getters and Setters
      public String getName() { return name; }
      public int getPositionX() { return positionX; }
      public int getPositionY() { return positionY; }
      public int getScore() { return score; }

      public void setPositionX(int positionX) { this.positionX = positionX; }
      public void setPositionY(int positionY) { this.positionY = positionY; }
      public void setScore(int score) { this.score = score; }

      // Print information
      public void printInfo() {
          System.out.println("Player: " + name + " at (" + positionX + ", " + positionY + ") Score: " + score);
      }
  }

  public class Game {
      public static void main(String[] args) {
          Player hero = new Player("Adventurer", 0, 0);
          hero.printInfo();
      }
  }
  ```
</details>

#### Exercise 2: Implementing Movement

Add methods to the `Player` class to move the player:

- `void moveUp()`
- `void moveDown()`
- `void moveLeft()`
- `void moveRight()`

Modify the player's position based on these actions and print the new position after each move.

#### Exercise 3: Being Attacked!

Implement the interaction between the `Player` and `Enemy`. Add a method `interactWithEnemy(Enemy enemy)` in the `Player` class to simulate the attack. If the player encounters an enemy:

- Decrease player score by 10 points.
- Print to the terminal the interaction details between the player and enemy.

<details>
  <summary>🛠 Example</summary>

  ```java
  class Enemy {
      private String type;
      private int positionX;
      private int positionY;

      public Enemy(String type, int positionX, int positionY) {
          this.type = type;
          this.positionX = positionX;
          this.positionY = positionY;
      }

      public String getType() { return type; }
      public int getPositionX() { return positionX;}
      public int getPositionY() { return positionY;}

      public void printInfo() {
          System.out.println("Enemy: " + type + " at (" + positionX + ", " + positionY + ")");
      }
  }

  class Player {
      // ...

      public void interactWithEnemy(Enemy enemy) {
          if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
              this.score -= 10;
              System.out.println("Player " + name + " encountered an enemy " + enemy.getType() + "! Score reduced by 10.");
          }
      }
  }
  ```

  Then, in your `Game.java` use this interaction:

  ```java
  public class Game {
      public static void main(String[] args) {
          Player hero = new Player("Adventurer", 0, 0);
          Enemy goblin = new Enemy("Goblin", 0, 0);

          hero.interactWithEnemy(goblin);
      }
  }
  ```
</details>

#### Exercise 4: Exploring Variable Shadowing

Understand the concept of variable shadowing and make sure your code adheres to the best practices using `this` keyword for variable differentiation. Here is an example to analyze:

```java
public class ShadowExample {
    private int level = 1; // The correct level

    public void printLevel() {
        int level = 5;
        System.out.println(level); // It prints the wrong level :( 
    }

    public static void main(String[] args) {
        new ShadowExample().printLevel();
    }
}
```

Think about how to resolve these issues, and discuss them in group discussions.

#### Exercise 5: Points Scoring

Add points scoring logic to the game by allowing the player to score points when reaching certain positions (e.g., picking up treasures). Update the player's score and provide feedback to the console.

By completing this assignment, you learn essential Java programming skills in the context of game development. Enjoy coding your *Pixel Adventure*! 🕹️