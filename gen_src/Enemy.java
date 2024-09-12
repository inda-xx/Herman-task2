class Enemy {
    
    // Fields
    private String type;
    private int positionX;
    private int positionY;
    private boolean alive;
    
    // Constructor
    public Enemy(String type, int positionX, int positionY, boolean alive) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.alive = alive;
    }
    
    // Getters
    public String getType() {
        return type;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isAlive() {
        return alive;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    // Print enemy information
    public void printInfo() {
        System.out.println("Enemy Type: " + type);
        System.out.println("Alive: " + alive);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }
}



// File: SpaceAdventure.
public