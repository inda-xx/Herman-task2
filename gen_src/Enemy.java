class Enemy {
    private String enemyType;
    private int posX;
    private int posY;

    // Constructor
    public Enemy(String enemyType, int posX, int posY) {
        this.enemyType = enemyType;
        this.posX = posX;
        this.posY = posY;
    }

    // Getters and Setters
    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}



// ScopeExample.
public