# Simple Java Game App: Code Your Adventure! 🎮

For this programming assignment, you're tasked with designing a simple game in Java. You'll practice your skills in designing classes, using instance fields and constructors, creating getters and setters, and more. Let's create an exciting game where players score points and interact with enemies.

### 💀 Deadline

Complete the assignment by **Friday, 23rd September**.

### 👩‍🏫 Instructions

Please refer to the [course assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for details on how to submit your work.

### 📝 Preparation

Before diving into the coding tasks, make sure to review the following learning materials:

- Read [Designing Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- If you haven’t done so, sign up at https://kth.oli.cmu.edu/ and join with the course key `dd1337-ht22`.

### ✅ Learning Goals

This week's learning goals focus on:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and avoiding variable shadowing

### 🚨 Troubleshooting Guide

If you encounter any problems, here's what you should do:

1. Check the week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if your question has already been answered.
2. If not, post your question by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Be sure to use a descriptive title starting with "Task *x*: *summary of problem*"
3. Ask a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for details.

Remember to discuss and collaborate with your peers—but do not share answers!

### 🏛 Assignment

In this assignment, you'll be creating a simple game application featuring essential gameplay elements: player movement, scoring, and enemy interactions! Let's get started.

#### Exercise 1 - Designing the Classes 📦

Create a new Java class `Player.java`. This class will represent the game's player and include the following fields:

- `String` name
- `int` score
- `int` xPosition
- `int` yPosition

Then create a `Enemy.java` class with the following fields:

- `String` type
- `int` xPosition
- `int` yPosition

#### Exercise 2 - Constructor and Fields 🔧

In each class, add a constructor to initialize the fields. Use parameters to allow user inputs at object creation for more dynamic object creation.

```java
// Example for Player class
public Player(String name, int xPosition, int yPosition) {
    this.name = name;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
    this.score = 0; // default score
}
```

#### Exercise 3 - Adding Getters and Setters 🔍

Encapsulate the fields by making them private and providing *getter* and *setter* methods for each field in both `Player` and `Enemy` classes.

```java
// Example for Player class
public String getName() { return name; }
public void setName(String name) { this.name = name; }

// Do similarly for score, xPosition, yPosition
```

#### Exercise 4 - Printing to Terminal 🖨️

Add a method `printStatus()` in both classes to display their current state.

```java
public void printStatus() {
    System.out.println("Player: " + name + " | Score: " + score + " | Position: (" + xPosition + ", " + yPosition + ")");
}
```

#### Exercise 5 - Main Method and Game Logic 🕹️

Create a `Game.java` class where your `main` method will reside. In this class:

1. Instantiate a `Player` and an `Enemy` object.
2. Demonstrate movement interaction: for that, add methods that allow changing the `Player` and `Enemy` positions.
3. Implement a simple scoring mechanism whenever the player reaches the same position as the enemy.
4. Print status updates to the terminal as events occur.

```java
// Example Main
public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Goblin", 5, 5);

        player.printStatus();
        enemy.printStatus();
        
        // Move the player
        player.move(5, 5);

        // Check for interaction
        if(player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
            player.setScore(player.getScore() + 10);
            System.out.println("Player scored! New score: " + player.getScore());
        }
    }
}
```

#### Exercise 6 - Variable Shadowing 🧠

Ensure you understand the scope of variables. Consider the following incorrect example and modify it to access the correct instance fields using `this`:

```java
public class Example {
    private int number = 42;

    public void printNumber() {
        int number = 24; // local variable shadows the instance field
        System.out.println(number); // fix so it prints the instance field
    }

    public static void main(String[] args) {
        new Example().printNumber();
    }
}
```

Reflect on how using `this` can prevent variable shadowing issues. 

> **Challenge:** Modify your game to include more complex interactions and additional entities! Share your creations and ideas with your peers—you might inspire others!

Happy coding, and may your game adventures be thrilling! 🎮✨