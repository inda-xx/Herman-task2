class Game {
    private Player player;
    private Enemy enemy;

    // Constructor
    public Game() {
        // Initialize Player and Enemy with example positions
        this.player = new Player(0, 0, 100);
        this.enemy = new Enemy(5, 5);
    }

    // Method to simulate game interaction
    public void play() {
        System.out.println("Starting Game...");
        printStatus();
        
        // Simulating player movement
        player.move(2, 3);
        System.out.println("Player moved to new position.");
        printStatus();

        // Simulating interaction with enemy
        if (player.getX() == enemy.getX() && player.getY() == enemy.getY()) {
            enemy.interact(player);
            System.out.println("Player interacted with Enemy.");
            printStatus();
        } else {
            System.out.println("No interaction with Enemy.");
        }
    }

    // Method to print current status of the game
    public void printStatus() {
        System.out.println("Player Position: (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Player Score: " + player.getScore());
        System.out.println("Enemy Position: (" + enemy.getX() + ", " + enemy.getY() + ")");
        System.out.println();
    }
    
    // Main method to run the game
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
