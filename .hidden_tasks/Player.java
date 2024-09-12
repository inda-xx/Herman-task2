class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize the player's name and starting position
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.positionX = startX;
        this.positionY = startY;
        this.score = 0; // Initial score is 0
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the player up
    public void moveUp() {
        positionY--;
    }

    // Method to move the player down
    public void moveDown() {
        positionY++;
    }

    // Method to move the player left
    public void moveLeft() {
        positionX--;
    }

    // Method to move the player right
    public void moveRight() {
        positionX++;
    }

    // Method to print the player's current status
    public void printStatus() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    // Main method for testing the Player class
    public static void main(String[] args) {
        Player playerOne = new Player("Alice", 0, 0);
        playerOne.moveRight();
        playerOne.moveUp();
        playerOne.printStatus();
    }
}

// Enemy.java

public 