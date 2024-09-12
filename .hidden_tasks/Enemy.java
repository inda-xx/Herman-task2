public class Enemy {
    private int x, y;

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    // Method to "attack" the player and decrease score
    public void interactWithPlayer(Player player) {
        if (player.getX() == this.x && player.getY() == this.y) {
            player.setScore(player.getScore() - 1); // Decrease player's score if positions match
        }
    }
}