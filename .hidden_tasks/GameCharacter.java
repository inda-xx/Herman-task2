import java.util.Set;

class GameCharacter {
    // Private fields representing the attributes of a game character
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;
    private boolean isAlive;

    // Constructor to initialize all fields of the game character
    public GameCharacter(String name, int xPosition, int yPosition, int score, boolean isAlive) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.score = score;
        this.isAlive = isAlive;
    }

    // Getters and Setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to print the game character's information
    public void printInfo() {
        System.out.println("> INFO");
        System.out.println("> Character: " + name);
        System.out.println("> Position: (" + xPosition + ", " + yPosition + ")");
        System.out.println("> Score: " + score);
        System.out.println("> Is Alive: " + isAlive);
    }

    // Method to move the character by a specified change in X and Y position
    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
        System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to handle an encounter with an enemy
    public void encounterEnemy() {
        System.out.println(name + " encountered an enemy!");
        // Simulating an encounter outcome
        this.score += 10;
        this.isAlive = false; // Character "dies" for demonstration
        System.out.println("> Score: " + score);
        System.out.println("> Is Alive: " + isAlive);
    }

    // Main method for demonstration and testing
    public static void main(String[] args) {
        // Create a new "GameCharacter" object using the constructor
        GameCharacter player = new GameCharacter("Player1", 0, 0, 0, true);
        
        // Print initial information
        player.printInfo();
        
        // Move the player and print the updated position
        player.move(5, 3);
        
        // Simulate an enemy encounter
        player.encounterEnemy();
    }
}