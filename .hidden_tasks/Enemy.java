class Enemy {
    // Fields
    private String enemyType;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Enemy(String enemyType, int x, int y) {
        this.enemyType = enemyType;
        this.xPosition = x;
        this.yPosition = y;
    }

    // Getters and Setters
    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
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
}

// Game.java
public 