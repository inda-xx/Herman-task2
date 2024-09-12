class Enemy {
    private String type;
    private int positionX;
    private int positionY;

    // Constructor to initialize the enemy type and position
    public Enemy(String type, int x, int y) {
        this.type = type;
        this.positionX = x;
        this.positionY = y;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Method for interaction between enemy and player
    public void interact(Player player) {
        System.out.println(type + " encountered the player!");
        player.setScore(player.getScore() - 10); // Deduct points from player
    }
}

// ShadowExample.java

public 