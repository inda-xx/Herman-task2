public class Enemy {
    private String type;
    private int health;
    private boolean isDefeated;

    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
        this.isDefeated = false;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean isDefeated) {
        this.isDefeated = isDefeated;
    }
}