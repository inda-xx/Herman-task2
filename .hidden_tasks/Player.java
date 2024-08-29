class Player {

    private String name;
    private int xPosition;
    private int yPosition;
    private int score;
    private boolean isAlive;

    // Constructor to initialize a Player with a name
    public Player(String name) {
        this.name = name;
        this.xPosition = 0;
        this.yPosition = 0;
        this.score = 0;
        this.isAlive = true;
    }

    // Method to move the player to a new position
    public void movePlayer(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to add points to the player's score
    public void addScore(int points) {
        this.score += points;
        System.out.println(name + " scored! Total score: " + score);
    }

    // Getter for player's x position
    public int getXPosition() {
        return xPosition;
    }

    // Setter for player's x position
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter for player's y position
    public int getYPosition() {
        return yPosition;
    }

    // Setter for player's y position
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Getter for player's score
    public int getScore() {
        return score;
    }

    // Setter for player's score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for player's name
    public String getName() {
        return name;
    }

    // Setter for player's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for player's alive status
    public boolean isAlive() {
        return isAlive;
    }

    // Setter for player's alive status
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Main method to demonstrate the Player 