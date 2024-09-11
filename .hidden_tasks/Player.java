class Player {

    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize playerName with default values for score and position
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    // Getter and setter for playerName
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter and setter for score
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for positionX
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and setter for positionY
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the player to a new position
    public void move(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println("Player " + playerName + " moved to (" + positionX + ", " + positionY + ")");
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Player " + playerName + " score: " + score);
    }
}

// Enemy.java
public 