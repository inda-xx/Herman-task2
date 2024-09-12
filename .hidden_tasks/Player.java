import java.util.Set;

public class Player {
    private String name;
    private int score;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String name, int score, int health, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println(name + " moved to (" + positionX + ", " + positionY + ").");
    }

    // Method to increase player's score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + "'s score increased by " + points + " points. Total score: " + score);
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Additional getters and setters for name, score, and health
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method to print player's information
    public void printInfo() {
        System.out.println("Player Info:");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Health: " + health);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }
}