class GameApplication {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Goblin", 5, 5);

        player.printPlayerInfo();

        // Simulate the player encountering the enemy
        player.interact(enemy);

        player.printPlayerInfo();
    }
}
