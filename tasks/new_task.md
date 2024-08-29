# Java Game Development: Fundamentals with Object-Oriented Design

For this exercise, you are going to create a simple game application in Java. This task will help you understand the basic components of a Java class, such as object-oriented programming principles and encapsulation. You'll be implementing key concepts like player movement, a scoring system, and enemy interactions within your game.

### 💀 Deadline

Ensure you complete this assignment by **Friday, November 3rd**.

### 👩‍🏫 Instructions

Please follow the instructions set out in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting, ensure you have a firm grasp on the following topics:

- Read [Object-Oriented Programming Fundamentals](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Register on [OLI Platform](https://kth.oli.cmu.edu/) using the course key `dd1337-ht22` if you haven't done so already.

### ✅ Learning Goals

By completing this assignment, you will learn how to:

- Design Java classes
- Add instance fields
- Add a constructor method
- Create *getters* and *setters*
- Print to the terminal
- Use the `main` method
- Understand Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

Should you encounter any issues, please follow the steps below:

1. Check for any [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) related to your problem.
2. If no similar issue is found, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a descriptive title starting with "Game Task: *your issue summary*".
3. Ask a TA during your [weekly lab](https://queue.csc.kth.se/Queue/INDA). Find your schedule for the next lab session.

Feel free to collaborate with your peers, but **do not share code directly**!

### 🏛 Assignment

Develop a simple terminal-based game using Java. The game will consist of a player who can move, enemies the player can interact with, and a scoring system to track success.

#### Exercise 1: Class Design

Create a `Game` class. Define the following fields:

- `String playerName`
- `int playerScore`
- `int playerPosition`
- `String enemyName`
- `int enemyPosition`
- `boolean gameRunning`

Include example usage in `main`:

```java
public class Game {

    // Instance fields go here

    public static void main(String[] args) {
        Game game = new Game();

        // Set initial values
        game.playerName = "Player1";
        game.playerScore = 0;
        game.playerPosition = 0;
        game.enemyName = "Enemy1";
        game.enemyPosition = 5;
        game.gameRunning = true;

        // Print initial game status
        System.out.println("Welcome " + game.playerName);
        System.out.println("Your score is " + game.playerScore);
        System.out.println(game.enemyName + " is at position " + game.enemyPosition);
    }
}
```

#### Exercise 2: Getters and Setters

Make all fields `private` and add appropriate *getters* and *setters*. Use them in `main` to print player and game status:

```java
public class Game {

    // Private instance fields

    // Getters and Setters

    public static void main(String[] args) {
        Game game = new Game();

        // Initialize values using setters
        game.setPlayerName("Player1");
        game.setPlayerScore(0);
        game.setPlayerPosition(0);
        game.setEnemyName("Enemy1");
        game.setEnemyPosition(5);
        game.setGameRunning(true);

        // Access and print status using getters
        System.out.println("Welcome " + game.getPlayerName());
        System.out.println("Your score is " + game.getPlayerScore());
        System.out.println(game.getEnemyName() + " is at position " + game.getEnemyPosition());
    }
}
```

#### Exercise 3: Constructor Method

Add a constructor that initializes the `Game` with player and enemy information:

```java
public Game(String playerName, String enemyName, int enemyPosition) {
    // Initialize instance fields
}

// Update main to use constructor
Game game = new Game("Player1", "Enemy1", 5);
```

#### Exercise 4: Printing Game Info

Implement a method `printGameState()` that shows current game status:

```java
public void printGameState() {
    System.out.println("Player: " + getPlayerName() + ", Score: " + getPlayerScore());
    System.out.println("Enemy: " + getEnemyName() + ", Position: " + getEnemyPosition());
}

// Use this method in main
game.printGameState();
```

#### Exercise 5: Player Movement and Scoring

Introduce methods to move the player and update the score:

```java
public void movePlayer(int steps) {
    int playerPosition = getPlayerPosition() + steps;
    setPlayerPosition(playerPosition);
    System.out.println("Player moved to position: " + getPlayerPosition());
}

public void updateScore(int points) {
    int score = getPlayerScore() + points;
    setPlayerScore(score);
    System.out.println("Score updated: " + getPlayerScore());
}

// Implement in main
game.movePlayer(3);
game.updateScore(10);
game.printGameState();
```

#### Exercise 6: Enemy Interactions

Develop logic to handle interactions between player and enemy:

```java
public void encounterEnemy() {
    if (getPlayerPosition() == getEnemyPosition()) {
        System.out.println("Encountered " + getEnemyName() + "!");
        updateScore(-5);
    }
}

// Call this method in main to simulate interaction
game.movePlayer(2); // Adjust position as needed for interaction
game.encounterEnemy();
game.printGameState();
```

#### Exercise 7: Scope and Variable Shadowing

Understand scope by trying to print variables with the same name in different scopes. Identify issues and use `this` keyword to resolve variable shadowing.

```java
public class Game {
    private int position = 1;

    public void printPosition() {
        int position = 10;
        System.out.println(position); // This prints the local variable
        System.out.println(this.position); // This prints the instance variable
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.printPosition();
    }
}
```

Be prepared to discuss variable shadowing and demonstrate your understanding of the `this` keyword in class.