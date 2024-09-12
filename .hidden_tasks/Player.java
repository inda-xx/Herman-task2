class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.positionX = 0;
        this.positionY = 0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Methods for moving the player
    public void moveUp() {
        positionY += 1;
        System.out.println(playerName + " moved up to position (" + positionX + ", " + positionY + ")");
    }

    public void moveDown() {
        positionY -= 1;
        System.out.println(playerName + " moved down to position (" + positionX + ", " + positionY + ")");
    }

    public void moveLeft() {
        positionX -= 1;
        System.out.println(playerName + " moved left to position (" + positionX + ", " + positionY + ")");
    }

    public void moveRight() {
        positionX += 1;
        System.out.println(playerName + " moved right to position (" + positionX + ", " + positionY + ")");
    }

    // Method for interacting with an enemy
    public void interactWithEnemy(Enemy enemy) {
        score -= enemy.getDamage();
        System.out.println(playerName + " interacted with enemy " + enemy.getEnemyName() + " and lost " + enemy.getDamage() + " points. Current score: " + score);
    }

    public void printPlayerStatus() {
        System.out.println("Player: " + playerName + "\nScore: " + score + "\nPosition: (" + positionX + ", " + positionY + ")");
    }
}
```

Enemy.java:
```java
public 