# Let's Play Java: Create Your Own Game!

For this exercise in INDA, you will embark on an exciting journey to develop a simple game application using Java. You'll enhance your object-oriented programming skills by diving deep into the core concepts of Java class design.

### 💀 Deadline

Your project must be submitted before **Friday, November 10th**.

### 👩‍🏫 Instructions

For submission guidelines, visit the [assignments section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) of our course. Make sure to follow the steps carefully and adhere to all submission protocols.

### 📝 Preparation

Ensure to go through the OLI material for Module 2 to beef up your understanding of Java classes and object-oriented principles.

- Read [Class Design in Java](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=class_design_java)
- If you have not yet registered, head to https://kth.oli.cmu.edu/ and sign up with the course key `dd1337-ht22`.

### ✅ Learning Goals

This task aims to reinforce:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Utilizing the `main` method
* Understanding variable scope and shadowing

### 🚨 Troubleshooting Guide

Fret not if you encounter any roadblocks! Try the following:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Check if your concern is shared by others.
2. If not, initiate a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a clear title starting with "Task *x*: *summary of the problem*."
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for timings.

Feel free to discuss with peers, but remember, **no sharing of code solutions**!

### 🏛 Assignment

Inspired by the epic gaming world, your task is to create a simple game where a player can move, accumulate scores, and interact with enemies.

#### Exercise 3.0 -- Game Class Design

Create a class named `Game`. The `Game` class will serve as your main program managing various game aspects like player movement, scoring, and enemy encounters.

**Instance Fields:**
- `Player player`
- `int score`
- `Enemy[] enemies`

**Constructor:**
- Initialize a `player` object.
- Set `score` to 0.
- Instantiate the `enemies` array.

```java
class Game {
    private Player player;
    private int score;
    private Enemy[] enemies;

    public Game() {
        this.player = new Player();
        this.score = 0;
        this.enemies = new Enemy[5]; // perhaps initialize with 5 default enemies?
    }

    public static void main(String[] args) {
        Game myGame = new Game();
        System.out.println("Game initialized!");
    }
}
```

#### Exercise 3.1 -- Player Class

Create a `Player` class to encapsulate attributes and actions associated with the player in the game.

**Instance Fields:**
- `String name`
- `int x, y` (player's position)

**Constructor:** Accepts values for name, initial x, and y position.

**Getters and Setters:** For field access and modification.

```java
class Player {
    private String name;
    private int x, y;

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() { return name; }
    public int getX() { return x; }
    public int getY() { return y; }
    public void setName(String name) { this.name = name; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
        System.out.println("Player moved to (" + this.x + ", " + this.y + ")");
    }
}
```

#### Exercise 3.2 -- Enemy Class

Create a `Enemy` class to handle enemy interactions.

**Instance Fields:**
- `String type`
- `int x, y` (enemy position)
- `int health`

**Constructor:** Initializes enemy with type, position, and health.

**Getters and Setters:** Facilitate access to enemy data.

```java
class Enemy {
    private String type;
    private int x, y;
    private int health;

    public Enemy(String type, int x, int y, int health) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public String getType() { return type; }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    
    public void interact(Player player) {
        // Basic interaction logic
        System.out.println("Enemy " + type + " interacts with player " + player.getName());
    }
}
```

#### Exercise 3.3 -- Scoring and Printing

Implement scoring and terminal printing functions in the `Game` class.

```java
class Game {
    // ... existing code ...

    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Score increased! Current score: " + this.score);
    }

    public void printGameState() {
        System.out.println("Current game state:");
        System.out.println("Player: " + player.getName() + " at (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Score: " + score);
    }
}
```

#### Exercise 3.4 -- Main Method and Game Logic

Utilize the `main` method to demonstrate a basic game loop, invoke player movements, score updates, and enemy interactions.

```java
public class GameDemo {

    public static void main(String[] args) {
        Game myGame = new Game();
        myGame.printGameState();

        myGame.player.move(2, 3);
        myGame.increaseScore(10);
        myGame.printGameState();

        for (Enemy enemy : myGame.enemies) {
            enemy.interact(myGame.player);
        }
    }
}
```

Currying your way through these exercises will unleash your programming zeal, equipping you with stellar skills in Java class design and game development. Embrace the challenge, and may your code be bug-free!

### 🎨 Variable Shadowing

As a note of caution, avoid variable shadowing pitfalls! Consider this snippet and identify potential shadowing issues:

```java
class ShadowGame {
    private int difficultyLevel = 1;

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel; // use `this.difficultyLevel` to refer to the instance field
    }

    public static void main(String[] args) {
        ShadowGame shadowGame = new ShadowGame();
        shadowGame.setDifficultyLevel(3);
        System.out.println("Difficulty Level: " + shadowGame.difficultyLevel);
    }
}
```

Happy coding! 🎮