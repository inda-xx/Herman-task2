class GameWorld {
    // Instance fields
    private int x, y;
    private int score;
    private Player player;
    
    public GameWorld() {
        // Initialize game world with default player position and score
        this.x = 0;
        this.y = 0;
        this.score = 0;
        this.player = new Player("Hero", 100, 0, 0);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getScore() {
        return score;
    }
    
    public void increaseScore(int points) {
        this.score += points;
        System.out.println("Score increased by " + points + ". Current score: " + score);
    }
    
    public static void main(String[] args) {
        // Create an instance of the game world
        GameWorld game = new GameWorld();
        
        // Print the initial state
        System.out.println("Welcome to Java Adventures! Starting at: " + game.getX() + ", " + game.getY());
        System.out.println("Initial Score: " + game.getScore());
        
        // Demonstrate player movement and score increase
        game.player.move(3, 4);
        game.increaseScore(10);
    }
}

// Player.java
public 