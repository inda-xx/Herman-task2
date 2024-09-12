class Main {
    public static void main(String[] args) {
        // Create a player
        Player player = new Player("Hero", 0, 0);
        player.printInfo();

        // Create an enemy
        Enemy goblin = new Enemy("Goblin", 2, 3, 5);
        goblin.printInfo();

        // Move the player
        player.move(2, 3);

        // Interact with the enemy
        goblin.interact(player);

        // Print updated player info
        player.printInfo();
    }
}
```

These classes are independent and can be used to simulate a simple text-based game in Java. The `Main` 