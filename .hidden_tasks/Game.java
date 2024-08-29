class Game {
    private Player player;
    private List<Enemy> enemies;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void interact(Player player, Enemy enemy) {
        if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
            player.setScore(player.getScore() - 1);
            System.out.println("Collided with enemy, new score: " + player.getScore());
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Explorer", 0, 0, 0);
        Game game = new Game(player);

        Enemy enemy1 = new Enemy("Goblin", 0, 0);
        game.addEnemy(enemy1);

        player.printInfo();
        game.interact(player, enemy1);

        player.setPositionX(2);
        player.setPositionY(3);
        Enemy enemy2 = new Enemy("Orc", 2, 3);
        game.addEnemy(enemy2);

        player.printInfo();
        game.interact(player, enemy2);
    }
}
```

This implementation creates a simple game setup with a player and enemies, allows the player to move and interact with enemies, and adjusts the score according to collisions. Each 