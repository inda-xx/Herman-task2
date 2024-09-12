class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy(5, 5);

        player.printInfo(); // Player's initial state.
        enemy.printInfo(); // Enemy's initial position.

        player.addScore(10);
        enemy.moveTo(7, 8);

        player.printInfo(); // Updated player state.
        enemy.printInfo(); // Updated enemy position.
    }
}


This is a complete and functional Java implementation based on the task description provided. Each