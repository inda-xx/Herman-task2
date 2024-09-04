class Game {
    public static void main(String[] args) {
        // Create a new player and an enemy
        Player player = new Player("John", 0, 0);
        Enemy enemy = new Enemy(3, 2);

        // Simulate player movement and interactions with the enemy
        player.move(1, 1);
        enemy.challenge(player);

        player.move(2, 1);
        enemy.challenge(player);
    }
}

// ScopeExample.java
public 