# 🎮 Game On! Create a Simple Adventure Game in Java

In this task, you will design a simple adventure game using Java, the perfect opportunity to practice encapsulation, class design, and method implementation! Get ready to create a basic game where characters have the ability to move, take damage, and track their game statistics.

### 💀 Deadline
This assignment is due by **Friday, November 10th**.

### 👩‍🏫 Instructions
For detailed instructions on how to complete and submit this assignment, please refer to your course's [Assignment Instructions](https://example-university.edu/course-instructions#assignments).

### 🛠 Learning Goals

By the end of this task, you should be able to:

* Design and implement Java classes
* Add and manage instance fields
* Create and utilize a constructor method
* Implement *getters* and *setters* for field management
* Print relevant game data and statistics to the console
* Utilize the `main` method to run your game
* Understand and manage variable scope (and avoid variable shadowing)

### 🧩 Prerequisites

Before you dive into the coding, ensure you understand the following:

1. Read the relevant materials on [Java Classes](https://tutorial-link) and [Encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)).
2. Enroll and complete the exercises in Module 3 of your Java programming course by using course key `java101-2023`.

### 🎮 Game Description

Your mission is to create a simple adventure game with player-controlled characters that can move and receive damage. Start by implementing basic concepts such as classes, instance fields, and methods. Follow these exercises to create a working prototype of your game:

#### Exercise 1: Define Your Game Character 

Create a Java class named `GameCharacter.java` that models an in-game character. Your character should have the following properties:

- `String name`: Represents the character's name
- `int health`: Represents the character's health points
- `int position`: Represents the character's current position in the game world
- `boolean alive`: Indicates whether the character is alive

```java
class GameCharacter {

    public static void main(String[] args) {
        // Test your class by creating a GameCharacter object
        GameCharacter hero = new GameCharacter();
        
        hero.name = "Aldren";
        hero.health = 100;
        hero.position = 0;

        // Display character details
        System.out.println("Character: " + hero.name);
        System.out.println("Health: " + hero.health);
        System.out.println("Position: " + hero.position);
    }
}
```

#### Exercise 2: Encapsulation with Getters and Setters

Encapsulate the `GameCharacter` class by setting the access modifiers of the fields to `private`. Implement *getters* and *setters* for each field. Modify the `main` method to use these methods instead of direct field access.

```java
class GameCharacter {
  
    // Declare your private fields here

    // Implement your getters and setters here

    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();
        
        hero.setName("Aldren");
        hero.setHealth(100);
        hero.setPosition(0);

        System.out.println("Character: " + hero.getName());
        System.out.println("Health: " + hero.getHealth());
        System.out.println("Position: " + hero.getPosition());
    }
}
```

#### Exercise 3: Constructor

Replace the default initialization by creating a constructor for the `GameCharacter` that initializes all fields. Modify the main function to exemplify how this constructor is used.

#### Exercise 4: Movement and Health

Implement methods to handle game actions:

- `void move(int steps)`: Update the character's position.
- `void receiveDamage(int damage)`: Deduct health and update the `alive` status.

Include print statements to inform the user about the character's current state.

```java
class GameCharacter {
  
    // Implement the move and receiveDamage methods

    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Aldren", 100, 0);

        hero.move(5);
        hero.receiveDamage(20);

        // Display the current state
        System.out.println("Position: " + hero.getPosition());
        System.out.println("Health: " + hero.getHealth());
    }
}
```

#### Exercise 5: Variable Shadowing

Review the following example of variable shadowing. Be prepared to fix and discuss them in class.

```java
public class VariableExample {
  
    private int num = 10; // This is the instance variable

    public void show() {
        int num = 20; // This is a local variable shadowing the instance variable
        System.out.println(num); // Prints the local variable
    }

    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.show(); // What would you modify to print the instance variable instead?
    }
}
```

### 💬 Have Questions?

If you encounter any issues, you can:

1. Visit the [Question Portal](https://example-university.edu/question-portal) to see if your problem has been addressed.
2. If not, post a new query. Remember to include a concise and descriptive title.

Discuss with your classmates and seek help from your TAs, but avoid sharing code directly. Use these opportunities to explore and improve your problem-solving skills! 🌟

Good luck, and have fun coding! 🚀