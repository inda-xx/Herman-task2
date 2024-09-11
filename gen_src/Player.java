class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;
    
    // Constructor initializes player attributes
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0; // Initial score
        this.positionX = 0; // Initial position X
        this.positionY = 0; // Initial position Y
    }
    
    // Getter for playerName
    public String getPlayerName() {
        return playerName;
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
    
    // Method for moving the player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        score++; // Increment score whenever the player moves
    }
    
    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Encountered " + enemy.getEnemyName() + "!");
            this.score -= enemy.getStrength(); // Deduct points based on enemy strength
        }
    }
}

// Enemy.java
public 