class Player {
    private String name;
    private int score;
    private int health;
    private int xPosition;
    private int yPosition;

    public Player(String name, int score, int health, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

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

    public void printInfo() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Health: " + health);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public void interact(Enemy enemy) {
        System.out.println("Player " + name + " encounters a " + enemy.getType() + "!");
        health -= 10;
        System.out.println("Player's health: " + health);
    }
}

// Enemy.java
public 