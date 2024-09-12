# 🎮 Simple Java Game: Let the Adventure Begin! 🚀

Welcome to your next challenge in mastering Java! This exercise will guide you through creating a simple game application with essential features like player movement, scoring, and enemy interactions. You will explore core Java concepts including designing classes, constructors, fields, methods, and handling variable scope.

### 💀 Deadline

Complete and submit before the exercise on **Friday 9th December**.

### 👩‍🏫 Instructions

For detailed instructions on submission, please visit the [assignments section of the course instructions](https://yourcourse.edu/assignments).

### 📝 Preparation

Make sure to read and complete the assignments in the OLI material for Module 3:

- [Understanding Java Classes](https://yourcourse.edu/java-classes)
- Visit [module resources](https://yourcourse.edu/signup) and register with the course key `dd1338-ht22`.

> **Assistant's Note:** OLI content might vary slightly, please ensure you explore all relevant material.

### ✅ Learning Goals

This module's learning objectives include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you run into difficulties, follow these steps:

1. Check out this week's [posted issues](https://yourcourse.edu/help/issues) to see if others have similar queries.
2. If not, post your question by creating a [New Issue](https://yourcourse.edu/help/issues/new) with a descriptive title beginning with "Task x: description".
3. Consult with your TA during the [weekly lab sessions](https://yourcourse.edu/labs). Check your schedule for the next one.

Feel free to discuss with peers, but **do not share solutions**!

### 🏛 Assignment

In this assignment, you will build a simple game with elements of player and enemy dynamics. You will implement the basic framework using Java classes, deal with objects, and practice encapsulation and scope.

<img src="images/gameplay_example.png" width="800" alt="Simple Java Game"/>

#### Exercise 1.0 -- Fields

Create a new class called `Player.java` inside the `src` folder. The `Player` class should have:

- `String` name
- `int` score
- `int` position

To verify, the main method provided in Example 1 should compile when added to `Player.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {

    // Define your fields here!

    public static void main(String[] args) {
      Player newbie = new Player();
      
      // Assign initial values
      newbie.name = "Rookie";
      newbie.score = 0;
      newbie.position = 1;

      // Print information
      System.out.println("Player Name: " + newbie.name);
      System.out.println("Score: " + newbie.score);
      System.out.println("Position: " + newbie.position);
    } // end main method
  } // end class
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Ensure encapsulation by making fields `private` and adding *getters* and *setters*. The `Player` class should have a total of six methods.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Player {

    // Define your fields here!

    // Define your getters and setters here!

    public static void main(String[] args) {
      Player newbie = new Player();
      
      newbie.setName("Rookie");
      newbie.setScore(0);
      newbie.setPosition(1);

      System.out.println("Player Name: " + newbie.getName());
      System.out.println("Score: " + newbie.getScore());
      System.out.println("Position: " + newbie.getPosition());
    } // end main method
  } // end class
  ```
</details>

#### Exercise 1.2 -- Constructor

Use a constructor to initialize fields when creating objects. Implement this according to the “Java Constructors” resource and modify Example 2 to use the constructor.

#### Exercise 1.3 -- `printPlayerInfo()`

Add a method `printPlayerInfo()` to output player details.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    Player newbie = new Player("Rookie", 0, 1);

    newbie.printPlayerInfo();
  }
  ```

  The output should be:

  ```
  > Player Info
  > Name: Rookie
  > Score: 0
  > Position: 1
  ```
</details>

#### Exercise 1.4 -- Enemy Interactions

Introduce an `Enemy` class with fields like `String` type and `int` damage. Implement interactions where a `Player` can be affected by an `Enemy`.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    Player newbie = new Player("Rookie", 0, 1);
    Enemy golem = new Enemy("Golem", 10);

    newbie.encounter(golem);

    System.out.println("Player Position: " + newbie.getPosition());
    System.out.println("Player Score: " + newbie.getScore());
  }
  ```

  Output should resemble:

  ```
  > Encountered Golem, lost 10 points!
  > Player Position: 0
  > Player Score: -10
  ```
</details>

#### Exercise 1.5 -- Understanding Variable Shadowing

Review the following variable shadowing examples and be ready to discuss solutions in class.

```java
public class ScopeTest {
    private int level = 1; 

    public void displayLevel() {
        int level = 2; // Local variable shadows field
        System.out.println(level); // Outputs the local variable
    }

    public static void main(String[] args) {
        new ScopeTest().displayLevel();
    }
}
```

And another:

```java
public class Vehicle {
  private String model;

  public Vehicle(String model) {
    model = model; // Issue with variable shadowing
  }

  public void showModel() {
    String model = "Unknown";
    System.out.println("Model: " + model); // Outputs the local variable
  }
}
```

> **Assistant's Note:** Review the concepts of local and global scope and how the `this` keyword resolves naming conflicts.

Enjoy coding your first Java game adventure, and prepare for debugging and showcasing your skills! 🎯