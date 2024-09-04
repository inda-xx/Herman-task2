class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Method to interact with the player
    public void challenge(Player player) {
        player.addScore(-10); // Decrease player's score by 10
        System.out.println("Enemy at (" + xPosition + ", " + yPosition + ") challenges " +
                           player.getName() + "! Score is now: " + player.getScore());
    }
}
```

Game.java
```java
public 