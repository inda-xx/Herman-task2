# 🚀 Space Adventure Game

For this exercise, you're tasked with developing a simple game application in Java: the "Space Adventure Game." The primary aim is to implement fundamental object-oriented programming concepts by designing classes that enable player movement, a scoring system, and enemy interactions.

### 💀 Deadline

This work should be submitted by **Friday, 20th October**.

### 👩‍🏫 Instructions

For submission guidance and further instructions, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Ensure you've completed the Module 2 reading in the OLI material and answered the questions:

- Read [Designing Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).

> **Assistant's Note:** Due to slight variations in the material, you're encouraged to read ahead as needed.

### ✅ Learning Goals

This week's learning goals include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter issues, please follow this process:

1. Review [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) for similar questions.
2. If your issue isn't addressed, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title.
3. Consult a Teaching Assistant during a [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Collaborate with your peers, but **do not share answers**.

### 🏛 Assignment

Your task is to develop a simple Java game: *Space Adventure Game*. You're required to model the game entities (Player, Enemy) using Java classes. Follow the exercises below to accomplish this task.

#### Exercise 1.0 -- Fields

In the `src` directory, create a class called `Player.java` with the following fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY

Also, create a class called `Enemy.java` with the fields:

- `String` type
- `int` positionX
- `int` positionY
- `boolean` alive

If implemented correctly, your main method (illustrated below) should compile successfully.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class SpaceAdventure {

      public static void main(String[] args) {
          Player astronaut = new Player("Astronaut", 0, 0, 0);
          Enemy alien = new Enemy("Alien", 5, 5, true);

          astronaut.printInfo();
          alien.printInfo();
      }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters

Ensure field encapsulation by marking them as `private`. Provide getters and setters for each field:

- Player class: 8 methods total (4 getters, 4 setters).
- Enemy class: 8 methods total (4 getters, 4 setters).

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class SpaceAdventure {

      public static void main(String[] args) {
          Player astronaut = new Player("Astronaut", 0, 0, 0);
          astronaut.setScore(10);
          astronaut.setPositionX(2);
          astronaut.setPositionY(3);

          System.out.println("Player " + astronaut.getName() + " has a score of " + astronaut.getScore());
      }
  }
  ```
</details>

#### Exercise 1.2 -- Constructor

Refactor your `Player` and `Enemy` classes to include constructors that initialize field values. Implement the constructors with all necessary parameters.

#### Exercise 1.3 -- printInfo()

Implement a method `printInfo()` in both `Player` and `Enemy` classes to print their details to the terminal.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
      Player astronaut = new Player("Astronaut", 0, 0, 0);
      astronaut.printInfo();
  }
  ```

  Output:
  ```
  Player Name: Astronaut
  Score: 0
  Position: (0, 0)
  ```
</details>

#### Exercise 1.4 -- Player Movement

Add methods to the `Player` class for moving up, down, left, and right. Each method should update the player's `positionX` and `positionY` accordingly and print the updated position.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args) {
      Player astronaut = new Player("Astronaut", 0, 0, 0);
      astronaut.moveUp();
      astronaut.moveRight();
  }
  ```

  Output:
  ```
  Moved to position: (0, 1)
  Moved to position: (1, 1)
  ```
</details>

#### Exercise 1.5 -- Player-Enemy Interaction

Implement a method in the `Player` class that checks if the player's position matches that of an enemy. If true, "attacks" the enemy (set `alive` to `false` for the enemy) and prints a message to the terminal.

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  public static void main(String[] args) {
      Player astronaut = new Player("Astronaut", 0, 5, 5);
      Enemy alien = new Enemy("Alien", 5, 5, true);

      astronaut.interactWithEnemy(alien);
  }
  ```

  Output:
  ```
  Player Astronaut attacked and defeated the Alien!
  ```
</details>

#### Exercise 1.6 -- Variable Shadowing

Discuss the provided variable shadowing examples. Consider how variable names might accidentally "shadow" one another, leading to unexpected behavior. Understand the importance of `this` keyword in resolving such issues.

```java
public class SimpleExample {
    private int number = 42; // I want this number printed :(

    public void showNumber() {
        int number = 7;
        System.out.println(number); // Prints the wrong number. How to fix?
    }

    public static void main(String[] args) {
        new SimpleExample().showNumber();
    }
}
```

> **Assistant's Note:** Be mindful of scope, variable shadowing, instance fields, and understand how the `this` keyword resolves ambiguity.