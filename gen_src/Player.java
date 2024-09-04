class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name, int xPosition, int yPosition) {
        this.name = name;
        this.score = 0; // Score starts at 0
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Method to add score
    public void addScore(int points) {
        this.score += points;
    }

    // Getter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    // Setter for xPosition
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    // Setter for yPosition
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
        System.out.println(name + " moved to (" + xPosition + ", " + yPosition + ")");
    }
}

// Enemy.java
public 