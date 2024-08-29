class Game {
    // Private instance fields
    private String playerName;
    private int playerScore;
    private int playerPosition;
    private String enemyName;
    private int enemyPosition;
    private boolean gameRunning;

    // Constructor to initialize the game with player and enemy information
    public Game(String playerName, String enemyName, int enemyPosition) {
        this.playerName = playerName;
        this.playerScore = 0; // Initializing score to zero
        this.playerPosition = 0; // Starting position
        this.enemyName = enemyName;
        this.enemyPosition = enemyPosition;
        this.gameRunning = true;
    }

    // Getters and Setters
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public int getPlayerScore() {
        return playerScore;
    }
    
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    
    public int getPlayerPosition() {
        return playerPosition;
    }
    
    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
    
    public String getEnemyName() {
        return enemyName;
    }
    
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
    
    public int getEnemyPosition() {
        return enemyPosition;
    }
    
    public void setEnemyPosition(int enemyPosition) {
        this.enemyPosition = enemyPosition;
    }
    
    public boolean isGameRunning() {
        return gameRunning;
    }
    
    public void setGameRunning(boolean gameRunning) {
        this.gameRunning = gameRunning;
    }

    // Method to print the current game status
    public void printGameState() {
        System.out.println("Player: " + getPlayerName() + ", Score: " + getPlayerScore());
        System.out.println("Enemy: " + getEnemyName() + ", Position: " + getEnemyPosition());
    }

    // Method to move the player by a certain number of steps
    public void movePlayer(int steps) {
        int newPosition = getPlayerPosition() + steps;
        setPlayerPosition(newPosition);
        System.out.println("Player moved to position: " + getPlayerPosition());
    }

    // Method to update the player's score by a certain amount
    public void updateScore(int points) {
        int newScore = getPlayerScore() + points;
        setPlayerScore(newScore);
        System.out.println("Score updated: " + getPlayerScore());
    }

    // Method to handle encounters with the enemy
    public void encounterEnemy() {
        if (getPlayerPosition() == getEnemyPosition()) {
            System.out.println("Encountered " + getEnemyName() + "!");
            updateScore(-5); // Deduct points on encounter
        }
    }

    // Main method to demonstrate the game functionality
    public static void main(String[] args) {
        // Instantiate a new game with initial player and enemy settings
        Game game = new Game("Player1", "Enemy1", 5);

        // Print initial status of the game
        System.out.println("Welcome " + game.getPlayerName());
        game.printGameState();

        // Move the player by 3 steps and update the score by 10 points
        game.movePlayer(3);
        game.updateScore(10);
        game.printGameState();

        // Move player to position 5 to encounter the enemy
        game.movePlayer(2);
        game.encounterEnemy();
        game.printGameState();
    }
}