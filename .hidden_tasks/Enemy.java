import java.util.Set;

class Enemy {
    // Fields
    private String type;
    private int position;
    private int damage;

    // Constructor
    public Enemy(String type, int position, int damage) {
        this.type = type;
        this.position = position;
        this.damage = damage;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}