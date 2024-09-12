class Player {

    private String name;
    private int score;
    private int health;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize all fields
    public Player(String name, int score, int health, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter and Setter methods for all private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player: " + this.name);
        System.out.println("Score: " + this.score);
        System.out.println("Health: " + this.health);
        System.out.println("Position: (" + this.xPosition + ", " + this.yPosition + ")");
    }

    // Method to interact with an enemy
    public void interact(Enemy enemy) {
        System.out.println("Player " + this.name + " encounters a " + enemy.getType() + "!");
        // Decrease the player's health by 10 when interacting with an enemy
        this.health -= 10;
        System.out.println("Player's health: " + this.health);
    }
}

// Enemy.
public