class Enemy {
    
    // Instance fields
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and Setters
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void interact(Player player) {
        // Example: reduce player's score by 10
        player.setScore(player.getScore() - 10);
        System.out.println("Encountered an enemy! Score reduced!");
    }
}
```

Game.java
```java
import java.util.Scanner;

public 