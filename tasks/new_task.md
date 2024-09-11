# Let's Build a Game in Java!

For this assignment, you will practice object-oriented programming in Java by implementing a simple game. You will sharpen your skills in designing classes, using constructors, and understanding scope.

### 💀 Deadline

This assignment is due before the exercise session on **Friday, 21st November**.

### 👩‍🏫 Instructions

For complete instructions on how to complete and submit the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation

To prepare for this assignment, make sure you:

- Review [Designing Classes in Java](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).
- Create or go to your account at https://kth.oli.cmu.edu/ and register with the course key `dd1337-ht23`.

### ✅ Learning Goals

By the end of this assignment, you should be able to:

- Design Java classes effectively.
- Add instance fields and use constructors.
- Implement getters and setters for encapsulation.
- Print data to the terminal.
- Use the `main` method to run your program.
- Understand scope and variable shadowing.

### 🚨 Troubleshooting Guide

If you encounter any issues:

1. Check the [FAQ section](https://gits-15.sys.kth.se/inda-23/help/issues) for similar problems faced by other students.
2. If you can't find a solution to your problem, post a question by creating a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new).
3. Attend the weekly labs and ask the TAs for help. Find your schedule [here](https://queue.csc.kth.se/Queue/INDA).

Remember, collaboration is encouraged, but **do not share your answers**!

### 🏛 Assignment

In this task, you will implement a simple text-based game in Java. Imagine a world where players navigate a grid, collect points, and encounter enemies. Your game will have a player character, enemies, and a scoring system.

#### Exercise 1 -- Fields and Constructor

Create a class `Player` in a new file `Player.java`. The class should have the following fields:

- `String name`
- `int positionX`
- `int positionY`
- `int score`

Add a constructor to initialize these fields. If your constructor is correctly implemented, the main method in Example 1 should compile.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {

    // Define your fields here

    // Implement your constructor

    public static void main(String[] args) {
      Player player = new Player("Hero", 0, 0, 0);
      System.out.println("Player " + player.name + " is at position (" + player.positionX + ", " + player.positionY + ") with score: " + player.score);
    }
  }
  ```
</details>

#### Exercise 2 -- Getters and Setters

Change the access level of `Player` fields to `private` to practice encapsulation. Implement getters and setters to modify and access these fields. Example 2 should compile correctly if done right.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Player {

    // Define your fields here

    // Implement getters and setters

    public static void main(String[] args) {
      Player player = new Player("Hero", 0, 0, 0);
      player.setPositionX(1);
      player.setPositionY(1);
      player.setScore(10);
      System.out.println("Player " + player.getName() + " is at position (" + player.getPositionX() + ", " + player.getPositionY() + ") with score: " + player.getScore());
    }
  }
  ```
</details>

#### Exercise 3 -- Enemy Class and Interaction

Create a class `Enemy` with similar fields as the `Player`: `name`, `positionX`, and `positionY`, along with methods to interact with a player (for example, reduce player's score if they collide).

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  class Enemy {

    // Define your fields and methods

  }

  class Player {

    // Previous code unchanged

    public void collideWithEnemy(Enemy enemy) {
      // Implement what happens when a player collides with an enemy
    }
  }

  public static void main(String[] args) {
    Player player = new Player("Hero", 0, 0, 10);
    Enemy enemy = new Enemy("Goblin", 1, 1);
    player.collideWithEnemy(enemy);
    player.printInfo(); // Implement this method to show player info
  }
  ```
</details>

#### Exercise 4 -- Game Loop

In the main method of a new `Game` class, create a simple loop that simulates player movement and interaction with enemies. Ensure you print out game status using methods like `printInfo`.

<details>
  <summary> 💻 Code snippet </summary>

  ```java
  class Game {
    public static void main(String[] args) {
      Player player = new Player("Hero", 0, 0, 0);
      Enemy enemy = new Enemy("Orc", 2, 2);

      // Simple game loop
      for (int i = 0; i < 5; i++) {
        player.moveRandomly(); // Assume you implement this
        if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
          player.collideWithEnemy(enemy);
        }
        player.printInfo();
      }
    }
  }
  ```
</details>

#### Exercise 5 -- Variable Shadowing

Variable shadowing can lead to subtle bugs. Review the examples below and explain how you would fix them.

```java
public class Shadow1 {
    private int number = 10; // Intended to print

    public void printShadow() {
        int number = 5; // Shadowing the field
        System.out.println(number); // Prints local variable
    }

    public static void main(String[] args){
        new Shadow1().printShadow();
    }
}
```

```java
public class Creature {
  private String name;

  public Creature(String name) {
    this.name = name; // Correct way to refer to instance field
  }

  public void speak(){
    String name = "Wild Creature"; // Local variable shadowing
    System.out.println(name + " makes a sound!");
  }
}
```

Understanding variable shadowing and using `this` keyword appropriately is essential in preventing accidental bugs.

> **Note:** It is essential to use the `this` keyword to refer to class fields, especially when constructor or method parameters have the same name as class fields.