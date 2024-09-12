class Game {
    private String playerName;
    private int playerScore;
    private int playerPosition;
    private int enemyPosition;
    private boolean gameOver;

    // Constructor to initialize the game
    public Game(String playerName, int playerScore, int playerPosition, int enemyPosition) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.playerPosition = playerPosition;
        this.enemyPosition = enemyPosition;
        this.gameOver = false;
    }

    // Getters
    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public int getEnemyPosition() {
        return enemyPosition;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    // Setters
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public void setEnemyPosition(int enemyPosition) {
        this.enemyPosition = enemyPosition;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    // Method to move the player
    public void movePlayer(int steps) {
        this.playerPosition += steps;
        this.playerScore += Math.abs(steps);
        if (playerPosition == enemyPosition) {
            playerScore += 10;
            gameOver = true;
            System.out.println("> " + playerName + " reached the enemy and won the game!");
        } else {
            System.out.println("> " + playerName + " moves to position " + playerPosition);
        }
    }

    // Method to print the current state of the game
    public void printInfo() {
        System.out.println("> INFO");
        System.out.println("> Player: " + getPlayerName());
        System.out.println("> Score: " + getPlayerScore());
        System.out.println("> Player Position: " + getPlayerPosition());
        System.out.println("> Enemy Position: " + getEnemyPosition());
        System.out.println("> Game Over: " + isGameOver());
    }

    public static void main(String[] args) {
        // Create a new game instance
        Game adventure = new Game("Hero", 0, 0, 5);

        // Print the initial state
        adventure.printInfo();

        // Move player and update state
        adventure.movePlayer(3);
        adventure.printInfo();

        // Move player to enemy position
        adventure.movePlayer(2);
        adventure.printInfo();
    }
}
