# Java Game Application: Battle Adventure 🌟

For this exercise in the course, you will practice designing Java classes by creating a simple game application. Your goal is to model the components of a game where players move around, score points, and interact with enemies.

### 📅 Deadline

Please complete the assignment before the exercise session on **Friday, 21st October**.

### 📚 Preparation

Make sure to read and understand the following materials:

- Visit [Understanding Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html) for guidance on Java object-oriented principles.
- Sign up on the course portal and familiarize yourself with Java class design.

### ✅ Learning Goals

This week, you will learn about:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding variable scope (*variable shadowing*)

### 🏆 Troubleshooting Guide

If you encounter any issues:

1. Check this week's [issue board](https://example.com/issues) for similar queries.
2. Post a new question by creating a [New Issue](https://example.com/new-issue). Provide a descriptive title, starting with "Task: *summary of problem*."
3. Seek assistance from a TA during the [lab sessions](https://schedule.example.com/labs). Check your timetable for upcoming sessions.

Remember, discussions with peers are encouraged, but sharing solutions is not permitted.

### 🎮 Assignment

In this task, you will model a simple game with players navigating a world filled with enemies. Your objectives include creating a scoring system and incorporating player-enemy interactions through methods in Java.

#### Exercise 1: Player and Enemy Fields

Start by creating a class named `GameCharacter.java`. This class will represent both players and enemies.

- Fields you need to implement:
  - `String` name
  - `int` health
  - `int` score
  - `boolean` hasKey

<details>
  <summary> 🔧 Example Code </summary>

```java
public class GameCharacter {
  
  // Define your instance fields here
  
  public static void main(String[] args) {
    // Create a new GameCharacter object
    GameCharacter player = new GameCharacter();
    
    // Assign values to the instance fields
    player.name = "Hero";
    player.health = 100;
    player.score = 0;
    player.hasKey = false;

    // Print the initial values
    System.out.println("Name: " + player.name);
    System.out.println("Health: " + player.health);
    System.out.println("Score: " + player.score);
    System.out.println("Has Key: " + player.hasKey);
  }
}
```

</details>

#### Exercise 2: Implementing Getters and Setters

Ensure encapsulation by making these fields private. Implement **getters** and **setters** for each field so that their values can be accessed and modified.

<details>
  <summary> 🔧 Example Code </summary>

```java
class GameCharacter {

  // Private fields
  private String name;
  private int health;
  private int score;
  private boolean hasKey;

  // Getters and Setters
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public int getHealth() { return health; }
  public void setHealth(int health) { this.health = health; }

  public int getScore() { return score; }
  public void setScore(int score) { this.score = score; }

  public boolean isHasKey() { return hasKey; }
  public void setHasKey(boolean hasKey) { this.hasKey = hasKey; }

  public static void main(String[] args) {
    GameCharacter player = new GameCharacter();
    
    // Set values using setters
    player.setName("Hero");
    player.setHealth(100);
    player.setScore(10);
    player.setHasKey(true);

    // Get and print values using getters
    System.out.println("Name: " + player.getName());
    System.out.println("Health: " + player.getHealth());
    System.out.println("Score: " + player.getScore());
    System.out.println("Has Key: " + player.isHasKey());
  }
}
```

</details>

#### Exercise 3: Constructor Method

Design a constructor for `GameCharacter`, allowing for initializing their attributes upon creation.

<details>
  <summary> 🔧 Example Code </summary>

```java
class GameCharacter {

  // Fields and methods from previous exercises...

  // Constructor
  public GameCharacter(String name, int health, int score, boolean hasKey) {
    this.name = name;
    this.health = health;
    this.score = score;
    this.hasKey = hasKey;
  }

  public static void main(String[] args) {
    GameCharacter player = new GameCharacter("Hero", 100, 0, false);
    player.printInfo();
  }
}
```

</details>

#### Exercise 4: Printing Information

Implement a `printInfo()` method to display the GameCharacter's details in the terminal.

<details>
  <summary> 🔧 Example Code </summary>

```java
class GameCharacter {

  // Fields and methods from previous exercises...

  // Method to print information
  public void printInfo() {
    System.out.println("> Character Info:");
    System.out.println("> Name: " + this.getName());
    System.out.println("> Health: " + this.getHealth());
    System.out.println("> Score: " + this.getScore());
    System.out.println("> Has Key: " + this.isHasKey());
  }
}
```

</details>

#### Exercise 5: Interactions and Scope

Implement an interaction method where the player encounters an enemy. Consider variable shadowing when implementing your logic. Use the `this` keyword to differentiate between class and local variables.

<details>
  <summary> ⚔ Example Code </summary>

```java
class GameCharacter {

  // Fields and methods from previous exercises...

  // Enemy interaction method
  public void encounterEnemy(GameCharacter enemy) {
    int damage = 20;
    this.health -= damage;
    System.out.println(this.name + " encountered " + enemy.getName() + " and took " + damage + " damage!");
    System.out.println(this.name + "'s health is now " + this.getHealth());
  }

  public static void main(String[] args) {
    GameCharacter player = new GameCharacter("Hero", 100, 0, false);
    GameCharacter enemy = new GameCharacter("Goblin", 30, 0, false);

    player.encounterEnemy(enemy);
  }
}
```

</details>

### ✏️ Additional Note on Variable Shadowing

Variable shadowing can lead to unexpected outputs. Consider the following examples and explore ways to fix them.

```java
public class ShadowExample {

  private int value = 10;

  public void displayValue() {
    int value = 20;
    System.out.println("Value: " + value); // It should print the instance field value
  }

  public static void main(String[] args) {
    new ShadowExample().displayValue();
  }
}
```

### What to Submit

Your completed `GameCharacter.java` file with all the exercises implemented. Create a pull request in our course repository and submit the link on the course portal.

---

Happy coding and may your game characters embark on triumphant adventures! 🕹️✨