class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize player's name and starting position
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // initialize score to 0
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

    // Method to add points to the score
    public void addScore(int points) {
        this.score += points;
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

    // Method to print player's information
    public void printInfo() {
        System.out.println("Player: Name = " + name + ", Position = (" + positionX + ", " + positionY + "), Score = " + score);
    }

    // Method to move the player by a delta
    public void move(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }
}



// Enemy.
public