class Enemy {
    private String enemyName;
    private int damagePoints;

    public Enemy(String enemyName, int damagePoints) {
        this.enemyName = enemyName; 
        this.damagePoints = damagePoints;
    }

    // Getter for enemyName
    public String getEnemyName() {
        return enemyName;
    }

    // Setter for enemyName
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    // Getter for damagePoints
    public int getDamagePoints() {
        return damagePoints;
    }

    // Setter for damagePoints
    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
}
