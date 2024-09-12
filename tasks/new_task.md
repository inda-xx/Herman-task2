# Tiny Adventure Game

For this assignment, your task is to design and implement a simple Java game called the "Tiny Adventure Game." This game will aim to practice your Java skills, focusing on object-oriented design, specifically class creation, encapsulation, and gameplay mechanics.

## 💀 Deadline

This assignment is to be completed and submitted by **Friday, November 10th**.

## 👩‍🏫 Instructions

Refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments) for submission guidelines.

## 📝 Preparation

To accomplish this task successfully, it is recommended you read the following materials from OLI:

- [Understanding Java Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60) 
- Register for the course using the code `dd1337-ht23` if you haven't yet.

> **Assistant’s Note:** Feel free to explore additional resources to deepen your understanding of these concepts.

## ✅ Learning Goals

Through this assignment, you will learn to:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Scope (or *variable shadowing*)

## 🚨 Troubleshooting Guide

If you encounter issues, please:

1. Check the [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues) to see if your problem has already been addressed.
2. Post a question if you haven’t found a solution: [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new).
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for timing.

Discussing with peers is encouraged but refrain from sharing answers!

## 🏛 Assignment

In a fictional world, you are tasked with creating a tiny adventure game where the player can interact with the environment and encounter enemies. This task involves designing Java classes and implementing the core mechanics of gameplay.

### Exercise 1.0 -- Player Class

Create a new class `Player` in the `src` folder to represent the player in the game. The `Player` class should include the following instance fields:

- `String` name
- `int` score
- `int[]` position (to track the player’s coordinates)

### Exercise 1.1 -- Constructor and Methods

Add a constructor to the `Player` class to initialize the player's name and starting position. Implement the following methods:

- `void move(int dx, int dy)`: Adjusts the player's position.
- `void printPosition()`: Prints the current position to the terminal.
- `void updateScore(int points)`: Updates the player’s score, adding `points`.

Use encapsulation principles by ensuring all fields are `private`. Add appropriate *getters* and *setters*.

### Exercise 1.2 -- Enemy Class

Create another class `Enemy` in the `src` folder with these fields:

- `String` type
- `int[]` position

Add appropriate constructor and methods for enemy movements and interactions. Implement a `void interact(Player player)` that affects the player’s score when they are in the same position.

### Exercise 1.3 -- Game Mechanism

Implement the `main` method in a class called `AdventureGame`. Use it to demonstrate:

- Instantiation of `Player` and `Enemy` objects.
- Player movement through method calls.
- Interactions between player and enemy, printing relevant outcomes.

### Exercise 1.4 -- Printing Mechanics

In both `Player` and `Enemy`, implement a method called `printInfo()` that details the object state as follows:

#### Example Output for Player
```
Player: John
Position: [2, 3]
Score: 15
```

#### Example Output for Enemy
```
Enemy: Goblin
Position: [2, 3]
Interacted: true
```

### Exercise 1.5 -- Explore Variable Shadowing

Study the concept of variable shadowing. The snippet below exemplifies a common mistake and you need to understand why it outputs the unintended behavior:

```Java
public class ShadowExample {
    private int number = 10;

    public void showNumber() {
        int number = 5;
        System.out.println(number); // Why does it print 5, not 10?
    }

    public static void main(String[] args){
        new ShadowExample().showNumber();
    }
}
```

> **Assistant’s Note:** Explore how to use the `this` reference to resolve variable shadowing issues.

By completing this task, you'll gain practical skills in object-oriented design within Java, implementing core gaming mechanics, and understanding important concepts like encapsulation and variable scope. Happy coding!