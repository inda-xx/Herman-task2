class Enemy {
    private String type;
    private int posX;
    private int posY;

    public Enemy(String type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void interact(Player player) {
        if (this.posX == player.getPosX() && this.posY == player.getPosY()) {
            player.setScore(player.getScore() - 10);
            System.out.println("Enemy encounter! " + player.getName() + "'s score: " + player.getScore());
        }
    }
}

// Game.java
public 