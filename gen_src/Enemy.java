class Enemy {
    private int x, y;

    // Constructor
    public Enemy(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to interact with player (example interaction)
    public void interact(Player player) {
        // Simple interaction: reduces player's score by 10
        player.setScore(player.getScore() - 10);
    }
}



// Game.
public