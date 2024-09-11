class Enemy {
    // Instance fields
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters
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

    // Interaction method
    public void interact(Player player) {
        // Interaction logic, e.g., reduce player's score
        player.setScore(player.getScore() - 10);
        System.out.println("Encountered an enemy! Score reduced by 10.");
    }
}
```

Game.java
```java
import java.util.Scanner;

public 