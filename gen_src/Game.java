class Game {

    private Player player;
    private Enemy enemy;
    private int score;

    // Constructor
    public Game() {
        // Initialize fields
        score = 0;
        player = new Player("Hero", 100, 15);
        enemy = new Enemy("Goblin", 50, 10);
        System.out.println("Welcome to Adventure Quest!");
    }

    public static void main(String[] args) {
        Game game = new Game();
        // Example game loop (simplified for the task)
        game.player.move("north");
        game.player.attack(game.enemy);
        if (game.enemy.getHealth() <= 0) {
            game.score += 10;
            System.out.println("Enemy defeated! Current score: " + game.score);
        }
    }
}

// Player.
public