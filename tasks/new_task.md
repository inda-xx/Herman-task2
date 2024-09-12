# Create Your Own Java Adventure!

For this assignment, you will build a simple game application in Java that focuses on player movement, scoring, and enemy interactions. This exercise will reinforce your skills in object-oriented programming and familiarize you with essential Java concepts.

### 📅 Deadline

Complete this task before the next lab session, on **Friday 30th September**.

### 📚 Instructions

Please refer to the instructions in the [assignments section of the course instructions](https://example.com/course-instructions#assignments) for details on how to submit your work.

### 📖 Preparation

Review the following materials to set yourself up for success:

- Read [Java: Designing Classes](https://example.com/java-designing-classes).
- Go through the [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/java/index.html).

### 🎯 Learning Goals

By the end of this assignment, you should be able to:

- Design and structure Java classes.
- Add and use instance fields effectively.
- Implement constructors in your classes.
- Create getters and setters to manage access to class fields.
- Print output to the terminal.
- Use the `main` method as the entry point for your program.
- Understand scope and variable shadowing within Java classes.

### 🛠 Instructions Guide

1. Check this week's [course forum](https://example.com/help-forum) for discussions if you encounter any issue.
2. If your question is not answered, create a [New Issue](https://example.com/help-forum/new-issue).
3. Speak to a TA during [office hours](https://example.com/office-hours-schedule).

Feel free to collaborate with peers, but **do not share code**.

### 🗒 Assignment

In this project, you are tasked with creating a basic Java game. The game involves a player who can move around, interact with enemies, and accumulate points. Follow the exercises below to complete the assignment.

#### Exercise 1.0 -- Class Design

Create a class named `Player`. This class should model the player in your game world, encapsulating the following fields:

- `String name`
- `int x` (representing the player's horizontal position)
- `int y` (representing the player's vertical position)
- `int score`

If implemented correctly, the following code should run successfully in your Player.java:

```java
public class Player {

    // Define fields here

    public static void main(String[] args) {
        // Create a new Player object
        Player hero = new Player();
        
        // Set values for the player
        hero.name = "Hero";
        hero.x = 0;
        hero.y = 0;
        hero.score = 0;

        // Print player's name and initial position
        System.out.println("Player Name: " + hero.name);
        System.out.println("Starting Position: (" + hero.x + ", " + hero.y + ")");
        System.out.println("Current Score: " + hero.score);
    }
}
```

#### Exercise 1.1 -- Getters and Setters

To safeguard the data in your class, make the fields private and create corresponding getters and setters for each field:

- `getName()`, `setName(String name)`
- `getX()`, `setX(int x)`
- `getY()`, `setY(int y)`
- `getScore()`, `setScore(int score)`

Ensure your code adheres to conventions, and add the ability to print information using the method `displayInfo()`:

```java
public class Player {

    // Fields
    private String name;
    private int x, y, score;

    // Getter and setter methods

    public void displayInfo() {
        System.out.println("Player: " + getName());
        System.out.println("Position: (" + getX() + ", " + getY() + ")");
        System.out.println("Score: " + getScore());
    }
    
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0, 0);
        hero.displayInfo();
    }
}
```

#### Exercise 1.2 -- Constructor

Refactor your previous code by adding a constructor that initializes all the instance variables. The constructor will save you from manually setting properties for each instance.

```java
public class Player {

    // Add fields and constructor

    public Player(String name, int x, int y, int initialScore) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.score = initialScore;
    }

    // main method to demonstrate the constructor works
    public static void main(String[] args) {
        Player hero = new Player("Knight", 10, 5, 0);
        hero.displayInfo();
    }
}
```

#### Exercise 1.3 -- Enemy Interaction

Next, create an `Enemy` class with similar characteristics. The `Enemy` class should have the following fields:

- `String name`
- `int x`
- `int y`
- `int damage`

Add a method `interact(Player player)` in the `Enemy` class, which allows the enemy to attack the player. The player’s score decreases by the enemy's damage value. Demonstrate this interaction through your main method:

```java
public class Enemy {
    private String name;
    private int x, y, damage;

    public Enemy(String name, int x, int y, int damage) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.damage = damage;
    }

    public void interact(Player player) {
        System.out.println(this.name + " attacks " + player.getName() + "!");
        player.setScore(player.getScore() - this.damage);
        System.out.println(player.getName() + "'s score is now: " + player.getScore());
    }

    public static void main(String[] args) {
        Player knight = new Player("Knight", 10, 5, 100);
        Enemy goblin = new Enemy("Goblin", 10, 5, 25);
        
        goblin.interact(knight);
        knight.displayInfo();
    }
}
```

#### Exercise 1.4 -- Handling Variable Shadowing

Explore variable shadowing with the following example. Learn how to avoid shadowing using `this` keyword. Here’s an illustrative example:

```java
public class ShadowExample {
    private int level = 1; // We want this level

    public void showLevel() {
        int level = 5;
        System.out.println(level); // Wrong level printed
    }

    public static void main(String[] args) {
        new ShadowExample().showLevel();
    }
}
```

#### Exercise 1.5 -- Win Conditions

Your game should include a method to declare whether the player has won or lost depending on their score or an enemy's action. This task will utilize all your learned skills and combine them into a functioning application.

Take your time completing each exercise meticulously, and reach out if you run into problems. Have fun, and good luck creating your own adventure! 🌟