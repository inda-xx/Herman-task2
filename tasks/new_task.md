# Create Your Own Java Game

For this exercise, you will create a simple game application in Java. The focus will be on modeling different game components using Java classes. We will emphasize core object-oriented concepts such as designing classes, initializing objects using constructors, and managing interactions between objects. 

### 💀 Deadline

This assignment needs to be completed before the exercise session on **Friday, 10th November**.

### 👩‍🏫 Instructions

Please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments) for details on how to submit your work.

### 📝 Preparation

To succeed in this assignment, make sure you have read the following resources:

- [Designing Classes in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Understanding Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
- [Using Getters and Setters](https://www.geeksforgeeks.org/getter-and-setter-in-java/)
- Read and answer questions in the OLI material for Module 3.

### ✅ Learning Goals

The learning goals for this assignment are:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

In case you encounter issues:

1. Look at this week's [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues).
2. If there aren’t existing solutions, create a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with a descriptive title.
3. Consult a Teaching Assistant during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss with fellow students, but do not share answers!

### 🏛 Assignment

In this assignment, you will create a simple game where a player can move around, score points, and interact with enemies. Your primary objective is to practice designing Java classes, understand encapsulation, and handle object interactions.

#### Exercise 1 -- Fields

Create a new Java class called `Player.java` in the `src` folder with the following fields:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`

Create another class for `Enemy.java` with these fields:

- `String enemyType`
- `int xPosition`
- `int yPosition`

#### Exercise 2 -- Constructor

Add constructors to both classes. The constructor in `Player` should take parameters to initialize the player’s name and starting position, while `score` should start at zero. The constructor in `Enemy` should initialize all fields.

#### Exercise 3 -- Getters and Setters

Add *getters* and *setters* for each field in the `Player` and `Enemy` classes. Ensure that the class fields are `private` to maintain encapsulation. Example code should look like this:

```java
public class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;
    
    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.score = 0;    // Initialize score to 0
        this.xPosition = x;
        this.yPosition = y;
    }
    
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Other getters and setters follow...
}
```

#### Exercise 4 -- Interaction Method

Create a method in `Player` called `move` that has two parameters, `x` and `y`, to update the player’s position. Another method `interactWithEnemy` should take an `Enemy` object and print a statement to the terminal indicating the player’s interaction with the enemy.

```java
public void move(int x, int y) {
    this.xPosition += x;
    this.yPosition += y;
    System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
}

public void interactWithEnemy(Enemy enemy) {
    System.out.println(name + " encountered an " + enemy.getEnemyType());
    // Interaction logic can be added here.
}
```

#### Exercise 5 -- Scoring System

Implement a method called `increaseScore` that increases the player's score by a specified amount and prints the updated score to the terminal.

```java
public void increaseScore(int points) {
    this.score += points;
    System.out.println(name + "'s score is now: " + score);
}
```

#### Exercise 6 -- Main Method

Create a `Game` class with the `main` method. Instantiate a `Player` and multiple `Enemy` objects. Demonstrate the movement and interaction functionality by calling their respective methods and print results to the terminal.

```java
public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 5, 5);
        
        player1.move(4, 4);
        player1.increaseScore(10);
        player1.interactWithEnemy(goblin);
    }
}
```

#### Exercise 7 -- Variable Shadowing

Explain how you would avoid variable shadowing in the `move` method or constructor of any of the classes. Explore why it might be an issue and how using `this` can help clarify scope.

If done correctly, you should be able to see clear results printed from each interaction and method call, demonstrating a working class structure and game loop. Happy coding!