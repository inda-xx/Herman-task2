class Enemy {
    // Fields for the enemy's position
    private int xPosition;
    private int yPosition;

    // Constructor
    public Enemy(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and setters
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
```

Example.java (for understanding variable shadowing as per Exercise 6)
```java
public 