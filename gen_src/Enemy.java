class Enemy {
    // Instance fields
    private String type;
    private int health;
    private boolean isDefeated;

    // Constructor
    public Enemy(String type, int health) {
        this.type = type;
        this.health = health;
        this.isDefeated = false;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for isDefeated
    public boolean isDefeated() {
        return isDefeated;
    }

    // Setter for isDefeated
    public void setDefeated(boolean isDefeated) {
        this.isDefeated = isDefeated;
    }
}

// Main.
public