# Arcade Adventure!

For this exercise, you will design and implement a simple game application in Java. This will help you become familiar with the core concepts of object-oriented programming in Java, while adding functionalities such as player movement, scoring systems, and enemy interactions.

### 💀 Deadline

This assignment should be completed by **Friday, 20th September**.

### 👩‍🏫 Instructions

Follow the instructions outlined in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for submitting your assignment.

### 📝 Preparation

Ensure you've reviewed and understood the following material before beginning the assignment:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Understanding Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Getters and Setters](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

### ✅ Learning Goals

The objectives for this task include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you experience any issues, use this plan to resolve them:

1. Examine this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if other students have encountered similar problems.
2. If your issue isn't listed, log it by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title beginning with "Task *x*: *summary of problem*".
3. Seek help from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule to know the next lab session.

Feel free to discuss with peers but **do not share answers**!

### 🏛 Assignment

In this task, you will create a simple game featuring players, scoring systems, and enemy interactions. You'll practice designing Java classes and implementing various programming principles. Get ready to embark on this coding adventure:

#### Exercise 3.0 -- Designing the Game

In the `src` directory, create a new Java class named `Player.java`. This class should include the following fields:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`
- `boolean isAlive`

If implemented correctly, the `main` method provided below should compile without errors when added to `Player.java`.

<details>
  <summary> 🛠 Player Example </summary>

```java
class Player {

    // Place your fields here

    public static void main(String[] args) {
        // Create a new "Player" object
        Player hero = new Player();

        // Assign meaningful values to instance variables
        hero.name = "Hero";
        hero.score = 0;
        hero.xPosition = 5;
        hero.yPosition = 5;
        hero.isAlive = true;
        
        // Print assigned values
        System.out.println("Name: " + hero.name);
        System.out.println("Score: " + hero.score);
        System.out.println("Position: (" + hero.xPosition + ", " + hero.yPosition + ")");
        System.out.println("Is alive: " + hero.isAlive);
    }
}
```
</details>

#### Exercise 3.1 -- Getters and Setters

Encapsulate the fields in `Player` by setting their access modifiers to `private`. Implement the corresponding *getters* and *setters* to ensure you can access and modify these fields.

If implemented correctly, the `main` method provided below should compile successfully when added to `Player.java`.

<details>
  <summary> 🛠 Getters and Setters Example </summary>

```java
class Player {

    // Place your private fields here

    // Place your getters and setters here

    public static void main(String[] args) {
        // Create a new "Player" object
        Player hero = new Player();

        // Assign meaningful values to instance variables
        hero.setName("Hero");
        hero.setScore(0);
        hero.setxPosition(5);
        hero.setyPosition(5);
        hero.setAlive(true);

        // Retrieve and print assigned values
        System.out.println("Name: " + hero.getName());
        System.out.println("Score: " + hero.getScore());
        System.out.println("Position: (" + hero.getxPosition() + ", " + hero.getyPosition() + ")");
        System.out.println("Is alive: " + hero.isAlive());
    }
}
```

</details>

#### Exercise 3.2 -- The Player Constructor

Modify the Player class to include a constructor that initializes the player's name, starting score, and initial position on the game grid. Use the constructor to set these values, replacing the individual setter method calls when creating a new player.

#### Exercise 3.3 -- Printing Info

Implement a `printInfo()` method that outputs comprehensive player information to the terminal.

<details>
  <summary> 🛠 Printing Info Example </summary>

```java
public void printInfo() {
    System.out.println("Player Info");
    System.out.println("Name: " + this.getName());
    System.out.println("Score: " + this.getScore());
    System.out.println("Position: (" + this.getxPosition() + ", " + this.getyPosition() + ")");
    System.out.println("Is alive: " + this.isAlive());
}
```
</details>

#### Exercise 3.4 -- Integrating Enemy Class

Now, create a new class `Enemy.java` with similar attributes for interaction:

- `String type`
- `int xPosition`
- `int yPosition`
- `boolean isAlive`

Define a method in the `Player` class named `interactWithEnemy(Enemy enemy)` to handle interactions, updating player score based on interactions.

<details>
  <summary> 🛠 Enemy Interaction Example </summary>

```java
public void interactWithEnemy(Enemy enemy) {
    if (this.isAlive() && enemy.isAlive()) {
        System.out.println(this.getName() + " interacts with enemy of type " + enemy.getType() + "!");
        // Implement interaction logic here
        this.setScore(this.getScore() + 10); // Example score update
        System.out.println("New score: " + this.getScore());
    }
}
```
</details>

#### Exercise 3.5 -- Exploring Variable Shadowing

Analyze the code snippets below which demonstrate variable shadowing:

```Java
public class ShadowTest {
    private int number = 10;

    public void displayNumber() {
        int number = 5; // this shadows the class-level `number`
        System.out.println("Local number: " + number);
        System.out.println("Instance number: " + this.number); // Access instance variable
    }
}
```

```Java
public class Creature {
    private String name;

    public Creature(String name) {
        this.name = name; // Correctly using `this` to refer to the instance variable
    }

    public void roar() {
        String name = "Unknown";
        System.out.println(name + " roars!"); // Using local `name`, demonstrating variable shadowing
        System.out.println(this.name + " is the real name."); // Accessing the instance name
    }
}
```

Reflect on how the `this` keyword resolves variable shadowing, and be prepared to discuss it in class.

> **Assistant's Note:** Consider the local scope, global variables, and instance fields in these examples. Use `this` to distinguish between instance fields and local variables.