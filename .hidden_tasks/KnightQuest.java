class KnightQuest {
    private int playerPosition;
    private int score;
    private int enemiesDefeated;

    // Constructor initializes the game state
    public KnightQuest() {
        this.playerPosition = 0;
        this.score = 0;
        this.enemiesDefeated = 0;
    }

    // Getter for playerPosition
    public int getPlayerPosition() {
        return playerPosition;
    }

    // Setter for playerPosition
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

    // Getter for enemiesDefeated
    public int getEnemiesDefeated() {
        return enemiesDefeated;
    }

    // Setter for enemiesDefeated
    public void setEnemiesDefeated(int enemiesDefeated) {
        this.enemiesDefeated = enemiesDefeated;
    }
  
    // Method to print current game status
    public void printStatus() {
        System.out.println("Current Position: " + playerPosition);
        System.out.println("Score: " + score);
        System.out.println("Enemies Defeated: " + enemiesDefeated);
    }

    // Main method to run the game simulation
    public static void main(String[] args) {
        KnightQuest game = new KnightQuest();
        game.setPlayerPosition(5);
        game.setScore(100);
        game.setEnemiesDefeated(2);
        game.printStatus();
    }
}