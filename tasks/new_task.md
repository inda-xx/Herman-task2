# Space Invaders Challenge!

For the upcoming exercise in our programming course, you'll be diving into game development by constructing a simple Space Invaders-inspired game in Java. You will learn to model game components using Java classes and to integrate functionalities for player movement, scoring, and enemy interactions.

### 💀 Deadline

This assignment is due **Friday, November 10th**. Be sure to complete and submit it on time!

### 👩‍🏫 Instructions

For detailed submission guidelines, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation

Before you start coding, ensure that you have completed the preparatory work for Module 3:

- Review the [Java Classes and Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=abcd1234efgh5678ijkl9012mnop3456).
- Sign up at https://kth.oli.cmu.edu/ if you haven't already, using the course key `dd1338-ht23`.

> **Assistant's Note:** Make sure to preview upcoming materials, as some OLI resources may be out of sync with the current term.

### ✅ Learning Goals

By the end of this assignment, you should be familiar with:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

Here’s what you should do if you have questions:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues) for similar problems raised by others.
2. If you can’t find your problem, create a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with a descriptive title.
3. Seek help from a TA at your next [lab session](https://queue.csc.kth.se/Queue/INDA).

Feel free to discuss with classmates, but remember: **do not share code solutions**!

### 🏛 Assignment

Ever wondered how a game like *Space Invaders* is built? This time, you’ll be creating your own version by modeling components in Java! Let’s blast off!

#### Exercise 1 -- Game Classes and Fields

1. In the `src` directory, create a new class called `Player.java`. Your `Player` class should have these fields:
   - `String` playerName
   - `int` score
   - `int` position
   - `boolean` isAlive

   In a similar manner, create another class called `Enemy.java`, with fields:
   - `String` enemyType
   - `int` enemyPosition
   - `boolean` isDefeated

2. Adjust your classes so the following `main` method in `Game.java` compiles and runs.

<details>
  <summary> 🛠 Here's Example 1 </summary>

  ```java
  class Game {

      public static void main(String[] args) {
          Player player1 = new Player("Space Ace");
          Enemy alien = new Enemy("Alien Invader", 5);

          player1.setPosition(3);
          System.out.println("Player: " + player1.getPlayerName());
          System.out.println("Position: " + player1.getPosition());
          System.out.println("Score: " + player1.getScore());

          System.out.println("Fighting: " + alien.getEnemyType() + " at position " + alien.getEnemyPosition());
      }
  }
  ```
</details>

#### Exercise 2 -- Getters, Setters, and Constructors

Learn to encapsulate your data:

- Mark all fields in `Player` and `Enemy` as `private`.
- Implement *getters* and *setters* for each field. This will lead to eight methods for both `Player` and `Enemy`.

- Define constructors for each class. For `Player`, include `playerName` and initial position as parameters. For `Enemy`, use `enemyType` and initial enemy position.

If implemented correctly, the provided `main` should function with constructors.

#### Exercise 3 -- Print Game Status

Create a `printStatus()` method in both `Player` and `Enemy` classes. For `Player`, include details such as name, score, and position. For `Enemy`, print the type, position, and whether defeated.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public static void main(String[] args) {
      Player player1 = new Player("Space Ace", 3);
      Enemy alien = new Enemy("Alien Invader", 5);

      player1.printStatus();
      alien.printStatus();
  }
  ```

  This should produce output like:
  ```
  > Player: Space Ace
  > Score: 0
  > Position: 3

  > Enemy: Alien Invader
  > Position: 5
  > Defeated: false
  ```
</details>

#### Exercise 4 -- Enemy Interactions

Create a method `interactWithEnemy()` in the `Player` class, simulating interaction based on positions. If player and enemy positions coincide, update `isDefeated` and increment player’s score.

<details>
  <summary> 🛠 Check Out This Interaction </summary>

  ```java
  public static void main(String[] args) {
      Player player1 = new Player("Space Ace", 5);
      Enemy alien = new Enemy("Alien Invader", 5);

      player1.interactWithEnemy(alien);
      player1.printStatus();
      alien.printStatus();
  }
  ```

  Expected output:
  ```
  > Space Ace encountered Alien Invader!
  > Player: Space Ace
  > Score: 1
  > Position: 5

  > Enemy: Alien Invader
  > Position: 5
  > Defeated: true
  ```
</details>

#### Exercise 5 -- Variable Shadowing

Review the following shadowing exemplars. Prepare to discuss the fix in the class. Research Java's *this* keyword and *variable shadowing* on [Wikipedia](https://en.wikipedia.org/wiki/Variable_shadowing) and [Oracle](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```Java
public class ShadowDemo {

    private int number = 0; // I want this number printed!

    public void printShadow() {
        int number = 10;
        System.out.println(number); // Prints the local variable number. How to print the field?
    }

    public static void main(String[] args){
        new ShadowDemo().printShadow();
    }
}
```

Consider this scenario too:

```Java
public class Alien {

  private String type;
  private int powerLevel;

  public Alien(String type, int powerLevel) {
    type = type; // What's the issue here?
    powerLevel = powerLevel;
  }

  public void showDetails() {
    String type = "Basic Alien";
    System.out.println(type + " details:");
  }
}
```

> **Assistant's Note:** Reflect on the roles of instance fields, global scope, and local variables in these examples.