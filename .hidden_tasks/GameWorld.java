class GameWorld {
    private Player player;
    private Enemy[] enemies;

    public GameWorld(Player player, Enemy[] enemies) {
        this.player = player;
        this.enemies = enemies;
        
        // Print initial game state
        System.out.println(player);
        Arrays.stream(enemies).forEach(System.out::println);
    }

    public Player getPlayer() {
        return player;
    }

    public void startGame() {
        // Example game logic
        player.moveRight();
        player.moveUp();
        System.out.println("Player moved to: " + player.getPosition());
        
        for (Enemy enemy : enemies) {
            enemy.attack(player);
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 100, new Position(0, 0));
        Enemy goblin = new Enemy("Goblin", 50, new Position(5, 5));
        GameWorld world = new GameWorld(player, new Enemy[] { goblin });

        world.startGame();
    }
}
```

These classes represent a basic framework for the game as described. The Player can move and its state is managed with encapsulation principles using private fields and public getters/setters. The Enemy interacts with the Player, simulating a simple attack that modifies the Player's health. The GameWorld 