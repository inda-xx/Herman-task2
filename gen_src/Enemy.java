class Enemy {
    private int positionX;
    private int positionY;

    public Enemy(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
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

    public void interact(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            System.out.println("Enemy encountered! Player loses 1 point.");
            player.setScore(player.getScore() - 1);
        }
    }
}



// Game.
package game;

import .util.ArrayList;

public