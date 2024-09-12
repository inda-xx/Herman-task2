class Game {
    public static void main(String[] args) {
        // Create a new player at position 0
        Player player = new Player("Hero", 0);
        // Create a new enemy at position 5 with 10 attack power
        Enemy goblin = new Enemy("Goblin", 5, 10);

        // Move player to position 5
        player.move(5);
        player.printStatus(); // Print player's status

        // Have the goblin interact with the player
        goblin.interact(player);
        player.printStatus(); // Print player's status again
    }
}
```

In this implementation:
- The `Player` 