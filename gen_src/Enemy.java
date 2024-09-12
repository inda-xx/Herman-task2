class Enemy {
    private int positionX;
    private int positionY;

    // Constructor to initialize enemy's position
    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the enemy to a new position
    public void moveTo(int x, int y) {
        this.positionX = x;
        this.positionY = y;
    }

    // Method to print enemy's information
    public void printInfo() {
        System.out.println("Enemy Position = (" + positionX + ", " + positionY + ")");
    }
}



// Game.
public