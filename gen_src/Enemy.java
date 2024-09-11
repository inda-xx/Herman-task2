class Enemy {
    // Instance fields
    private int health;

    // Constructor to initialize health
    public Enemy(int health) {
        this.health = health;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Method to interact with a player
    public void interact(Player player) {
        System.out.println("Player " + player.getPlayerName() + " encountered an enemy!");
        player.setScore(player.getScore() + 5);
    }

    public static void main(String[] args) {
        // Create a new Player and Enemy object
        Player player1 = new Player("Hero", 0, 0, 0);
        Enemy goblin = new Enemy(100);

        // Simulate an interaction between the player and the enemy
        goblin.interact(player1);

        // Print player information
        player1.printInfo();
    }
}
```

ShadowExample.java
```java
public 