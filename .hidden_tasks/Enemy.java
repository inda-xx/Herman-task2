public class Enemy {
    private String enemyType;
    private int posX;
    private int posY;

    public Enemy(String enemyType, int posX, int posY) {
        this.enemyType = enemyType;
        this.posX = posX;
        this.posY = posY;
    }

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

    public void printEnemyInfo() {
        System.out.println("Enemy: " + enemyType + " Position: (" + posX + ", " + posY + ")");
    }
}