class Player {
    private String playerName;
    private int score;
    private int playerPositionX;
    private int playerPositionY;

    public Player(String playerName, int startX, int startY) {
        this.playerName = playerName;
        this.score = 0; // default score
        this.playerPositionX = startX;
        this.playerPositionY = startY;
    }

    // Getter and setter for playerName
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter and setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for playerPositionX
    public int getPlayerPositionX() {
        return playerPositionX;
    }

    public void setPlayerPositionX(int playerPositionX) {
        this.playerPositionX = playerPositionX;
    }

    // Getter and setter for playerPositionY
    public int getPlayerPositionY() {
        return playerPositionY;
    }

    public void setPlayerPositionY(int playerPositionY) {
        this.playerPositionY = playerPositionY;
    }

    // Method to print player's information
    public void printPlayerInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + playerPositionX + ", " + playerPositionY + ")");
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        hero.printPlayerInfo();
        
        // Example interaction
        Enemy goblin = new Enemy("Goblin", 10);
        System.out.println(hero.getPlayerName() + " encounters a " + goblin.getEnemyName() 
            + " dealing " + goblin.getDamagePoints() + " damage!");
        hero.setScore(hero.getScore() - goblin.getDamagePoints());
        
        System.out.println("After the encounter:");
        hero.printPlayerInfo();
    }
}

public