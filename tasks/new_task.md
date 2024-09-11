# Java Adventure: Simple Game Development

For this exercise, you are going to practice designing an object-oriented game in Java. You will create a simple console-based game application featuring player movement, a scoring system, and interactions with basic enemies. This project is intended to acquaint you with developing Java classes, handling instance fields, using constructors, and managing scope.

### 💀 Deadline

This assignment must be completed before the lab session on **Friday, December 1st**.

### 👩‍🏫 Instructions

For instructions on submission, refer to the [assignment section of the course instructions](https://example.com/assignment-submission).

### 📝 Preparation

Before starting this assignment, complete the following OLI material:

- Read [Understanding Java Classes](https://example.com/understanding-java-classes)
- Review the tutorial on [Encapsulation and Scope](https://example.com/encapsulation-scope)

### ✅ Learning Goals

This week's learning goals include:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you run into issues:

1. Check the course [help forum](https://example.com/help-forum).
2. Post your problem with details on the forum if it hasn't been covered.
3. Seek assistance during lab hours.

Collaborate with peers for understanding the concepts, but avoid sharing exact solutions.

### 🏛 Assignment

Embark on a Java adventure by creating a basic game in the console. You will design the core of this game using Java classes that model players, score systems, and enemy interactions. 

#### Exercise 1.0 -- Player Class

In the `src` directory, create a new class `Player.java`. Your player must have the following instance fields:

- `String` playerName
- `int` score
- `int` positionX
- `int` positionY

Provide getters and setters for each field, and initialize these fields using a constructor. The `main` method in Example 1 should compile correctly with your class.

<details>
  <summary>🛠 Example 1</summary>

  ```java
  public class Player {
      
      // Declare instance fields
    
      // Constructor here
      
      // Getters and setters here

      public static void main(String[] args) {
          Player player1 = new Player("Hero", 0, 5, 5);

          // Print player's initial position
          System.out.println("Player: " + player1.getPlayerName());
          System.out.println("Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
          System.out.println("Score: " + player1.getScore());
      }
  }
  ```
</details>

#### Exercise 1.1 -- Game Logic

Create a `Game` class with a `main` method to initialize your game. Add methods to move the player. Implement terminal commands to move the player via input and update their position.

<details>
  <summary>🛠 Example 2</summary>

  ```java
  public class Game {
      
      public static void main(String[] args) {
          Player player1 = new Player("Hero", 0, 5, 5);
          
          // Basic game loop for player movement
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter move (w/a/s/d):");

          while (true) {
              String move = scanner.nextLine();
              
              switch (move) {
                  case "w": player1.setPositionY(player1.getPositionY() + 1); break;
                  case "s": player1.setPositionY(player1.getPositionY() - 1); break;
                  case "a": player1.setPositionX(player1.getPositionX() - 1); break;
                  case "d": player1.setPositionX(player1.getPositionX() + 1); break;
              }

              System.out.println("New Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
          }
      }
  }
  ```
</details>

#### Exercise 1.2 -- Score System

Introduce scoring by adding a method to update and display the player’s score. Update it based on player actions (e.g., successful moves).

#### Exercise 1.3 -- Enemy Interaction

Design a class `Enemy` with attributes like position and effects on the player. Implement interactions where a player can encounter an enemy, and trigger events (like reducing health points or resetting score). Ensure instance variables have proper encapsulation with getters and setters.

<details>
  <summary>🛠 Example 3</summary>

  ```java
  public class Enemy {
    
      // Declare enemy attributes

      // Constructor here

      // Getters and setters here

      public void interact(Player player) {
          // Interaction logic (e.g., adjust player's score)
          System.out.println("Encountered an enemy!");
      }
  }
  ```

  ```java
  public class Game {
      
      // Main and other methods continue here

      private static void checkEnemyEncounter(Player player, Enemy enemy) {
          if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
              enemy.interact(player);
          }
      }
  }
  ```
</details>

#### Exercise 1.4 -- Handling Variable Shadowing

Ensure you manage variable shadowing, particularly when handling player actions and enemy interactions. Use appropriate scope references or the `this` keyword where necessary.

Review these examples to solidify your understanding:

```Java
public class ScopeExample {
    private int level = 0;

    public void printLevel() {
        int level = 10;
        System.out.println(this.level); // Intends to print the field level
    }
}
```

> **Note:** Understand how the scope affects which variable is accessed, especially when local variables have the same name as instance fields.

#### Conclusion

Create a creative visual narrative using printed messages in the terminal to represent changes in the player's journey. The game doesn't have to be overly complex; focus on structuring your Java classes properly and utilizing OOP principles. Happy Coding!