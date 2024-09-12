# Build Your Java Game Application

For this exercise, you will delve into designing a simple game application utilizing Java's object-oriented concepts. The aim is to practice essential features such as class design, player interaction, and basic game mechanics like scoring and enemy interaction.

### 💀 Deadline

Please complete your work before the exercise on **Friday, 25th November**.

### 👩‍🏫 Instructions

Find detailed instructions for submission in the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation

Familiarize yourself with the fundamental Java concepts by completing the questions in the OLI material for Module 3.

- Explore [Understanding Classes in Java](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)
- Enroll at https://kth.oli.cmu.edu/ and register using the course key `dd1337-ht22`.

> **Note:** Don't hesitate to read ahead if you find the topics challenging or mismatched with your current knowledge.

### ✅ Learning Goals

This task is designed to reinforce your knowledge of:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you need assistance, please follow these steps:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Your question might already be answered.
2. If not, open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with a concise title starting with "Task *x*: *summary of problem here*".
3. Ask a teaching assistant during the [weekly lab](https://queue.csc.kth.se/Queue/INDA), as scheduled.

Sharing answers is discouraged, but discussions with peers are encouraged!

### 🎮 Assignment - Escape the Dungeon

Your mission is to create a simple Java game where a player navigates a dungeon, avoids enemies, and collects points for survival.

#### Exercise 3.0 -- Designing Classes

Inside the [`src`](src) folder, create two classes: `Player.java` and `Enemy.java`. Define the following instance fields for each:

- `Player` should have:
  - `String name`
  - `int score`
  - `int health`
  - `int xPosition` and `int yPosition`

- `Enemy` should have:
  - `String type`
  - `int health`
  - `int xPosition` and `int yPosition`

Implement the `main` method in a separate `Game.java` file to demonstrate these fields, as shown in Example 1.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player hero = new Player();
          System.out.println("Game started!");
      }
  }
  ```

</details>

#### Exercise 3.1 -- Getters and Setters

Encapsulate your fields by setting their access modifiers to `private`. Implement *getters* and *setters* for all fields. Ensure that these modifications support the `main` method in Example 2.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player hero = new Player();
          hero.setName("Adventurer");
          System.out.println("Player: " + hero.getName());
      }
  }
  ```

</details>

#### Exercise 3.2 -- Constructor

Refactor your `Player` and `Enemy` classes to include constructors that initialize all fields. Apply these constructors in Example 3.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player hero = new Player("Adventurer", 0, 100, 0, 0);
          System.out.println("Player: " + hero.getName());
      }
  }
  ```

</details>

#### Exercise 3.3 -- printInfo Method

Add a `printInfo()` method to both classes to display their attributes. Example 4 shows how to implement this.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player hero = new Player("Adventurer", 0, 100, 0, 0);
          hero.printInfo();
      }
  }
  ```

  Output example:
  ```
  > Player: Adventurer
  > Score: 0
  > Health: 100
  > Position: (0, 0)
  ```

</details>

#### Exercise 3.4 -- Interacting with Enemies

Implement an `interact` method in your `Player` class to simulate interaction with an `Enemy`. This method should decrease the player's health. See Example 5 for guidance.

<details>
  <summary> 🛠 Example 5 </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player hero = new Player("Adventurer", 0, 100, 0, 0);
          Enemy goblin = new Enemy("Goblin", 50, 2, 2);
          hero.interact(goblin);
      }
  }
  ```

  Produce the output:
  ```
  > Player Adventurer encounters a Goblin!
  > Player's health: 90
  ```

</details>

#### Exercise 3.5 -- Variable Shadowing

Review the examples below on *Variable Shadowing*. Prepare explanations for these potential pitfalls.

```java
public class VariableShadow {

    private int score = 100;

    public void updateScore() {
        int score = 50;
        System.out.println(score); // Why does this print 50?
    }

    public static void main(String[] args) {
        new VariableShadow().updateScore();
    }
}
```

```java
public class Creature {

    private String creatureType;

    public Creature(String type) {
        creatureType = type; // Does this work? Why or why not?
    }

    public void displayType() {
        String creatureType = "Unknown";
        System.out.println("Creature Type: " + creatureType); // Why does it print Unknown?
    }
}
```

> **Assistant's Note:** Reflect on *variable scope*, *global variables*, and *instance fields* with respect to these examples.

---

This comprehensive task will help you solidify your understanding of Java class design, encapsulation, and basic game logic. Have fun coding your simple game, and enjoy navigating the world of Java!