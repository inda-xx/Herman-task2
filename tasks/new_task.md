# 🎮 Java Game Development: Basic Elements

Welcome to your second programming exercise! This time, we're diving into the world of simple game development using Java. Your mission is to create an elementary game application that incorporates player movement, a scoring system, and enemy interactions. Through this task, you will practice designing Java classes and familiarizing yourself with various components of object-oriented programming in Java.

### 💀 Deadline

Please ensure this task is completed before the next exercise session on **Friday, 23rd September**.

### 👩‍🏫 Instructions

For instructions on how to complete and submit the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before you start coding, make sure to:

- Review [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html) for a better understanding of designing classes.
- Complete any pre-reading materials listed in the course syllabus.

### ✅ Learning Goals

By the end of this exercise, you should be able to:

* Design Java classes
* Add instance fields
* Implement a constructor method
* Create *getters* and *setters*
* Print information to the terminal
* Employ the `main` method
* Understand scope and handle variable shadowing

### 🚨 Troubleshooting Guide

If you encounter any difficulties, follow this procedure:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). See if your problem has been addressed!
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) in the format "Task *x*: *brief problem description*"
3. Seek assistance from a TA during the [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).
4. Discuss with your peers, but **do not share solutions**!

### 🏛 Assignment

In this assignment, your task is to program a simple game in which a player can move around, collect points, and evade or confront enemies. Let's break it down into exercises.

#### Exercise 1.0 -- Fields

Create a Java class named `GameEntity.java` in your `src` directory. For this class, define the following fields:

- `String name`
- `int x` (the x-coordinate representing the position)
- `int y` (the y-coordinate representing the position)
- `int score`
- `boolean isAlive`

If implemented correctly, the following `main` method should compile:

<details>
  <summary> 🛠 Example Main Method </summary>

  ```java
  class GameEntity {

    // Create your fields here!

    public static void main(String[] args) {
      // create an instance of GameEntity
      GameEntity player = new GameEntity();

      // assign instance variables with initial values
      player.name = "Hero";
      player.x = 0;
      player.y = 0;
      player.score = 0;
      player.isAlive = true;

      // display the assigned values
      System.out.println("Name: " + player.name);
      System.out.println("Position: (" + player.x + ", " + player.y + ")");
      System.out.println("Score: " + player.score);
      System.out.println("Is Alive: " + player.isAlive);
    }
  }
  ```

</details>

#### Exercise 1.1 -- Getters and Setters

Encapsulate the fields by setting them to `private` and providing public *getters* and *setters* to interact with them. You will need ten methods for this.

Here's an example main method that should now work with getters and setters:

<details>
  <summary> 🛠 Example Main Method with Getters and Setters </summary>

  ```java
  class GameEntity {

    // Create your fields, getters, and setters here!

    public static void main(String[] args) {
      GameEntity player = new GameEntity();

      // use setters to initialize variables
      player.setName("Hero");
      player.setX(0);
      player.setY(0);
      player.setScore(0);
      player.setAlive(true);

      // use getters to retrieve and print values
      System.out.println("Name: " + player.getName());
      System.out.println("Position: (" + player.getX() + ", " + player.getY() + ")");
      System.out.println("Score: " + player.getScore());
      System.out.println("Is Alive: " + player.isAlive());
    }
  }
  ```

</details>

#### Exercise 1.2 -- Constructor

Skip the repetitive setter calls by implementing a constructor to initialize your game entity objects. Utilize this constructor in your main method to rework example 1.1.

#### Exercise 1.3 -- `printStatus()`

Implement a `printStatus()` method to neatly display all the information about the game entity in the terminal. 

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public static void main(String[] args) {
    GameEntity player = new GameEntity("Hero", 0, 0, 0, true);
    player.printStatus();
  }
  ```

  Expected output:
  ```
  > Name: Hero
  > Position: (0, 0)
  > Score: 0
  > Is Alive: true
  ```

</details>

#### Exercise 1.4 -- Moving and Scoring

Add methods `move(int newX, int newY)` and `addScore(int points)` to your class. These methods should update the position and score, respectively. 

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public static void main(String[] args) {
    GameEntity player = new GameEntity("Hero", 0, 0, 0, true);
    player.move(5, 10);
    player.addScore(15);
    player.printStatus();
  }
  ```

  Expected output:
  ```
  > Name: Hero
  > Position: (5, 10)
  > Score: 15
  > Is Alive: true
  ```

</details>

#### Exercise 1.5 -- Variable Shadowing

Study the following example carefully. You might be asked to explain issues due to variable shadowing. 

```java
class GameEntity {
  private int score = 100; // I want this score used

  public void updateScore() {
    int score = 50;  // Local variable shadowing
    System.out.println("Score: " + score);  // It outputs 50 instead of 100
  }

  public static void main(String[] args) {
    GameEntity entity = new GameEntity();
    entity.updateScore();
  }
}
```

### Conclusion

Having completed this task, you should be more familiar with designing classes in Java, handling encapsulated fields, defining constructors, and manipulating object data through various methods. Good luck, and have fun creating your simple game application!