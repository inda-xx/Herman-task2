class Game {
    public static void main(String[] args) {
        // Create a new player
        Player player = new Player("Hero");
        player.printPlayerInfo();

        // Move player
        player.move(1, 2);

        // Simulate scoring
        player.increaseScore(10);

        // Create an enemy
        Enemy enemy = new Enemy(1, 2);
        
        // Player interacts with enemy
        enemy.interact(player);

        // Print final player info
        player.printPlayerInfo();
    }
}
