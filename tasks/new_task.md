# Coding a Simple Game in Java

For this exercise, your task is to design a simple game application in Java, where players can move around, earn points, and interact with enemies. This will help you become familiar with key concepts of Java classes, such as designing classes, using constructors, and managing object behavior through getters and setters.

### 💀 Deadline

Please submit this assignment before **Friday 16th September**.

### 👩‍🏫 Instructions

For detailed instructions on submission, refer to the [assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Before starting the assignment, make sure to:

- Review [Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- Ensure you understand [Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html).

### ✅ Learning Goals

By the end of this assignment, you should be able to:

- Design and implement Java classes.
- Add and manage instance fields.
- Use constructor methods.
- Implement getters and setters.
- Output information to the terminal.
- Use the `main` method.
- Understand scope and manage variable shadowing.

### 🚨 Troubleshooting Guide

If you run into problems:

1. Check [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have encountered the same issue.
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Ask a Teaching Assistant during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Find your schedule for the next lab.

Remember, collaboration is encouraged, but please do not share full answers.

### 🕹️ Assignment: Build Your Java Game

Your task is to create a basic game in Java with the following components:

#### Game Essentials

In the `src` folder, create the following classes:

1. **Player.java**
2. **Enemy.java**
3. **Game.java** (this will contain your `main` method)

#### Exercise 1: Player Class

**Design the Player class with the following:**

- **Fields:**
  - `String` playerName
  - `int` score
  - `int` positionX
  - `int` positionY

- **Constructor:** Create a constructor to initialize the `playerName`, and default the score and position.

- **Getters and Setters:** Implement `get` and `set` methods for each field.

- **Methods:**
  - `move(int x, int y)`: Change player's position and print the new position.
  - `increaseScore(int points)`: Add points to the score and print the new score.

**Example Usage:**

```java
public class Player {

    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void move(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println("Player " + playerName + " moved to (" + positionX + ", " + positionY + ")");
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Player " + playerName + " score: " + score);
    }
}
```

#### Exercise 2: Enemy Class

**Design the Enemy class with the following:**

- **Fields:**
  - `String` enemyName
  - `int` health
  - `int` positionX
  - `int` positionY

- **Constructor:** Initialize all fields.

- **Getters and Setters:** Implement `get` and `set` methods for each field.

- **Interaction Method:** `void encounter(Player player)`: When an enemy encounters a player, the player's score decreases by 10. Printing a message reflecting the encounter.

**Example Usage:**

```java
public class Enemy {

    private String enemyName;
    private int health;
    private int positionX;
    private int positionY;

    public Enemy(String enemyName, int health, int positionX, int positionY) {
        this.enemyName = enemyName;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void encounter(Player player) {
        player.setScore(player.getScore() - 10);
        System.out.println("Enemy " + enemyName + " encountered player " + player.getPlayerName() + "!");
        System.out.println("Player's new score: " + player.getScore());
    }
}
```

#### Exercise 3: Game Mechanics

**Create Main Game Logic in Game.java**

- **Fields:** For demonstration, create a `Player` and an `Enemy`.

- **Main Method:**
  - Instantiate a `Player` and an `Enemy`.
  - Demonstrate `Player` movements and interactions with the `Enemy`.

**Example:**

```java
public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Hero");
        Enemy enemy1 = new Enemy("Goblin", 100, 3, 3);

        player1.move(2, 3);
        enemy1.encounter(player1);

        player1.increaseScore(20);
        player1.move(3, 3);
        enemy1.encounter(player1);
    }
}
```

#### Exercise 4: Variable Shadowing

Review these shadowing examples. Be prepared to discuss solutions in class:

```java
public class ShadowingExample {

    private int value = 0; 

    public void printValue() {
        int value = 5; 
        System.out.println(value); // Adjust this to print the class variable value
    }

    public static void main(String[] args){
        new ShadowingExample().printValue();
    }
}
```

### 📚 Recap

This assignment exercises your understanding of Java classes and object-oriented programming concepts. Remember to use encapsulation principles effectively when designing your classes, and always be careful with variable scopes to avoid shadowing issues. Happy coding! 🎮