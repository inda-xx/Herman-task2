class Enemy {
    private String type;
    private int xPosition;
    private int yPosition;

    public Enemy(String type, int xPosition, int yPosition) {
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    
    // Method to print enemy information
    public void printInfo() {
        System.out.println("Type: " + type);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
}
```

Game.java:
```java
public 