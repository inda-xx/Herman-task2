class Enemy {
    private String enemyType;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Enemy(String enemyType, int x, int y) {
        this.enemyType = enemyType;
        this.xPosition = x;
        this.yPosition = y;
    }

    // Getter and Setter for enemyType
    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    // Getter and Setter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter and Setter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}
```

Game.java:
```java
public 