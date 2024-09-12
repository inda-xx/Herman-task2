# 🎮 Simple Game Development: The Adventure Begins!

For this programming assignment, you will bring your gaming ideas to life by creating a simple game application in Java. This game will feature basic functionalities such as player movement, a scoring system, and enemy interactions. Through this task, you'll get hands-on experience with Java concepts by designing classes and using object-oriented programming principles.

### 💀 Deadline

This assignment should be submitted before **Friday, 9th December**.

### 👩‍🏫 Instructions

For instructions on how to do and submit the assignment, please see the [assignments section of the course instructions](https://your-educational-platform-url.com).

### 📝 Preparation

Before you start coding, make sure to go through the following reading material which covers the fundamentals essential for completing this assignment:

- Read [Designing Classes in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Review [Encapsulation in OOP](https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html)

### ✅ Learning Goals

By completing this assignment, you will achieve the following learning goals:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding variable scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter any issues, follow this procedure:

1. Check this week's [discussion forums](https://your-discussion-forum-url.com) for similar issues raised by other students.
2. If not addressed, post a query by creating a [New Question](https://your-discussion-forum-url.com/new-question).
3. Seek help from a teaching assistant during the [weekly lab](https://your-lab-schedule-url.com). 

Remember, discussion with peers is encouraged but refrain from sharing exact solutions.

### 🏛 Assignment

In this assignment, you'll create a simple 2D game simulation. The game will let a player move around, interact with enemies, and gain scores. You will model the key elements using Java classes, *Player* and *Enemy*. Through this, you will utilize multiple object-oriented programming features.

#### Exercise 1 -- Fields
Create two classes, `Player` and `Enemy`, in the `src` directory. Each class should include the following fields:

For `Player`:
- `String name`
- `int score`
- `int health`
- `int positionX`
- `int positionY`

For `Enemy`:
- `String type`
- `int health`
- `int positionX`
- `int positionY`

Ensure your classes can compile by adding sample data in the `main` method.

<details>
  <summary> 🛠 Main Method Example </summary>

  ```java
  public class GameMain {

      public static void main(String[] args) {
          // Create player instance
          Player hero = new Player("Hero", 0, 100, 5, 5);
          
          // Create enemy instance
          Enemy monster = new Enemy("Orc", 50, 10, 10);

          // Display initial positions
          System.out.println("Player Position: (" + hero.getPositionX() + ", " + hero.getPositionY() + ")");
          System.out.println("Enemy Position: (" + monster.getPositionX() + ", " + monster.getPositionY() + ")");
      }
  }
  ```
</details>

#### Exercise 2 -- Constructor and Methods

Add constructors to both `Player` and `Enemy` to initialize the fields. Create methods for player movement and interactions:

- For `Player`, add `move(int deltaX, int deltaY)` to update the position and `increaseScore(int points)` to update the score.
- For `Enemy`, monitor interactions or movement if needed.

> **Note:** Ensure fields are accessible only via getters and setters to maintain encapsulation!

<details>
  <summary> 🛠 Implementing Methods Example </summary>

  ```java
  public class Player {

      private String name;
      private int score;
      private int health;
      private int positionX;
      private int positionY;

      // Constructor
      public Player(String name, int score, int health, int positionX, int positionY) {
          this.name = name;
          this.score = score;
          this.health = health;
          this.positionX = positionX;
          this.positionY = positionY;
      }

      // Movement method
      public void move(int deltaX, int deltaY) {
          this.positionX += deltaX;
          this.positionY += deltaY;
          System.out.println(name + " moved to (" + positionX + ", " + positionY + ").");
      }

      // Getters and Setters
      public int getPositionX() {
          return positionX;
      }

      public int getPositionY() {
          return positionY;
      }
      
      // Additional getters and setters should be added here
  }
  ```

  ```java
  public class Enemy {

      private String type;
      private int health;
      private int positionX;
      private int positionY;
      
      // Constructor
      public Enemy(String type, int health, int positionX, int positionY) {
          this.type = type;
          this.health = health;
          this.positionX = positionX;
          this.positionY = positionY;
      }
      
      // Getters, setters, and any other methods should be implemented here
  }
  ```
</details>

#### Exercise 3 -- Printing Details

Add a method `printInfo()` in both classes that prints all details about the player or enemy to the terminal.

Use this method in the `main` method to verify your setup.

#### Exercise 4 -- Scope and Variable Shadowing

Reflect on the following examples of variable shadowing using the `this` keyword for clarity:

<details>
  <summary> 🛠 Variable Shadowing Example 1 </summary>

  ```java
  public class Player {
      private int level = 1; // Intended level field

      public void printLevel() {
          int level = 5;
          System.out.println(this.level); // Use 'this.level' to refer to the field
      }

      public static void main(String[] args) {
          new Player().printLevel();
      }
  }
  ```
</details>

<details>
  <summary> 🛠 Variable Shadowing Example 2 </summary>

  ```java
  public class Enemy {
      private String type;
      private int level;

      public Enemy(String type, int level) {
          this.type = type; // Correctly assigns parameter to field
          this.level = level;
      }
  }
  ```
</details>

> **Note:** Ensure you can explain these concepts in class. Review the use of `this` in Java to prevent shadowing errors.

---

Everything is set! Get your creative juices flowing and start developing your simple game application. Good luck, and have fun coding! 🎮