class Enemy {

    private String name;
    private int xPosition;
    private int yPosition;
    private int damage;

    // Constructor to initialize an Enemy with a name, position, and damage
    public Enemy(String name, int x, int y, int damage) {
        this.name = name;
        this.xPosition = x;
        this.yPosition = y;
        this.damage = damage;
    }

    // Method to simulate an attack on a player
    public void attack(Player player) {
        if (player.getXPosition() == xPosition && player.getYPosition() == yPosition) {
            System.out.println(name + " attacks " + player.getName() + " dealing " + damage + " damage!");
            player.setAlive(false); // Assume player is dead for simplification
        }
    }

    // Getter for enemy's name
    public String getName() {
        return name;
    }

    // Setter for enemy's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for enemy's x position
    public int getXPosition() {
        return xPosition;
    }

    // Setter for enemy's x position
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter for enemy's y position
    public int getYPosition() {
        return yPosition;
    }

    // Setter for enemy's y position
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Getter for enemy's damage
    public int getDamage() {
        return damage;
    }

    // Setter for enemy's damage
    public void setDamage(int damage) {
        this.damage = damage;
    }
}