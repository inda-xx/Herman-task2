class Enemy {
    private String name;
    private int positionX;
    private int positionY;
    private int health;

    public Enemy(String name, int positionX, int positionY, int health) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.health = health;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    // Method for interacting with the player
    public void interact(Player player) {
        if (this.health > 0) {
            System.out.println(this.name + " interacts with " + player.getName());
            // Example interaction: decrease player score and enemy health
            player.incrementScore(-10); // Deduct points from player for interaction
            this.health -= 10; // Example: enemy also loses some health
        }
    }
}

// Game.java
public 