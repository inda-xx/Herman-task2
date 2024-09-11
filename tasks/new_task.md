# Bee Adventures Game Project

For this assignment, you're tasked with creating a simple game application in Java, called **Bee Adventures**. You'll be designing various components of the game to practice Java basics, focusing on object-oriented programming concepts. Through this project, you'll develop a better understanding of how Java classes operate and interact in a gaming context.

### 📅 Deadline

Complete this assignment before the class on **Friday, 17th November**.

### 📚 Instructions

Please refer to the [assignments section of the course instructions](https://yourcourseurl.com). Make sure to follow all submission guidelines and deadlines.

### 📖 Preparation

Be sure to read and engage with the learning materials for Module 5.

- Review [Understanding Java Classes](https://youronlinecourseurl.com/java-classes)
- Complete Module 5 exercises and quizzes on Java basics.

> **Note:** You might need to spend additional time exploring Java concepts if you encounter difficulties in understanding the exercises.

### 🎯 Learning Goals

This week's project aims to teach you the following:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and variable shadowing

### 🛠 Troubleshooting Guide

In case you have any questions or run into issues, here are some steps to help you out:

1. Check our [course forum](https://courseforum.com) for similar issues.
2. Post your question with a detailed description in our [new issue section](https://courseforum.com/new-issue).
3. Consult a TA during our scheduled lab sessions.

Collaborate with peers, but remember to **avoid sharing code directly**.

### 🎮 Assignment

Welcome to the world of **Bee Adventures**, where you will create a basic Java game involving players, scores, and enemies. You'll implement the game logic and game interactions.

#### Exercise 1 -- Player and Enemy Classes

Create two classes `Player` and `Enemy` within the `src` directory to represent the actors in the game. Each class should have the following fields:

- **Player**:
  - `String` playerName
  - `int` score
  - `int` positionX
  - `int` positionY

- **Enemy**:
  - `String` enemyName
  - `int` strength
  - `int` positionX
  - `int` positionY

Correct implementation will allow the Example 1 code to compile.

<details>
<summary>🛠 Example 1</summary>

```java
public class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    // Getters and Setters
    // ...
}

public class Enemy {
    private String enemyName;
    private int strength;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String enemyName, int strength) {
        this.enemyName = enemyName;
        this.strength = strength;
        this.positionX = 5; // Random starting positions
        this.positionY = 5;
    }

    // Getters and Setters
    // ...
}

public class Main {
    public static void main(String[] args) {
        Player bee = new Player("Bee");
        Enemy wasp = new Enemy("Wasp", 8);

        // Display initial states
        System.out.println("Player: " + bee.getPlayerName() + " is at (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Enemy: " + wasp.getEnemyName() + " is at (" + wasp.getPositionX() + ", " + wasp.getPositionY() + ")");
    }
}
```
</details>

#### Exercise 2 -- Getters and Setters

Encapsulate your fields in the `Player` and `Enemy` classes with `private` access, and provide public *getter* and *setter* methods for each field to control access.

If done right, the main method in Example 2 should compile seamlessly.

<details>
<summary>🛠 Example 2</summary>

```java
public class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor, Getters, and Setters
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 3;
        this.positionY = 3;
    }

    public String getPlayerName() {
        return playerName;
    }

    // Other getters and setters...
}

public class Main {
    public static void main(String[] args) {
        Player bee = new Player("Bee");
        bee.setScore(10);
        bee.setPositionX(2);
        bee.setPositionY(2);

        // Output to console
        System.out.println("Player: " + bee.getPlayerName() + " Score: " + bee.getScore());
        System.out.println("Position: (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
    }
}
```
</details>

> **Note:** String fields use plain getters and setters, while boolean fields use `is` and `setIs` for convention.

#### Exercise 3 -- Game Movement and Scoring

Implement a method in the `Player` class named `move` to change its position, and a scoring system that increments the player's score whenever they reach a specific location.

Use Example 3 
<details>
<summary>🛠 Example 3</summary>

```java
public class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String playerName) {
        // ...
    }

    // Implementing move
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        score++; // Increment score with every move
    }

    // Getters and setters...
}

public class Main {
    public static void main(String[] args) {
        Player bee = new Player("Bee");

        bee.move(1, 0); // Move right
        bee.move(0, 1); // Move up

        // Print info
        System.out.println("Player moved to: (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Player score: " + bee.getScore());
    }
}
```
</details>

#### Exercise 4 -- Enemy Interaction

Create a method `interactWithEnemy` in the `Player` class that checks if the player lands on the same position as an enemy. If so, print an encounter message to the terminal, and deduct points from the player's score depending on the enemy's strength.

<details>
<summary>🛠 Example 4</summary>

```java
public class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor, getters, setters...

    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Encountered " + enemy.getEnemyName() + "!");
            this.score -= enemy.getStrength();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player bee = new Player("Bee");
        Enemy wasp = new Enemy("Wasp", 8);

        bee.move(2, 2);
        bee.interactWithEnemy(wasp);

        // Print player status
        System.out.println("Player score after interaction: " + bee.getScore());
    }
}
```
</details>

#### Exercise 5 -- Variable Shadowing

Consider the *variable shadowing* examples and understand how Java handles scope and access to member variables. Be ready to discuss solutions in class.

##### Example:

```java
public class ShadowExample {
    private int number = 1; // This should be printed: 1

    public void printNumber() {
        int number = 2; // Shadowing instance variable
        System.out.println(number); // Outputs 2 instead of 1
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printNumber();
    }
}
```

> **Tip:** Explore the use of `this` keyword to distinguish between instance variables and local variables.

By completing these exercises, you'll gain a robust understanding of Java fundamentals related to class design, object interaction, and code management. 🐝 Good luck with your Bee Adventures game development!