class Enemy {
    private String type;
    private int x, y;
    private int health;

    public Enemy(String type, int x, int y, int health) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void interact(Player player) {
        // Basic interaction logic
        System.out.println("Enemy " + type + " interacts with player " + player.getName());
    }
}