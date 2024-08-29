# ⚔️ Adventure Game: The Code Warrior

For this exercise, you will delve into the world of Java by designing a simple text-based adventure game application. You will learn to design Java classes, create instance fields, and manage the attributes of your characters using constructors, getters, and setters. This journey will enhance your understanding of variable scope and object interaction.

### 💀 Deadline

This assignment is to be submitted before the exercise session on **Friday 16th December**.

### 👩‍🏫 Instructions

For detailed submission guidelines, please refer to the [assignments section of the course instructions](https://your-class-resources-link).

### 📝 Preparation

Before starting the assignment, ensure you have gone through the learning materials provided for this module:

- Read [Learning Java Classes](https://oracle.com/java/learning-classes)
- Review [Java Object-Oriented Concepts](https://oracle.com/java/oo-concepts)

### ✅ Learning Goals

By the end of this task, you should be able to:

- Design Java classes
- Add and manage instance fields
- Implement constructor methods
- Create getters and setters
- Employ `main` method for application execution
- Use my `scope` to avoid variable shadowing
- Print game and character information to the terminal

### 🚨 Troubleshooting Guide

For any issues or questions, please follow this protocol:

1. Check the [task issues page](https://your-class-help/issues) to see if your question has been addressed.
2. If not, submit a new issue with a detailed title: “Task 1: Description of the problem”.
3. Discuss with peers in study groups, but do not exchange code.
4. Approach a TA during lab hours for personal assistance.

### 🏛 Assignment 

In this task, we will create a simple game where a player interacts with enemies, scores points, and improves their skills through encounters. 

#### Exercise 1.0 -- Fields and Character Class

Create a new file called `Character.java` in your `src` directory. This class will represent any character (like the player or enemies) in your game. Define the following fields:

- `private String name`
- `private int health`
- `private int attackPower`
- `private int defense`
- `private int score`

By completing this exercise, the initial setup should be ready, allowing your character data to be stored in these fields.

#### Exercise 1.1 -- Constructor, Getters, and Setters

Within `Character.java`, implement a constructor to initialize these fields. Also, to allow access and modification, add the necessary getters and setters for each field.

```java
public class Character {
    // Fields

    public Character(String name, int health, int attackPower, int defense) {
        // Initialize fields
    }

    // Getters and Setters
}
```

#### Exercise 1.2 -- Player Interaction

Inside `Character.java`, implement a method `public void attack(Character opponent)` that models the combat between two characters.

```java
public void attack(Character opponent) {
    // Calculate damage and adjust health
    // Print the result
}
```

Use the formula:
```
damage = this.attackPower - opponent.defense
```

#### Exercise 1.3 -- Printing Character Information

Implement a method `printCharacterInfo()` that outputs all relevant details about the character to the terminal.

```java
public void printCharacterInfo() {
    // Print character status
}
```

#### Exercise 1.4 -- Game Initialization and Scope

Create a file `Game.java` where you'll implement the `main` method to initialize characters and demonstrate interaction. Be cautious about variable scope and avoiding shadowing issues. Here's a brief example setup:

```java
public class Game {
    public static void main(String[] args) {
        Character player = new Character("Hero", 100, 20, 10);
        Character enemy = new Character("Goblin", 80, 15, 5);

        player.attack(enemy);
        player.printCharacterInfo();
        enemy.printCharacterInfo();
    }
}
```

> **Assistant's Note:** To avoid variable shadowing, ensure you use `this` keyword where necessary to differentiate between instance fields and method parameters.

### 🏁 Conclusion

Through this project, you will develop core foundational skills in Java and the principles of object-oriented programming. As you advance in the course, these skills will be critical to your success and understanding of more advanced topics. Good luck, and have fun coding!