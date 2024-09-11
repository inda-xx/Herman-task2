class GameWorld {
    // Instance fields
    private int x, y;
    private int score;
    private Player player;

    public GameWorld() {
        this.x = 0;
        this.y = 0;
        this.score = 0;
        // Initialize a player with default values
        this.player = new Player("Hero", 100, x, y);
    }

    public static void main(String[] args) {
        // Create an instance of the game world
        GameWorld game = new GameWorld();

        // Print the initial state
        System.out.println("Welcome to Java Adventures! Starting at: " + game.player.getX() + ", " + game.player.getY());
        System.out.println("Initial Score: " + game.getScore());

        // Example of player movement and scoring
        game.player.move(5, 3);
        game.increaseScore(10);

        // Create an enemy and demonstrate interaction
        Enemy enemy = new Enemy("Goblin", 50, 7, 3);
        game.player.attack(enemy);
    }

    public int getScore() {
        return score;
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Score increased by " + points + ". Current score: " + score);
    }
}
```

Player.java
```java
public 