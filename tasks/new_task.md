# Simple Game Application in Java

For this programming task, you will develop a basic game application in Java. The application will involve modeling player and enemy interactions. Throughout this task, you will explore various concepts of object-oriented programming in Java, focusing on designing classes, managing player movement, implementing a scoring system, and handling enemy interactions.

### 💀 Deadline

This task should be completed and submitted by **Friday, 20th October**.

### 👩‍🏫 Instructions

For submission instructions, please refer to the [course assignments page](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation

To prepare for this task, ensure you have thoroughly read and understood the following materials:

- [Designing Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- [Encapsulation and Access Modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)
- [Constructors in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

> **Assistant's Note:** Familiarize yourself with the material before starting the assignment. Any additional material in your OLI modules can be helpful.

### ✅ Learning Goals

This assignment aims to help you learn and practice the following:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (*variable shadowing*)

### 🚨 Troubleshooting Guide

If issues arise during the task:

1. Review the week's [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues).
2. Submit a new question by [Creating an Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with a descriptive title.
3. Seek guidance from a TA during [weekly labs](https://queue.csc.kth.se/Queue/INDA).

Please engage in discussions with peers, but refrain from sharing direct answers.

### 🚀 Assignment

In this task, you will implement a simple game system. Your game will include a player that can move, score, and interact with enemies.

#### Exercise 1.0 -- Designing the Classes

Create a new class `Player.java` in the `src` folder. As part of your class creation:

- Introduce the following fields:
  - `String name`
  - `int score`
  - `int positionX`
  - `int positionY`
  - `boolean isActive`
  
- Design a class `Enemy.java` with these fields:
  - `String type`
  - `int positionX`
  - `int positionY`
  - `int damageValue`

Add the necessary instance fields in each class.

#### Exercise 1.1 -- Getters and Setters

Use encapsulation by setting the fields to `private` and creating public *getters* and *setters* for all of them. If done correctly, the main method with console output for the player's information should compile and execute:

```java
class Player {
    // Fields here
    // Getters and setters here
    
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 10, 10, true);
        
        System.out.println("Player Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
        System.out.println("Is Active: " + player1.isActive());
    }
}
```

#### Exercise 1.2 -- Constructor Method

Implement constructors for both `Player` and `Enemy` classes that allow setting the initial values of instance fields. Replace individual setter calls with constructor initialization where appropriate. Example:

```java
class Player {
    // Constructor and other methods here
    
    public Player(String name, int score, int posX, int posY, boolean isActive) {
        this.name = name;
        this.score = score;
        this.positionX = posX;
        this.positionY = posY;
        this.isActive = isActive;
    }
}
```

#### Exercise 1.3 -- Movement and Scoring System

Add methods to `Player` class:

- `move(int deltaX, int deltaY)`: Adjusts the player's position.
- `increaseScore(int points)`: Increases the player's score.

Ensure each method prints the action taken to the console for verification.

#### Exercise 1.4 -- Enemy Interactions

Add a method `interact(Enemy enemy)` in the `Player` class. If the player interacts with an enemy, reduce the player's score by the enemy's `damageValue`. Print interaction details:

```java
void interact(Enemy enemy) {
    System.out.println(getName() + " encountered an enemy of type: " + enemy.getType());
    score -= enemy.getDamageValue();
    System.out.println("Current Score: " + score);
}
```

#### Exercise 1.5 -- Variable Shadowing

Observe and rectify variable shadowing:

```java
public class ShadowExample {
    private int positionX = 5;

    public void changePosition() {
        int positionX = 10;
        System.out.println(positionX); // Incorrect: prints the local positionX
    }

    public static void main(String[] args) {
        new ShadowExample().changePosition();
    }
}
```

Understand how `this` can solve variable shadowing issues.

Enjoy building your game! As you complete each exercise, test your classes thoroughly for robustness and correct behavior.