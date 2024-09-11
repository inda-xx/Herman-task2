class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 5, 5);
        Enemy enemy = new Enemy(7, 7);

        // Basic game loop for player movement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter move (w/a/s/d) or 'q' to quit:");

        while (true) {
            String move = scanner.nextLine();
            
            if (move.equals("q")) {
                System.out.println("Game Over!");
                break;
            }

            switch (move) {
                case "w": player1.setPositionY(player1.getPositionY() + 1); break;
                case "s": player1.setPositionY(player1.getPositionY() - 1); break;
                case "a": player1.setPositionX(player1.getPositionX() - 1); break;
                case "d": player1.setPositionX(player1.getPositionX() + 1); break;
                default: System.out.println("Invalid move! Use 'w', 'a', 's', 'd' or 'q' to quit."); continue;
            }

            player1.increaseScore(5);
            System.out.println("New Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
            System.out.println("Score: " + player1.getScore());

            checkEnemyEncounter(player1, enemy);
        }
        
        scanner.close();
    }

    private static void checkEnemyEncounter(Player player, Enemy enemy) {
        if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
            enemy.interact(player);
            System.out.println("Current Score after encounter: " + player.getScore());
        }
    }
}
```

These Java files should be saved with their respective 