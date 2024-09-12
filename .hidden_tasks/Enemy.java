public class Enemy {
    private String enemyType;
    private int enemyPosition;
    private boolean isDefeated;

    public Enemy(String enemyType, int enemyPosition) {
        this.enemyType = enemyType;
        this.enemyPosition = enemyPosition;
        this.isDefeated = false;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getEnemyPosition() {
        return enemyPosition;
    }

    public void setEnemyPosition(int enemyPosition) {
        this.enemyPosition = enemyPosition;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean isDefeated) {
        this.isDefeated = isDefeated;
    }

    public void printStatus() {
        System.out.println("> Enemy: " + enemyType);
        System.out.println("> Position: " + enemyPosition);
        System.out.println("> Defeated: " + isDefeated);
    }
}