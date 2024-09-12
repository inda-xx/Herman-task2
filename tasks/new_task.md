# Simple Java Game: Adventure Quest!

For this game development exercise, you will be diving into the fundamentals of designing and implementing Java classes. Your task is to create a simple game where players can move, interact with enemies, and earn scores.

### 💀 Deadline

This assignment is due before class, on **Friday 20th October**.

### 👩‍🏫 Instructions

For submission guidelines and further instructions, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

You must carefully read and work through the following resources to prepare for this assignment:

- [Understanding Java Objects and Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Make sure you are registered with the course key `dd1337-ht22` on [OLI](https://kth.oli.cmu.edu/).

> **Assistant's Note:** Stay ahead by revisiting concepts earlier than planned if you do not find all required materials immediately.

### ✅ Learning Goals

By completing this game development assignment, you will learn to:

* Design Java classes
* Add instance fields
* Create constructor methods
* Implement *getters* and *setters*
* Print data to the terminal
* Use the `main` method
* Understand scope and *variable shadowing*

### 🚨 Troubleshooting Guide

If you run into issues, follow these steps:

1. Review the [existing lab issues](https://gits-15.sys.kth.se/inda-22/help/issues) to verify if your problem has been addressed.
2. If not, submit your query by [creating a new issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Game Task: Your Problem."
3. Discuss with peers or ask a TA during weekly lab sessions for assistance.

Remember, discussions are encouraged, but sharing direct answers is not allowed!

### 🏛 Assignment

Welcome to Adventure Quest! In a world filled with mystery and danger, you will be modeling your game mechanics using Java.

#### Exercise 3.0 -- Designing Classes

In the `src` directory, create a new class called `Player.java`. The `Player` class should have the following fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY
- `boolean` isAlive

Also, create an `Enemy.java` class with fields:

- `String` type
- `int` positionX
- `int` positionY
- `int` damage

Ensure that you understand field declarations!

#### Exercise 3.1 -- Getters and Setters

Encapsulation is key. Set all fields to `private` and provide *getters* and *setters* for each. Implement these methods in both `Player` and `Enemy` classes.

To make sure everything works correctly, use the following `main` method in `Game.java`:

```java
class Game {

    public static void main(String[] args) {
        Player hero = new Player("Archer", 0);
        Enemy goblin = new Enemy("Goblin", 5, 5, 10);

        System.out.println("Player Name: " + hero.getName());
        System.out.println("Is Alive: " + hero.isAlive());

        System.out.println("Enemy Type: " + goblin.getType());
        System.out.println("Enemy Damage: " + goblin.getDamage());
    }
}
```

#### Exercise 3.2 -- Constructor Methods

Utilize constructor methods to set initial values. Modify the `Player` and `Enemy` classes to use constructors for initializing objects directly with data.

Example usage:

```java
Player hero = new Player("Warrior", 0, 0, 0, true);
Enemy dragon = new Enemy("Dragon", 8, 8, 20);
```

#### Exercise 3.3 -- Movement and Interactions

Add a method `move` in `Player` that updates the player's position. Implement `interactWithEnemy` in the `Player` class, which decreases the player's life if they reach the enemy's position.

```java
public void move(int deltaX, int deltaY) {
    this.positionX += deltaX;
    this.positionY += deltaY;
}

public void interactWithEnemy(Enemy enemy) {
    if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
        System.out.println("Encounter with " + enemy.getType());
        // Handle animation 
        this.isAlive = false; // Update based on interaction logic
    }
}
```

#### Exercise 3.4 -- PrintInfo Method

Create a `printInfo` method on both `Player` and `Enemy` classes to systematically output their data.

```java
public void printInfo() {
    System.out.println("Player [Name: " + this.name + ", Score: " + this.score + ", Position: (" + this.positionX + "," + this.positionY + ") ]");
}
```

#### Exercise 3.5 -- Score System

Develop a scoring mechanism, updating player's score after each enemy interaction in `interactWithEnemy`.

#### Exercise 3.6 -- Variable Shadowing

Examine the following examples of variable shadowing. Understand how different scopes and usage of `this` affect them.

```java
public class ShadowExample {
    private int level = 1; // The level we want

    public void shadowMethod() {
        int level = 5;
        System.out.println("Level: " + level); // Prints incorrect level
    }

    public static void main(String[] args) {
        new ShadowExample().shadowMethod(); // Fix needed
    }
}
```

In another example:

```java
public class Character {
    private String role;

    public Character(String role) {
        role = role; // This is incorrect. Why?
    }
}
```

> **Takeaway:** Understand how to properly reference instance fields using `this`.

In conclusion, these exercises solidify your understanding of designing classes, handling fields, and correctly using Java's object-oriented features in game development. Good luck adventurer!