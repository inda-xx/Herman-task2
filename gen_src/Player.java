class Player {
    private String name;
    private int health;
    private int strength;
    private int x;
    private int y;

    public Player(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        // Initialize player position
        this.x = 0;
        this.y = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Movement method
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                y += 1;
                break;
            case "south":
                y -= 1;
                break;
            case "east":
                x += 1;
                break;
            case "west":
                x -= 1;
                break;
            default:
                System.out.println("Invalid direction.");
                return;
        }
        System.out.println("Moved " + direction + ". New position: [" + x + ", " + y + "]");
    }

    // Attack method
    public void attack(Enemy enemy) {
        if (this.strength > enemy.getStrength()) {
            enemy.setHealth(enemy.getHealth() - 10);
            System.out.println("You attacked " + enemy.getName() + " successfully!");
        } else {
            System.out.println("Attack failed!");
        }
    }
}

// Enemy.
public