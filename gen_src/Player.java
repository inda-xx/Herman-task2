class Player {
    // Instance fields
    private String name;
    private int health;
    private int score;

    // Constructor
    public Player(String name, int health, int score) {
        this.name = name;
        this.health = health;
        this.score = score;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Setter for health
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Method to move the player
    public void move() {
        System.out.println(name + " moved to a new position.");
    }

    // Method for player to attack an enemy
    public void attack(Enemy enemy) {
        if (!enemy.isDefeated()) {
            enemy.setHealth(enemy.getHealth() - 10);
            System.out.println(name + " attacked " + enemy.getType() + "!");
            if (enemy.getHealth() <= 0) {
                enemy.setDefeated(true);
                System.out.println(enemy.getType() + " is defeated!");
            }
        } else {
            System.out.println(enemy.getType() + " is already defeated.");
        }
    }

    // Method to add score
    public void addScore(int points) {
        this.score += points;
        System.out.println("Score updated! Current score: " + score);
    }
}

// Enemy.
public