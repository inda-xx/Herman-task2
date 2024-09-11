class Enemy {

    private String enemyName;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor to initialize all fields
    public Enemy(String enemyName, int health, int positionX, int positionY) {
        this.enemyName = enemyName;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter and setter for enemyName
    public String getEnemyName() {
        return enemyName;
    }
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    // Getter and setter for health
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and setter for positionX
    public int getPositionX() {
        return positionX;
    }
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and setter for positionY
    public int getPositionY() {
        return positionY;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to encounter a player and decrease player's score
    public void encounter(Player player) {
        player.setScore(player.getScore() - 10);
        System.out.println("Enemy " + enemyName + " encountered player " + player.getPlayerName() + "!");
        System.out.println("Player's new score: " + player.getScore());
    }
}

// Game.java
public 