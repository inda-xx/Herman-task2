class Enemy {
    // Instance fields
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and Setters
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

    // Interaction method (simple example)
    public void interact(Player player) {
        System.out.println("Enemy at (" + positionX + ", " + positionY + ") interacts with " + player.getName());
        player.increaseScore(5); // Example interaction: player gains points on enemy interaction
    }
}



// Game.
public