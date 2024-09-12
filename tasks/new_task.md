# Make Your Move: Java Game Development

For this exercise, you will embark on an exciting journey to create a simple game in Java. Your game will have essential functionalities such as player movement, scoring system, and interactions with enemies. Through this task, you will explore and implement several core Java programming concepts.

### 💀 Deadline

Complete this work before the exercise on **Friday 24th November**.

### 👩‍🏫 Instructions

For instructions on how to complete and submit the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

You must read and answer questions in the OLI material for Module 3.

- Access [Java Classes and Object-Oriented Concepts](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If not already registered, sign up at https://kth.oli.cmu.edu/ using the course key `dd1337-ht22`.

> **Assistant's Note:** The OLI material is comprehensive and may slightly differ from this task's requirements. Reading ahead is recommended.

### ✅ Learning Goals

This week's learning objectives include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter questions or issues, follow this approach:

1. Explore this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Consider if other students have similar queries.
2. If unresolved, post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Task *x*: *summary of problem*".
3. Seek assistance from a TA in person during the scheduled [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for details.

We encourage collaborative discussions, but please **do not share answers**!

### 🎮 Assignment

Welcome to the world of game development! You're tasked with building a simple Java game incorporating player movement, scoring, and enemy interactions.

#### Exercise 3.0 -- Design Classes

In the `src` folder, create a new class called `GameCharacter.java`. This class will model our game characters with the following fields:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` score
- `boolean` isAlive

If implemented correctly, the provided main method in Example 1 should compile when added to `GameCharacter.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class GameCharacter {

    // Define your fields here!

    public static void main(String[] args) {
      // create a new "GameCharacter" object
      GameCharacter player = new GameCharacter();

      // assign instance variables meaningful values
      player.xPosition = 0;
      player.yPosition = 0;
      player.score = 0;
      player.isAlive = true;

      // Print initial setup
      System.out.println("Player position: (" + player.xPosition + ", " + player.yPosition + ")");
      System.out.println("Score: " + player.score);
      System.out.println("Is Alive: " + player.isAlive);
    } // end main method
  } // end class
  ```
</details>

#### Exercise 3.1 -- Create Getters and Setters

Incorporate *encapsulation* by setting the fields to `private` and providing *getters* and *setters*. Ensure every field has its corresponding accessor and mutator methods, making a total of ten methods in total. Correct implementation should allow the main method in Example 2 to compile.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class GameCharacter {

    // Define private fields and associated methods here!

    public static void main(String[] args) {
      // Set up a new "GameCharacter" object
      GameCharacter player = new GameCharacter();

      // assign instance variables
      player.setXPosition(0);
      player.setYPosition(0);
      player.setScore(0);
      player.setIsAlive(true);

      // Retrieve information of the assigned values
      System.out.println("Player position: (" + player.getXPosition() + ", " + player.getYPosition() + ")");
      System.out.println("Score: " + player.getScore());
      System.out.println("Is Alive: " + player.isAlive());
    } // end main method
  } // end class
  ```
</details>

#### Exercise 3.2 -- Implement a Constructor

Reduce tedious setup by utilizing a *constructor*. Implement a constructor method and repeat Example 2 using this enhancement.

#### Exercise 3.3 -- Print Player Information

Create a method called `printInfo()` that summarizes the player's status. Following Example 3 should provide insight into its implementation where it outputs the character's information to the terminal.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // Create a new "GameCharacter" object
    GameCharacter player = new GameCharacter("Player1", 0, 0, 0, true);

    // print information
    player.printInfo();
  }
  ```

  This call should print:

  ```
  > INFO
  > Character: Player1
  > Position: (0, 0)
  > Score: 0
  > Is Alive: true
  ```
</details>

#### Exercise 3.4 -- Player Movement

Incorporate movement with a method `move(int deltaX, int deltaY)` to change `xPosition` and `yPosition`. Simulate player movement through this method and print results to the terminal.

#### Exercise 3.5 -- Encounter Enemies

Add an enemy interaction method `encounterEnemy()` to adjust the character’s score and alive status accordingly. It should affect the player in unexpected encounters and output the results.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    // Create a new player
    GameCharacter player = new GameCharacter("Player1", 0, 0, 0, true);

    // Simulate an enemy encounter
    player.encounterEnemy();
  }
  ```

  Upon encountering, it should produce:

  ```
  > Player1 encountered an enemy!
  > Score: 10
  > Is Alive: false
  ```
</details>

#### Exercise 3.6 -- Variable Shadowing

Review the *Variable shadowing* examples below. Understanding how `this` resolves these is vital for Java development.

```Java
public class ShadowExample {
    private int x = 0; // The intended print value

    public void printShadow() {
        int x = 5;
        System.out.println(x); // Unintended print value due to shadowing
    }

    public static void main(String[] args){
        new ShadowExample().printShadow();
    }
}
```

Here's another:

```Java
public class Creature {
  private String title;
  private int id;

  public Creature(String title, int id) {
    title = title; // Unintended behavior due to shadowing, how can this be fixed?
    id = id;
  }
}
```

Think deeply about *local scope*, *global variables*, and when to use `this` to refer to instance fields correctly.

By completing this assignment, you will gain valuable skills in Java development while having fun creating your own game!