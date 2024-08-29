# Adventure Game: Code Your Own Epic Quest!

For this exercise, you are tasked with creating a basic adventure game using Java. Through this assignment, you will practice designing Java classes, manipulating instance fields, and honing your skills with getters, setters, constructors, and more. 

### 📅 Deadline

Complete this assignment before the next class, on **Friday 20th October**.

### 📖 Instructions

For guidance on submitting the assignment, check the [assignments section of our course instructions](https://link.to.course-instructions).

### 🔍 Preparation

Ensure you review the necessary Java concepts and practices:

- Read [Designing Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/class), focusing on class structures.
- Familiarize yourself with [Getters and Setters](https://www.geeksforgeeks.org/getter-and-setter-in-java/).
- Understand [Variable Shadowing](https://en.wikipedia.org/wiki/Variable_shadowing) and the usage of the `this` keyword through [this tutorial](https://www.programiz.com/java-programming/this-keyword).

### 🎯 Learning Goals

By completing this task, you will achieve:

- Designing Java classes
- Adding instance fields
- Using a constructor method
- Creating **getters** and **setters**
- Printing details to the terminal
- Understanding the `main` method
- Avoiding variable shadowing

### 🧭 Troubleshooting Guide

If you encounter challenges, try the following steps:

1. Investigate this week's [posted issues](https://link.to/issues) to see if other students have similar queries.
2. Post a new query by creating a [New Issue](https://link.to/issues/new), and begin the title with "Task: Summary of Issue."
3. Discuss with a TA during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).

Collaborate with classmates, but remember, **no answer sharing!**

### 🏛 Assignment

Embrace your creativity to design and code a simple adventure game in Java!

#### 🚀 Exercise 1: Define Your Adventurer

Create a new class named `Adventurer.java` in your `src` folder. This class should contain attributes to describe an adventurer:

- `String name`
- `int health`
- `int score`
- `int energy`

Define these attributes using private fields. 

Implement:

- **A constructor** that initializes the fields with appropriate values.
- **Getters and Setters** for each field.
- A `printInfo()` method that displays all the adventurer's details.

```java
// Example of usage:
public static void main(String[] args) {
    Adventurer hero = new Adventurer("Aragorn", 100, 0, 50);
    hero.printInfo();
}
```

#### 💥 Exercise 2: Meet the Enemies

Create a class named `Enemy.java` with the following fields:

- `String type`
- `int health`
- `int damage`

Implement:

- **A constructor** to initialize attributes.
- **Getters and Setters** for all fields.
- A `printInfo()` to show enemy details.

```java
// Usage example:
Enemy orc = new Enemy("Orc", 50, 10);
orc.printInfo();
```

#### ⚔️ Exercise 3: Combat Mechanics

Add combat interaction between `Adventurer` and `Enemy`.

In `Adventurer`, implement:

- An `attack` method that reduces the enemy's health by a value based on the adventurer's energy.
- Update the hero's score.

In `Enemy`, implement:

- A `counterAttack` method that reduces the adventurer's health based on the enemy's damage.

```java
// Combat example:
Adventurer hero = new Adventurer("Aragorn", 100, 0, 50);
Enemy orc = new Enemy("Orc", 50, 10);

hero.attack(orc);
orc.counterAttack(hero);
```

#### 🟣 Exercise 4: Scoreboard and Energy Management

Enhance your adventurer class to manage health and energy upon interactions:

- Deduct energy after each attack.
- Increase score for successful hits.
- Print event outcomes to the console.

#### 🌀 Exercise 5: Avoid Variable Shadowing

Analyze the potential for variable shadowing in your code and refactor to prevent it. For example, use the `this` keyword when referring to instance variables within methods.

#### Example: How Shadowing Works and Fix

```java
public class VariableShadow {
    private String name = "Hero";

    public void printName() {
        String name = "Villain"; // This shadows the instance field
        System.out.println(name); // What gets printed? Fix it using `this`.
    }

    public static void main(String[] args) {
        new VariableShadow().printName();
    }
}
```

> **Note:** Remember to keep `this.name` separate from method-scope `name` to avoid shadowing.

---
Ensure each step is completed to build a functional, interactive game with robust class design. Have fun coding your adventure!