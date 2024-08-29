class Enemy {
    private String type;
    private int health;
    private int damage;

    // Constructor to initialize the enemy's attributes
    public Enemy(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    // Getter and Setter methods for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter methods for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter methods for damage
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Method to print enemy's details
    public void printInfo() {
        System.out.println("Enemy Type: " + this.type);
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
    }

    // Method for counter-attacking the adventurer
    public void counterAttack(Adventurer adventurer) {
        adventurer.setHealth(adventurer.getHealth() - this.damage);
        System.out.println(this.type + " counter-attacks " + adventurer.getName() + ", reducing health to " + adventurer.getHealth());
    }

    public static void main(String[] args) {
        Enemy orc = new Enemy("Orc", 50, 10);
        orc.printInfo();
    }
}