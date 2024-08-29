class Enemy {
    private String type;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters
    public String getType() {
        return type;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Method to print enemy information
    public void printInfo() {
        System.out.println("Enemy: " + type + " at (" + positionX + ", " + positionY + ")");
    }
}
```

Game.java
```java
public 