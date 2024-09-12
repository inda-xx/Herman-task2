class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Villain", 5);

        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the game, " + player.getPlayerName() + "!");
        while (true) {
            System.out.println("Enter a command (up, down, left, right, interact, status, quit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "up":
                    player.moveUp();
                    break;
                case "down":
                    player.moveDown();
                    break;
                case "left":
                    player.moveLeft();
                    break;
                case "right":
                    player.moveRight();
                    break;
                case "interact":
                    player.interactWithEnemy(enemy);
                    break;
                case "status":
                    player.printPlayerStatus();
                    break;
                case "quit":
                    System.out.println("Quitting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}
```

In this game, a player can move around and interact with an enemy, with their score decreasing when they interact with an enemy. The game continues to run until the player types 'quit'. Instructions are provided to guide the player on how to use the game commands.