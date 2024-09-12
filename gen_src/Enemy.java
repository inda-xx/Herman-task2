class Enemy {

    private String type;
    private int health;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize all fields
    public Enemy(String type, int health, int xPosition, int yPosition) {
        this.type = type;
        this.health = health;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter and Setter methods for all private fields
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

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to print enemy information
    public void printInfo() {
        System.out.println("Enemy Type: " + this.type);
        System.out.println("Health: " + this.health);
        System.out.println("Position: (" + this.xPosition + ", " + this.yPosition + ")");
    }
}

// Game.
public