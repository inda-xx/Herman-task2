class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Goblin", 1, 1);

        player.move(1, 1);
        enemy.interact(player);

        player.incrementScore(20);
        player.move(0, -1);
        enemy.interact(player);

        player.incrementScore(10);
    }
}