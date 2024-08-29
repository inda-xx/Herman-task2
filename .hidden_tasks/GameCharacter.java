class GameCharacter {
    
    private String name;
    private int health;
    private int position;
    private boolean alive;

    // Constructor to initialize the character
    public GameCharacter(String name, int health, int position) {
        this.name = name;
        this.health = health;
        this.position = position;
        this.alive = true; // By default, the character is alive
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            this.alive = false;
            this.health = 0; // Ensuring health doesn't go below 0
        }
    }

    // Getter and Setter for position
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    // Getter for alive status
    public boolean isAlive() {
        return alive;
    }

    // Method to move the character
    public void move(int steps) {
        if (alive) {
            this.position += steps;
            System.out.println(name + " moved to position " + position);
        } else {
            System.out.println(name + " cannot move, they are not alive.");
        }
    }

    // Method to apply damage to the character
    public void receiveDamage(int damage) {
        if (alive) {
            health -= damage;
            if (health <= 0) {
                alive = false;
                health = 0;
                System.out.println(name + " has been defeated!");
            } else {
                System.out.println(name + " now has " + health + " health.");
            }
        } else {
            System.out.println(name + " is already defeated.");
        }
    }

    public static void main(String[] args) {
        // Create a new character
        GameCharacter hero = new GameCharacter("Aldren", 100, 0);

        // Move and apply damage to the character
        hero.move(5);
        hero.receiveDamage(20);

        // Display the current state
        System.out.println("Position: " + hero.getPosition());
        System.out.println("Health: " + hero.getHealth());
        System.out.println("Alive: " + hero.isAlive());
        
        // Test the character receiving enough damage to be defeated
        hero.receiveDamage(80);
        
        // Try moving the character after defeat
        hero.move(10);
    }
}

// VariableExample.java
public 