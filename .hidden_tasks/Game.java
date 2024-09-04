class Game {

    public static void main(String[] args) {
        // Instantiate player and enemy objects
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Goblin", 2, 2);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter command (up, down, left, right, exit): ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                running = false;
                continue;
            }

            // Move player based on user input
            player.move(command);
            printGameState(player, enemy);
            checkForEnemies(player, enemy);
            
            // Example checkpoint logic: Increase score if player reaches position (1,1)
            if (player.getPositionX() == 1 && player.getPositionY() == 1) {
                player.increaseScore(10);
                System.out.println("Checkpoint reached! Score increased by 10.");
            }
        }

        scanner.close();
    }

    // Method to check for enemies
    public static void checkForEnemies(Player player, Enemy enemy) {
        if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
            System.out.println("Enemy encountered!");
        }
    }

    // Method to print the current game state
    public static void printGameState(Player player, Enemy enemy) {
        System.out.println("Player Position: (" + player.getPositionX() + ", " + player.getPositionY() + ")");
        System.out.println("Player Score: " + player.getScore());
        System.out.println("Enemy Position: (" + enemy.getPositionX() + ", " + enemy.getPositionY() + ")");
    }
}

```