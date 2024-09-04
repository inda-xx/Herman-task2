# Space Adventure Game

For the **Space Adventure** assignment, you are going to create a simple game application in Java. This exercise will help you practice designing Java classes, working with instance fields, creating constructors, generating getters and setters, and managing game elements like player and enemy interactions.

### 🎯 Deadline

This task should be completed by **Friday, 23rd September**.

### 🎓 Instructions

Please follow the guide on how to do and submit the assignment, found in the [course instructions](https://example.com/assignments). 

### 📚 Preparation

Ensure you review the materials in this week's module focused on Java classes and objects:

- Read [Understanding Java Classes](https://example.com/understanding-java-classes)
- Register and sign up for additional learning resources (if provided by your instructor).

### 🎯 Learning Goals

By completing this exercise, you will learn:

- Designing Java classes
- Adding instance fields
- Creating a constructor method
- Implementing getters and setters
- Printing information to the terminal
- Using the `main` method
- Handling scope and variable shadowing

### 🚀 Troubleshooting

If you encounter any issues:

1. Refer to the [forums](https://example.com/help/discussions) to see if others have similar problems.
2. Reach out with a [New Issue](https://example.com/help/issues/new), including a descriptive title and problem summary.
3. Discuss with your classmates or ask a TA during labs.

**Remember:** Engage in discussions but do not share code directly!

### 🏆 Assignment

In this task, you will build a `SpaceAdventure` game with core functionalities including player movement, scoring, and enemy interactions.

#### Exercise 1.0 -- Creating the Player Class

Create a class `Player` in the `src` directory with the following fields:

- `String name`
- `int score`
- `int xPosition`
- `int yPosition`

Implement a constructor to initialize these fields. Here's a snippet to help you get started:

```java
public class Player {
  
  private String name;
  private int score;
  private int xPosition;
  private int yPosition;

  public Player(String name, int xPosition, int yPosition) {
    this.name = name;
    this.score = 0;
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  // Add additional getters and setters for other fields
  
}
```

#### Exercise 1.1 -- Designing the Game Mechanics

Implement a `Game` class to manage the player's scores and movements. It should contain:

- Methods to move the player on a grid (`moveLeft`, `moveRight`, `moveUp`, `moveDown`).
- A way to increase the player's score.
- Print the player's current position and score to the terminal.

```java
public class Game {
  private Player player;

  public Game(String playerName, int startX, int startY) {
    this.player = new Player(playerName, startX, startY);
  }

  public void printPlayerStatus() {
    System.out.println("Player: " + player.getName());
    System.out.println("Score: " + player.getScore());
    System.out.println("Position: (" + player.getXPosition() + ", " + player.getYPosition() + ")");
  }

  // Implement move and score methods
  
  public static void main(String[] args) {
    Game game = new Game("Explorer", 0, 0);
    game.printPlayerStatus();
    game.moveRight();
    game.moveUp();
    game.printPlayerStatus();
  }
}
```

#### Exercise 1.2 -- Adding Enemy Interactions

Create an `Enemy` class with its own fields such as `xPosition` and `yPosition`, and methods to interact with the player.

```java
public class Enemy {
  
  private int xPosition;
  private int yPosition;

  public Enemy(int xPosition, int yPosition) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }

  // Implement interaction methods with player
  
}
```

In the `Game` class, add logic to handle interactions when a player encounters an enemy, such as reducing player score.

#### Exercise 1.3 -- Ensuring Correct Scope

Be aware of variable shadowing when creating similar variables, especially related to positions or scores in both `Player` and `Enemy`. Use `this` keyword to reference instance fields appropriately.

Consider this example of variable shadowing:

```java
public class Example {
  private int score = 10;

  public void duplicateScore(int score) {
    score = this.score; // Correctly accessing the instance variable `score`
  }
}
```

### 🔍 Examples and Testing

Use the `main` method to test your game components. Ensure the interactions are printing correctly to the console.

### 🥇 Final Touches

Polish your code, test thoroughly, and validate all user interactions before submission.

> **Assistant's Note:** This assignment encourages critical thinking regarding how game elements work together while ensuring proper Java principle application. Embrace the learning opportunity and enjoy crafting your Space Adventure Game!