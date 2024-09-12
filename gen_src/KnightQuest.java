class KnightQuest {
    // Instance fields to track player's position, score, and defeated enemies
    private int playerPosition;
    private int score;
    private int enemiesDefeated;

    // Constructor to initialize the starting values for the game
    public KnightQuest() {
        this.playerPosition = 0;
        this.score = 0;
        this.enemiesDefeated = 0;
    }

    // Getter for player position
    public int getPlayerPosition() {
        return playerPosition;
    }

    // Setter for player position
    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for enemies defeated
    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    // Setter for enemies defeated
    public void setEnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }

    // Method to print the current status of the game
    public void printStatus() {
        System.out.println("Current Position: " + playerPosition);
        System.out.println("Score: " + score);
        System.out.println("Enemies Defeated: " + enemiesDefeated);
    }

    // Main method to run the game
    public static void main(String[] args) {
        KnightQuest game = new KnightQuest();
        game.setPlayerPosition(5); // Example: Set player position to 5
        game.setScore(100);        // Example: Set score to 100
        game.setEnemiesDefeated(2);// Example: Set enemies defeated to 2
        game.printStatus();        // Print the current status
    }
}



// File: ShadowExample.

public