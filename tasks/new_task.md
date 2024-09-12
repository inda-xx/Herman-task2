# Java Basic Game Development Assignment

For this assignment, you will design and implement a very simple game in Java. The core functionalities to include are player movement, scoring system, and interactions with enemies. This will help you strengthen your skills in Java class design, basic object-oriented programming concepts, and understanding variable scope.

### 💀 Deadline
This task should be completed before the next exercise session, on **Friday, 2nd December**.

### 👩‍🏫 Instructions
Please refer to the [assignment submission section](#) for details on how to submit your work.

### 📝 Preparation
Ensure you've completed the readings and exercises in the OLI material for Module 2:

- Read [Understanding Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=abcde12345)
- Register for the course using access key `dd1337-ht23` if you have not done so already.

### ✅ Learning Goals

By the end of this assignment, you should be comfortable with:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🚨 Troubleshooting Guide

If you encounter issues:

1. Check the [posted issues](#) to see if others have similar problems.
2. If your issue is not addressed, submit a new question on [issue tracker](#).
3. Seek assistance from a TA during in-lab sessions.

Discuss with peers, but **do not disclose your complete solutions**!

### 🏛 Assignment

You'll create a basic game with player and enemy interactions. Visualize your work to better understand object interactions.

#### Exercise 1 -- Designing the Player Class

Create a `Player` class in the `src` folder. This class should have the following private instance fields:

- `String name`
- `int score`
- `int positionX`
- `int positionY`

The class should include:

- A constructor to initialize the player's name and starting position.
- Getters and setters for each field.
- A method `printInfo()` to display the player's current state using `System.out.println`.

#### Exercise 2 -- Scoring System

Enhance your `Player` class by adding functionality to update and retrieve the player's score.

- Implement methods `addScore(int points)` and `getScore()`.
- Ensure changes are reflected in a terminal print statement via `printInfo()`. 

#### Exercise 3 -- Creating the Enemy Class

In the `src` folder, create another class called `Enemy`. This class needs:

- `int positionX`
- `int positionY`
- A constructor method to initialize its position.
- Getters and setters for the position fields.
- A method `moveTo(int x, int y)` to set new positions.
- A `printInfo()` method to print the enemy's location.

Example main method and expected output:

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Game {
    public static void main(String[] args) {
      Player player = new Player("Hero", 0, 0);
      Enemy enemy = new Enemy(5, 5);

      player.printInfo(); // Player's initial state.
      enemy.printInfo(); // Enemy's initial position.

      player.addScore(10);
      enemy.moveTo(7, 8);

      player.printInfo(); // Updated player state.
      enemy.printInfo(); // Updated enemy position.
    }
  }
  ```

  Expected output:

  ```
  > Player: Name = Hero, Position = (0, 0), Score = 0
  > Enemy Position = (5, 5)
  > Player: Name = Hero, Position = (0, 0), Score = 10
  > Enemy Position = (7, 8)
  ```

</details>

#### Exercise 4 -- Implementing Player Movement

Modify your `Player` class to include a method `move(int dx, int dy)` that updates the player's position:

- Demonstrate movement within the scope of a grid.
- Update `printInfo()` to reflect new positions after movement calls.

#### Exercise 5 -- Variable Shadowing

Look at this example of variable shadowing. Consider why it doesn't function as expected. Be prepared to explain this in class.

```java
class ShadowExample {
    private int position = 1; 

    public void updatePosition() {
        int position = 5; 
        System.out.println("Position: " + position); // Unexpected output 
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.updatePosition(); // ")
    }
}
```

**Note:** Think about local and instance variables and how to correct shadowing using the `this` keyword!

This assignment aims to enhance your understanding of object fields, access control, constructors, and interactions between Java objects. Enjoy the game creation journey as this is a fundamental part of learning programming with a practical touch!