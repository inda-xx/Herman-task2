class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 5, 5);
        Enemy enemy = new Enemy(1, 5, 5);

        player.printPlayerInfo();
        enemy.printEnemyInfo();

        // Checking for collision
        if (player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
            System.out.println("Player caught by Enemy!");
            player.setScore(0); // Reset score
            player.printPlayerInfo();
        }
    }
}

