class Player {
    private String name;
    private int score;
    private int position;

    // Constructor to initialize the player's name and starting position
    public Player(String name, int startPosition) {
        this.name = name;
        this.score = 0; // Initial score
        this.position = startPosition; // Starting position
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
    }

    // Getter for position
    public int getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(int position) {
        this.position = position;
    }

    // Method to move the player by a certain number of steps
    public void move(int steps) {
        this.position += steps;
    }

    // Method to print the player's current status
    public void printStatus() {
        System.out.println("Player " + name + " at position " + position + " has score " + score);
    }
}
```

Enemy.java
```java
public 