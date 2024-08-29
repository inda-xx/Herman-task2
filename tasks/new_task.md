# 🕹️ Java Adventure Game Development

For this exercise, you will create a simple game application in Java. You will apply object-oriented programming concepts to design and implement features such as player movement, scoring system, and enemy interactions. Prepare to dive into class design and practice your Java programming skills!

### 💀 Deadline

This assignment is due before the exercise session on **Friday, 23rd September**.

### 👩‍🏫 Instructions

For instructions on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

To prepare for this assignment, ensure you've read the following material:

- [Introduction to Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Review [Encapsulation and Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

> **Assistant's Note:** If you find discrepancies in the course material, it's okay to explore additional examples or resources.

### ✅ Learning Goals

This assignment will help you develop:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚀 Assignment: Create Your Java Adventure Game

#### Overview

Create a text-based adventure game where a player can move around, score points, and interact with enemies. Through this assignment, you will build upon your knowledge of Java classes.

#### Exercise 1 -- Player Class

In the `src` folder, create a new class called `Player.java`. Define the following fields:

- `String name`
- `int xPosition` (the horizontal position of the player)
- `int yPosition` (the vertical position of the player)
- `int score`
- `boolean isAlive`

Instantiate the Player class using the `main` method. Print the player's initial state to the terminal.

<details>
  <summary> 🛠 Example </summary>

```java
class Player {

  // Put your fields here!

  public static void main(String[] args) {
    Player hero = new Player("Hero");

    // Print initial player state
    System.out.println("Player Name: " + hero.name);
    System.out.println("Position: (" + hero.xPosition + ", " + hero.yPosition + ")");
    System.out.println("Score: " + hero.score);
    System.out.println("Is Alive: " + hero.isAlive);
  }
}
```
</details>

#### Exercise 2 -- Getters and Setters

Encapsulate the fields in the `Player` class using private access. Add *getters* and *setters* for each field. Update your `main` method to use these accessors and mutators.

<details>
  <summary> 🛠 Example </summary>

```java
class Player {

  // Put your fields here!

  // Put your getters and setters here!

  public static void main(String[] args) {
    Player hero = new Player("Hero");

    // Use getters and setters with updated main method.
    hero.setXPosition(5);
    hero.setYPosition(5);
    hero.setScore(10);
    hero.setAlive(true);

    System.out.println("Player Name: " + hero.getName());
    System.out.println("Position: (" + hero.getXPosition() + ", " + hero.getYPosition() + ")");
    System.out.println("Score: " + hero.getScore());
    System.out.println("Is Alive: " + hero.isAlive());
  }
}
```
</details>

#### Exercise 3 -- Constructor

Implement a constructor in the `Player` class that initializes name and starting position. Modify the `main` method to use this constructor.

#### Exercise 4 -- Movement Methods

Add two methods in the `Player` class called `moveUp()` and `moveDown()` to adjust the player's `yPosition`. Print the player's position to the terminal after each move.

#### Exercise 5 -- Enemy Class

Create a new class called `Enemy.java` with appropriate fields for its position (`xPosition` and `yPosition`). Consider how player and enemy might interact. Implement a method in `Player.java` to handle interactions when encountering an enemy. Update the player's score and print relevant messages.

#### Exercise 6 -- Scope and Variable Shadowing

Explore the examples of variable shadowing below. Familiarize yourself with the concept, and be prepared to discuss potential fixes in class. Use the [this](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html) keyword when required.

```java
class Example1 {
    private int value = 10;

    public void demonstrateShadowing() {
        int value = 20;
        System.out.println(value); // It is printing the wrong value
    }

    public static void main(String[] args) {
        new Example1().demonstrateShadowing();
    }
}
```

### 🏆 Goals

By completing this assignment, you'll gain practical experience in designing classes, encapsulating data with getters and setters, implementing constructors, addressing variable scope issues, and outputting results to the terminal. 

#### If you encounter any issues during this assignment, consult the following resources:

1. Check this week's [discussion board](https://gits-15.sys.kth.se/inda-22/help/issues) for similar questions.
2. If your problem persists, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title.
3. Approach a teaching assistant during lab sessions.

Collaborate with classmates for discussions, but remember to **uphold academic integrity** by not sharing solutions. Happy coding!