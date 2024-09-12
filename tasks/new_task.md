# 📦 Create a Simple Game Application in Java

For this assignment, you're going to create a simple game application using Java! You'll practice designing Java classes and implementing several essential functionalities: player movement, scoring, and enemy interactions.

### 💀 Deadline

This task should be completed before the exercise on **Thursday, 12th October**.

### 👨‍🏫 Instructions

For guidance on submitting the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📝 Preparation

Before you begin, review the following materials:

- Read [Designing classes in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html)
- Watch the tutorial on [Encapsulation in Java](https://www.youtube.com/watch?v=6fA5lxJekGw).

Remember, understanding the basics of object-oriented programming and class design will be key to tackling this assignment successfully.

### ✅ Learning Goals

This task will help you practice and understand:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🏚 Assignment

In this assignment, you are tasked with creating a simple game in Java with functionalities such as player movement, a scoring system, and enemy interactions.

#### Exercise 1.0 -- Designing the Player Class

1. **Create the `Player` class** in the `src` directory.

2. **Add the following instance fields:**
   - `String` name
   - `int` score
   - `int` positionX
   - `int` positionY

3. **Constructors:**
   - Implement a constructor that initializes the player's `name`, starting `positionX`, and `positionY`.

4. **Getters and Setters:**
   - Implement getters and setters for each field.

5. **Printing:**
   - Implement a method `printStatus()` to print the player's current status, including name, score, and position.

6. **Player Movement:**
   - Implement methods `moveUp()`, `moveDown()`, `moveLeft()`, `moveRight()` to adjust the player's position.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Player {

      private String name;
      private int score;
      private int positionX;
      private int positionY;

      public Player(String name, int startX, int startY) {
          this.name = name;
          this.positionX = startX;
          this.positionY = startY;
          this.score = 0;
      }

      public String getName() { return name; }
      public int getScore() { return score; }
      public int getPositionX() { return positionX; }
      public int getPositionY() { return positionY; }

      public void setScore(int score) { this.score = score; }
      public void setPositionX(int positionX) { this.positionX = positionX; }
      public void setPositionY(int positionY) { this.positionY = positionY; }

      public void moveUp() { positionY--; }
      public void moveDown() { positionY++; }
      public void moveLeft() { positionX--; }
      public void moveRight() { positionX++; }

      public void printStatus() {
          System.out.println("Player: " + name);
          System.out.println("Score: " + score);
          System.out.println("Position: (" + positionX + ", " + positionY + ")");
      }

      public static void main(String[] args) {
          Player playerOne = new Player("Alice", 0, 0);
          playerOne.moveRight();
          playerOne.moveUp();
          playerOne.printStatus();
      }
  }
  ```
</details>

#### Exercise 2.0 -- Enemy Class and Interactions

1. **Create the `Enemy` class**.

2. **Instance Fields:**
   - `String` type
   - `int` positionX
   - `int` positionY

3. **Constructors and Methods:**
   - Implement constructors, getters, and setters.
   - Method `interact(Player player)` that prints a message of interaction and deducts points from the player.

<details>
  <summary> 🛠 Example </summary>

  ```java
  public class Enemy {

      private String type;
      private int positionX;
      private int positionY;

      public Enemy(String type, int x, int y) {
          this.type = type;
          this.positionX = x;
          this.positionY = y;
      }

      public String getType() { return type; }
      public int getPositionX() { return positionX; }
      public int getPositionY() { return positionY; }

      public void interact(Player player) {
          System.out.println(type + " encountered the player!");
          player.setScore(player.getScore() - 10);
      }
  }
  ```
</details>

#### Exercise 3.0 -- Variable Shadowing

Explore the following code that demonstrates variable shadowing. Analyze how the `this` keyword resolves the issue.

```java
public class ShadowExample {

    private int value = 10;

    public void demonstrateShadow(int value) {
        System.out.println("Local variable value: " + value);
        System.out.println("Instance field value: " + this.value);
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.demonstrateShadow(5);
    }
}
```

> Study how local scopes within methods can shadow class-level variables and review how to correctly access instance fields with `this`.

Remember, discussion with peers is encouraged, but direct solution sharing is discouraged. If you have questions, reach out via the [help section](https://gits-15.sys.kth.se/inda-23/help/issues) or seek assistance during the weekly lab.

Good luck and have fun developing your game!