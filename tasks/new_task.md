# 🌟 Adventure Begins: Dev-Coding Quest!

For this exercise, you'll level up your Java programming skills by creating a simple game where players move around, score points, and interact with enemies. This quest will teach you fundamental OOP concepts along the way!

### 💀 Deadline

Complete this assignment before class on **Friday 22nd September**.

### 👩‍🏫 Instructions

For detailed instructions on submitting the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Ensure you're ready by reading and answering the questions in the OLI material for Module 3.

- Read [Understanding Object-Oriented Programming](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f7e5b906abcf123942dd841230a05623).
- Sign up at https://kth.oli.cmu.edu/ and register with the course key `dd1337-ht22`.

> **Note:** If you can't find all the material immediately, it's okay to read ahead.

### ✅ Learning Goals

This week's learning objectives include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others share your problem.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) using a descriptive title like "Task *x*: *brief overview of problem*."
3. Ask a TA in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Consult your schedule for lab times.

Discuss with peers, but **avoid sharing answers**!

### 🏛 Assignment

You're tasked with designing a classic game setup using Java! Explore player movements, score tracking, and enemy encounters to make your game engaging.

#### Task 1: Player Class

In the [`src`](src) directory, create a new Java class named `Player.java`.

Define these attributes:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`

Make sure to:

- Make fields `private`.
- Add appropriate *getters* and *setters* for each field.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Player {

    // Declare fields here

    public static void main(String[] args) {
      // Create a Player object named "Hero"
      Player hero = new Player();
      
      // Set initial properties
      hero.setName("Hero");
      hero.setScore(0);
      hero.setXPosition(0);
      hero.setYPosition(0);
      
      // Print player's information
      System.out.println("Player: " + hero.getName());
      System.out.println("Score: " + hero.getScore());
      System.out.println("Position: (" + hero.getXPosition() + ", " + hero.getYPosition() + ")");
    }
  }
  ```
</details>

#### Task 2: Constructor

Upgrade your `Player` class by adding a constructor to initialize player attributes.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Player {
    
    // Fields and constructor here

    public static void main(String[] args) {
      // Create a Player object using the constructor
      Player hero = new Player("Hero", 0, 0, 0);

      // Print player's information
      hero.printInfo();
    }
  }
  ```
</details>

#### Task 3: Enemy Class & Interaction

Define an `Enemy` class in a new file `Enemy.java`.

Attributes to include:

- `String type`
- `int xPosition`
- `int yPosition`

Add methods to allow a player to `interactWithEnemy(Enemy enemy)`.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Enemy {

    // Declare enemy fields here

  }
  
  public class Player {

    // Methods and fields here

    public void interactWithEnemy(Enemy enemy) {
      System.out.println("Encountered an enemy of type: " + enemy.getType());
      // Logic for interacting with/enemy impacts
    }
  }
  ```
</details>

#### Task 4: Scoring and Movement

Implement a method `move(int dx, int dy)` in the `Player` class to adjust the player's x and y coordinates.

Update the `interactWithEnemy` method so that it increases the player's score when they encounter an enemy.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class Player {

    // Fields, methods, and constructor here
    
    public void move(int dx, int dy) {
        this.xPosition += dx;
        this.yPosition += dy;
        System.out.println("Moved to new position: (" + this.xPosition + ", " + this.yPosition + ")");
    }
    
    public void interactWithEnemy(Enemy enemy) {
      this.score += 10; // Increase score by 10 points
      System.out.println("Encountered an enemy of type: " + enemy.getType());
      System.out.println("New Score: " + this.score);
    }
  }
  ```
</details>

#### Task 5: Understanding Variable Shadowing

Digest these variable shadowing samples. You might be required to explain the concept in class.

Check out [Wikipedia's entry on variable shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and the Java [this keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```java
public class ShadowExample {
    private int number = 42; // Desired number to output

    public void printNumber() {
        int number = 5; // Local variable shadows the field
        System.out.println(number); // Prints the local variable
    }

    public static void main(String[] args) {
        new ShadowExample().printNumber();
    }
}
```

Another instance:

```java
import java.awt.Color;

public class Vehicle {
  private String model;
  private Color color;

  public Vehicle(String model, Color color) {
    this.model = model; // Use 'this' to resolve variable shadowing
    this.color = color;
  }

  public void display() {
    String announcement = "This vehicle swifts!";
    System.out.println(this.model + ": " + announcement); // Resolves using 'this'
  }
}
```

> **Note:** Grasp the nuances of *local scope* and *instance fields*.

Carry on, and craft your Java-based adventure game, conjuring interactions, scoring, and strategy as you build! 👾