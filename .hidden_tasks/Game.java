class Game {
    public static void main(String[] args) {
        Player player = new Player("John", 0, 0);
        Enemy enemy = new Enemy(3, 2);

        player.move(1, 1);
        enemy.challenge(player);

        player.move(2, 1);
        enemy.challenge(player);
    }
}
```

With the above implementation, you have encapsulated the player and enemy behaviors in their respective classes. This solution includes well-defined constructors, getters and setters, and methods to handle player movements and interactions. The game is driven with a basic loop in the `main` method of the `Game` class, demonstrating simple player movements and interactions with enemies. You can save each 