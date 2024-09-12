class Enemy {
    private String type;
    private int positionX;
    private int positionY;
    private int damage;

    // Constructor
    public Enemy(String type, int positionX, int positionY, int damage) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.damage = damage;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Method for enemy interaction with player
    public void interact(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            player.setScore(player.getScore() - this.damage);
            System.out.println("Player interacted with enemy and lost " + this.damage + " points. New score: " + player.getScore());
        }
    }

    // Method to print enemy information
    public void printInfo() {
        System.out.println("Enemy Info:");
        System.out.println("Type: " + type);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Damage: " + damage);
    }
}
