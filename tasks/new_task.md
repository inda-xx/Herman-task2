# Knight's Quest: Java Game Development

For the second exercise of your Java programming course, you will dive into designing a simple text-based game. The purpose of this task is to give you hands-on experience with modeling objects in Java, focusing on object-oriented programming concepts.

### 💀 Deadline

Please ensure this assignment is completed and ready for submission before your lab session on **Friday 20th October**.

### 👩‍🏫 Instructions

Refer to the [course assignments page](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for detailed submission guidelines.

### 📝 Preparation

Prior to starting, review the following sections in your OLI material:

- [Understanding Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)

Ensure you have access to the [OLI platform](https://kth.oli.cmu.edu/) with the course key `dd1337-ht22`.

> **Note:** The schedule for the OLI material may vary slightly this year. It's recommended to explore further if necessary.

### ✅ Learning Goals

This week's learning objectives entail:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

For questions or issues:

1. Check the week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues) to see if others have similar questions.
2. If unresolved, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) using "Task x: Brief summary of problem" as the title.
3. Consult your TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Collaboration with peers is encouraged, but **do not share solutions**.

### 🏛 Assignment

Embark on your journey to create a simple Java game where you, the knight, must navigate through a land filled with challenges. Along the path, you will gain points, encounter enemies, and learn the essence of data protection in programming. Below are your exercises:

#### Exercise 1: Designing the Game Class - Fields

In the `src` directory, create a new class named `KnightQuest.java`. Define several fields that represent the game's core functionalities:

- `int playerPosition`
- `int score`
- `int enemiesDefeated`

These fields will track your player's movement, the game's scoring system, and interactions with enemies.

#### Exercise 2: Constructor and Initialization

Implement a constructor for your class. This constructor should initialize `playerPosition`, `score`, and `enemiesDefeated` to sensible starting values, for instance, `0`.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class KnightQuest {
    private int playerPosition;
    private int score;
    private int enemiesDefeated;

    public KnightQuest() {
      this.playerPosition = 0;
      this.score = 0;
      this.enemiesDefeated = 0;
    }
  }
  ```
</details>

#### Exercise 3: Getters and Setters

Encapsulate your fields with private access. Create public getter and setter methods to manipulate these fields.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public int getPlayerPosition() {
    return playerPosition;
  }

  public void setPlayerPosition(int playerPosition) {
    this.playerPosition = playerPosition;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getEnemiesDefeated() {
    return enemiesDefeated;
  }

  public void setEnemiesDefeated(int enemiesDefeated) {
    this.enemiesDefeated = enemiesDefeated;
  }
  ```
</details>

#### Exercise 4: Printing to Terminal

Implement a method named `printStatus()` that prints out the current status of the player to the terminal.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void printStatus() {
    System.out.println("Current Position: " + playerPosition);
    System.out.println("Score: " + score);
    System.out.println("Enemies Defeated: " + enemiesDefeated);
  }
  ```
</details>

#### Exercise 5: Implementing the Main Method

Implement the `main` method to create an instance of `KnightQuest`, modify its state, and print the status.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public static void main(String[] args) {
    KnightQuest game = new KnightQuest();
    game.setPlayerPosition(5);
    game.setScore(100);
    game.setEnemiesDefeated(2);
    game.printStatus();
  }
  ```
</details>

#### Exercise 6: Understanding Scope and Variable Shadowing

Review the following code snippet and prepare to discuss any issues related to variable shadowing in class.

```java
public class ShadowExample {
    private int score = 10;

    public void displayScore() {
        int score = 50; // Shadowing the instance field
        System.out.println(score); // Outputs the local `score` variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.displayScore(); // Expecting to print the instance field value
    }
}
```

> **Note:** Consider the implications of variable shadowing and use the `this` keyword to resolve such issues.

By completing these exercises, you will gain a stronger grasp of Java classes, encapsulation, and how to navigate potential pitfalls in object-oriented design. Enjoy your quest! 🏰🚀