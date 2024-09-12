class Enemy {
    private String type;
    private int positionX;
    private int positionY;

    public Enemy(String type, int x, int y) {
        this.type = type;
        this.positionX = x;
        this.positionY = y;
    }

    public String getType() {
        return type;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void interact(Player player) {
        System.out.println(type + " encountered the player!");
        player.setScore(player.getScore() - 10);
    }
}



// ShadowExample.

public