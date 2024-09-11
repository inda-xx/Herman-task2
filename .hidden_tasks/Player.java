class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 0; // Starting position
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

    // Moves the player and increases the score
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        this.score++; // Increase score each move
    }

    // Interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Encountered " + enemy.getEnemyName() + "!");
            this.score -= enemy.getStrength(); // Deduct points based on enemy's strength
        }
    }
}
```

**Enemy.java**
```java
public 