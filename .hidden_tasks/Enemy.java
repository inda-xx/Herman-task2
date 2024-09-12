public class Enemy {
    private String type;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters for all fields
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to print enemy's information
    public void printInfo() {
        System.out.println("Enemy Info:");
        System.out.println("Type: " + type);
        System.out.println("Health: " + health);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }
}