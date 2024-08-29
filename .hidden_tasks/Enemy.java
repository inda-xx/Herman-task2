class Enemy {

    // Instance fields for Enemy class
    private String type;
    private int health;
    private int positionX;
    private int positionY;

    // Constructor to initialize Enemy
    public Enemy(String type, int health, int positionX, int positionY) {
        this.type = type;
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter and setter for type
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    // Getter and setter for health
    public int getHealth() {
        return health;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and setter for positionX
    public int getPositionX() {
        return positionX;
    }
    
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and setter for positionY
    public int getPositionY() {
        return positionY;
    }
    
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to attack a player
    public void attackPlayer(Player player) {
        if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
            player.setScore(player.getScore() - 10);
            System.out.println("Enemy " + this.type + " attacked player " + player.getName() + "!");
        } else {
            System.out.println("Enemy " + this.type + " is not in position to attack player " + player.getName() + ".");
        }
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 100, 0, 0);

        goblin.attackPlayer(hero);
        hero.printInfo();
    }
}


// ShadowExample.java

public 