class Adventurer {
    private String name;
    private int health;
    private int score;
    private int energy;

    // Constructor to initialize the adventurer's details
    public Adventurer(String name, int health, int score, int energy) {
        this.name = name;
        this.health = health;
        this.score = score;
        this.energy = energy;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter methods for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and Setter methods for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // Method to print adventurer's details
    public void printInfo() {
        System.out.println("Adventurer Name: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Score: " + this.score);
        System.out.println("Energy: " + this.energy);
    }

    // Method for attacking an enemy
    public void attack(Enemy enemy) {
        if (this.energy > 0) {
            int damage = Math.min(enemy.getHealth(), this.energy); // use energy as damage
            enemy.setHealth(enemy.getHealth() - damage);
            this.energy -= 10; // reduce energy
            this.score += damage; // increase score
            System.out.println(this.name + " attacks " + enemy.getType() + " reducing health to " + enemy.getHealth());
        } else {
            System.out.println(this.name + " is too tired to attack.");
        }
    }
    
    public static void main(String[] args) {
        Adventurer hero = new Adventurer("Aragorn", 100, 0, 50);
        hero.printInfo();
    }
}

// Enemy.java
public 