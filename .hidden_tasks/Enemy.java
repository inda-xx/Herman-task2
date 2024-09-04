class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and Setters
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

    public boolean isCollidedWithPlayer(Player player) {
        return this.xPosition == player.getXPosition() && this.yPosition == player.getYPosition();
    }
}

// Game.java
public 