public class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public void interact(Player player) {
        if (player.getXPosition() == xPosition && player.getYPosition() == yPosition) {
            player.increaseScore(10);  // Example interaction reward
            System.out.println("You encountered an enemy!");
        }
    }
}