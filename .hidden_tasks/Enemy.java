class Enemy {
    private int positionX;
    private int positionY;

    /**
     * Constructs an Enemy with the specified initial position.
     * 
     * @param positionX the initial x-coordinate of the enemy
     * @param positionY the initial y-coordinate of the enemy
     */
    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters for positionX and positionY
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

    /**
     * Interacts with the player, reducing the player's score if the player
     * is at the same position as the enemy.
     * 
     * @param player the player to interact with
     */
    public void interact(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            System.out.println("Enemy encountered! Player loses 1 point.");
            player.setScore(player.getScore() - 1);
        }
    }
}
```

Game.java
```java
package game;

import java.util.ArrayList;

/**
 * The Game 