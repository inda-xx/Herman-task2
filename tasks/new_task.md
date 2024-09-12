# Simple Java Game: Adventure Quest!

For this programming task, you will create a simple command-line game application using Java. This exercise will help you practice designing and implementing Java classes with key concepts such as instance fields, constructors, getters, setters, and more. You will also learn how to handle variable scope and variable shadowing.

### 📅 Deadline

Complete this assignment before the exercise session on **Friday 13th October**.

### 📚 Preparation

Please read the necessary materials and grasp the basic concepts needed for this task:

- Read [Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html).
- Explore [Java Programming Concepts](https://kth.oli.cmu.edu/) in Module 2.
- Familiarize yourself with the tools provided in your coding environment if necessary.

### 🎯 Learning Goals

This week's learning goals are:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🐞 Troubleshooting

If you encounter any problems:

1. Check the [posted issues](https://gits-15.sys.kth.se/help/issues) for similar problems.
2. If it's new, post your own issue with a descriptive title.
3. Ask a teaching assistant (TA) during the lab sessions for help.
   
Discuss with peers for understanding, but refrain from sharing exact solutions.

### 🎮 Assignment

In this assignment, you'll create a simple game in which a player can navigate a grid, encounter enemies, and rack up points by defeating them.

#### Exercise 1: Designing the Game Class

Create a new Java class called `Game.java`. This class represents the main structure of your game. Inside `Game.java`, declare the following instance fields:

- `Player` player — the player in the game.
- `Enemy` enemy — an enemy in the game.
- `int score` — the player's current score.

Define a constructor for `Game` that initializes these fields and prints a welcome message:

```java
public class Game {

    private Player player;
    private Enemy enemy;
    private int score;
    
    // Constructor
    public Game() {
        // Initialize fields
        score = 0;
        System.out.println("Welcome to Adventure Quest!");
        // Initialize player and enemy objects if necessary
    }
}
```

#### Exercise 2: Player and Enemy Classes

Create two classes, `Player.java` and `Enemy.java`. Both classes should have:

- Instance fields for properties relevant to a game character.
  
  - `String` name
  - `int` health
  - `int` strength
  
- Getters and setters for each field.
  
- Appropriate constructors to initialize the characters.

#### Exercise 3: Implement Movement

In the `Player` class, implement a method for player movement. The method should receive a direction (e.g., "north", "south") and print out the new position. For simplicity, use int fields `x` and `y` for the position.

```java
public void move(String direction) {
    switch (direction.toLowerCase()) {
        case "north":
            y += 1;
            break;
        case "south":
            y -= 1;
            break;
        case "east":
            x += 1;
            break;
        case "west":
            x -= 1;
            break;
        default:
            System.out.println("Invalid direction.");
            break;
    }
    System.out.println("Moved " + direction + ". New position: [" + x + ", " + y + "]");
}
```

#### Exercise 4: Battle Mechanic

Implement a method in the `Player` class that allows the player to attack an `Enemy`. If the attack is successful (e.g., player's `strength` > enemy's `strength`), decrease the enemy's health. Print the outcome.

```java
public void attack(Enemy enemy) {
    if (this.strength > enemy.getStrength()) {
        enemy.setHealth(enemy.getHealth() - 10);
        System.out.println("You attacked " + enemy.getName() + " successfully!");
    } else {
        System.out.println("Attack failed!");
    }
}
```

#### Exercise 5: Scoring and Game Logic

In the `Game` class, implement a simple game loop in the `main` method where:

- The player can move or attack.
- If the player defeats an enemy, increase the score and print it to the console.

```java
public static void main(String[] args) {
    Game game = new Game();
    // Example game loop (simplified for the task)
    game.player.move("north");
    game.player.attack(game.enemy);
    // Update and display score if enemy defeated
}
```

#### Exercise 6: Variable Shadowing

Explore and experiment with variable shadowing by writing a method in one of your classes where local variables shadow instance fields. For example:

```java
public class Example {
    private int exampleField = 10;
    
    public void shadowExample() {
        int exampleField = 5; // This shadows the instance variable
        System.out.println("Shadowed value: " + exampleField);
    }
}
```

Modify your method to correctly reference the instance field using the `this` keyword.

### 🎓 Conclusion

Upon completing these exercises, you will have a basic understanding of how to design and implement simple classes and game mechanics in Java, handle variable scope, and program with object-oriented principles effectively.