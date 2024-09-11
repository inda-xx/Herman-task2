class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 5, 5);
        Enemy enemy1 = new Enemy(7, 7);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter move (w/a/s/d) or 'exit' to quit:");

        while (true) {
            String move = scanner.nextLine();

            if (move.equals("exit")) {
                break;
            }

            switch (move) {
                case "w": player1.setPositionY(player1.getPositionY() + 1); break;
                case "s": player1.setPositionY(player1.getPositionY() - 1); break;
                case "a": player1.setPositionX(player1.getPositionX() - 1); break;
                case "d": player1.setPositionX(player1.getPositionX() + 1); break;
                default: System.out.println("Invalid move. Use w/a/s/d to move."); continue;
            }

            System.out.println("New Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
            checkEnemyEncounter(player1, enemy1);
            System.out.println("Current Score: " + player1.getScore());
        }

        System.out.println("Game Over! Final Score: " + player1.getScore());
    }

    // Method to check if player encounters an enemy
    private static void checkEnemyEncounter(Player player, Enemy enemy) {
        if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
            enemy.interact(player);
        }
    }
}
```

In these files:

- `Player.java` defines the Player 