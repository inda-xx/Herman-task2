public class Game {
    private Player player;
    private Enemy enemy;

    public Game() {
        this.player = new Player(0, 0); // Start player at origin
        this.enemy = new Enemy(1, 1); // Place enemy at (1, 1)
    }

    public void play() {
        // Example player movement
        player.move(1, 0); // Move player to (1, 0)
        System.out.println("Player position: (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Player score: " + player.getScore());

        // Enemy interacts with player if they meet
        enemy.interactWithPlayer(player);

        // Print positions and score after interaction
        System.out.println("Player position: (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Player score: " + player.getScore());
        System.out.println("Enemy position: (" + enemy.getX() + ", " + enemy.getY() + ")");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}