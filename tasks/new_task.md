# Simple Java Game Development

For this task, you will create a simple game application in Java that involves player movement, a scoring system, and enemy interactions. This assignment will help you to become familiar with the basics of Java classes and object-oriented programming concepts such as encapsulation and constructors.

### 💀 Deadline

This task should be completed before the next exercise session, on **Friday, [Insert Deadline Date]**.

### 👩‍🏫 Instructions

For detailed instructions and submission guidelines, refer to the [course instructions](https://gits-xx.sys.kth.se/course-instructions#assignments).

### 📝 Preparation

To complete this task successfully, you should review the following materials:

- Read [Looking Inside Classes](https://insert-link-here)
- If you're not enrolled yet, sign up at https://kth.x.oli.cmu.edu/ and join the course with key `java-course-2023`.

> **Assistant's Note:** Please read ahead if the materials don't fully align with this year's syllabus.

### ✅ Learning Goals

In this task, you will:

- Design Java classes
- Add instance fields
- Create a constructor method
- Implement *getters* and *setters*
- Print messages to the terminal
- Use the `main` method
- Learn about scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Check this week's [posted issues](https://gits-xx.sys.kth.se/help/issues) to see if others have the same problem.
2. If not, create a [New Issue](https://gits-xx.sys.kth.se/help/issues/new) with a descriptive title.
3. Attend the weekly lab for in-person assistance.

Collaborate with classmates but **do not share solutions**!

### 🏛 Assignment

Design a simple Java game that involves a player, a scoring system, and interactions with enemies. Follow the steps outlined in the exercises below.

#### Exercise 1.0 -- Player Class

Create a new class called `Player.java`. This class will represent the player character in your game. The `Player` class should include:

- `String` playerName
- `int` score
- `int` positionX
- `int` positionY

The main method provided in Example 1 should compile and print the correct information.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {

    // Add your instance fields here

    public static void main(String[] args) {
      // Create a new Player object
      Player player1 = new Player();

      // Assign initial values to the instance variables
      player1.playerName = "Hero";
      player1.score = 0;
      player1.positionX = 0;
      player1.positionY = 0;

      // Print player information
      System.out.println("Player Name: " + player1.playerName);
      System.out.println("Score: " + player1.score);
      System.out.println("Position: (" + player1.positionX + ", " + player1.positionY + ")");
    }
  }
  ```
</details>

#### Exercise 1.1 -- Encapsulation with Getters and Setters

Protect the player's data by setting the access modifiers of the fields in `Player.java` to `private`. Implement *getters* and *setters* for each field. Ensure all methods referenced in Example 2 are implemented correctly.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Player {

    // Add private instance fields here

    // Add getters and setters here

    public static void main(String[] args) {
      // Create a new Player object
      Player player1 = new Player();

      // Set player attributes using setters
      player1.setPlayerName("Hero");
      player1.setScore(0);
      player1.setPositionX(0);
      player1.setPositionY(0);

      // Print player information using getters
      System.out.println("Player Name: " + player1.getPlayerName());
      System.out.println("Score: " + player1.getScore());
      System.out.println("Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
    }
  }
  ```
</details>

#### Exercise 1.2 -- Constructor Method

Implement a constructor in the `Player` class to initialize all fields upon object creation. Refactor the main method to use this constructor.

#### Exercise 1.3 -- Game Actions and Scoring

Add a method `movePlayer(int x, int y)` to change the player's position and update the score every time the player moves. Print the player's new position and score.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    Player player1 = new Player("Hero", 0, 0, 0);
    player1.movePlayer(5, 3);

    player1.printInfo();
  }
  ```

  Output:

  ```
  > Player Hero moved to position (5, 3).
  > Current Score: 10
  ```

</details>

#### Exercise 1.4 -- Enemy Interaction

Create an `Enemy` class similar to `Player`, with an `int` health attribute and a method `interact(Player player)`. Define enemy health and player interactions.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  class Enemy {
    // Add instance fields, constructor, getters, and setters

    public void interact(Player player) {
      // Example interaction
      System.out.println("Player " + player.getPlayerName() + " encountered an enemy!");
      player.setScore(player.getScore() + 5);
    }
  }

  public static void main(String[] args) {
    Player player1 = new Player("Hero", 0, 0, 0);
    Enemy goblin = new Enemy();
    goblin.interact(player1);

    player1.printInfo();
  }
  ```

  Output:

  ```
  > Player Hero encountered an enemy!
  > Current Score after interaction: 5
  ```

</details>

#### Exercise 1.5 -- Variable Shadowing

Understand the issue of variable shadowing using the examples below. Prepare to explain the solutions in class. Review the use of `this` keyword from the [Oracle tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```java
public class ShadowExample {
    private int score = 100; // I want this score to be printed :(

    public void printScore() {
        int score = 50;
        System.out.println(score); // Why is the wrong score printed? :(
    }

    public static void main(String[] args){
        new ShadowExample().printScore();
    }
}
```

> **Assistant's Note:** Consider the distinction between local variables, global variables, and instance fields.

---

These exercises will guide you through creating a foundational simple game application while strengthening your understanding of Java object-oriented programming concepts. Happy coding!