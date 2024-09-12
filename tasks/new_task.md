# 🕹️ Simple Adventure Game

For this project, you will create a simple Java game application that involves player movement, a scoring system, and interactions with enemies. This exercise aims to solidify your understanding of the foundational components of Java programming: designing classes, working with instance fields, and managing scope.  

### 🚀 Deadline
Please ensure the assignment is completed by **Friday, November 10th**.

### 📚 Preparation
Before starting, please review Module 3 of the OLI material:

- Read [Objects: Designing Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=d9f5e808adbf0e8883278bec9c783166)

Activate your OLI account at [OLI KTH](https://kth.oli.cmu.edu/), using course key `dd1337-ht22`, if you haven't already joined.

### 🎯 Learning Goals

This assignment will help you achieve the following objectives:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🔧 Troubleshooting Guide
If you encounter issues, follow these steps:

1. Look at [weekly issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see what others have reported.
2. If your problem is new, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Use a descriptive title starting with "Task *x*: *summary of the problem*".
3. Ask a Teaching Assistant (TA) in person during [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA).
4. Discuss with classmates, but remember not to share answers directly.

### 🎮 Assignment
In this assignment, you will model a simple game within a Java application. You'll design classes to represent the player, enemies, and the game world, focusing on essential Java programming concepts.

#### Exercise 1: Create the Player Class
In the `src` folder, create a class called `Player.java`. Your player should have the following fields:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`

Ensure the fields are set to `private` to ensure encapsulation.

#### Exercise 2: Implement the Constructor
Create a constructor for the `Player` class that initializes the name, score, and positions. Initialize the score to 0 and positions to a default starting point.

```java
public Player(String name, int startX, int startY) {
    this.name = name;
    this.xPosition = startX;
    this.yPosition = startY;
    score = 0;
}
```

#### Exercise 3: Getters and Setters
Implement getters and setters for each field, except the `score` can remain read-only (no setter needed).

```java
public String getName() { return name; }
public int getScore() { return score; }
public int getXPosition() { return xPosition; }
public int getYPosition() { return yPosition; }

public void setXPosition(int x) { this.xPosition = x; }
public void setYPosition(int y) { this.yPosition = y; }
```

#### Exercise 4: Player Movement
Add a method `move(int xChange, int yChange)` that adjusts the player's position:

```java
public void move(int xChange, int yChange) {
    xPosition += xChange;
    yPosition += yChange;
    System.out.println(name + " moved to position (" + xPosition + ", " + yPosition + ")");
}
```

#### Exercise 5: Score Management
Implement a method `increaseScore(int points)` to add points to the player's score. Print the updated score to the terminal:

```java
public void increaseScore(int points) {
    this.score += points;
    System.out.println(name + " scored! New score: " + score);
}
```

#### Exercise 6: Game Class and Enemy Interaction
Create another class `Game.java` that models how the player interacts with enemies:

- **Enemy** should have `int xPosition`, `int yPosition`, and a method `interact(Player player)`.
- If the player interacts with an enemy, increase the player’s score.

```java
class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public void interact(Player player) {
        if (player.getXPosition() == xPosition && player.getYPosition() == yPosition) {
            player.increaseScore(10);  // Example interaction reward
            System.out.println("You encountered an enemy!");
        }
    }
}

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        Enemy enemy1 = new Enemy(5, 5);
        
        player1.move(5, 5);
        enemy1.interact(player1);
    }
}
```

By following these steps, you will deepen your understanding of Java OOP fundamentals while building an engaging simple game. Good luck, and happy coding!