class Player {
    // Fields for the Player class
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    private boolean isAlive;

    // Constructor for Player class
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.score = 0; // Initialize score to 0
        this.positionX = positionX;
        this.positionY = positionY;
        this.isAlive = true; // Player starts off alive
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    private void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        positionX += deltaX;
        positionY += deltaY;
        System.out.println("Player moved to (" + positionX + ", " + positionY + ")");
    }

    // Method to increase player's score
    public void incrementScore(int points) {
        score += points;
        System.out.println("Player's new score: " + score);
    }

    // Method to print player info
    public void printInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Is Alive: " + isAlive);
    }
}
```

```java
// Enemy.java
public 