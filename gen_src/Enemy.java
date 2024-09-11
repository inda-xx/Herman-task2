class Enemy {

    private String enemyName;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor to initialize all fields of the enemy
    public Enemy(String enemyName, int health, int positionX, int positionY) {
        this.enemyName = enemyName;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter for enemyName
    public String getEnemyName() {
        return enemyName;
    }

    // Setter for enemyName
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to handle the encounter between the player and the enemy.
    public void encounter(Player player) {
        player.setScore(player.getScore() - 10);
        System.out.println("Enemy " + enemyName + " encountered player " + player.getPlayerName() + "!");
        System.out.println("Player's new score: " + player.getScore());
    }
}


// Game.java
public 