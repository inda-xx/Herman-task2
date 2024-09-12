class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name, int score, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and Setters
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

    // Print player info
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    // Move player
    public void move(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
        System.out.println("New Position: (" + xPosition + ", " + yPosition + ")");
    }

    // Increase score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println("New Score: " + score);
    }

    // Attack enemy
    public void attack(Enemy enemy) {
        int randomPoints = (int)(Math.random() * 10) + 1;
        increaseScore(randomPoints);
        System.out.println(name + " attacked " + enemy.getType() + " and gained " + randomPoints + " points!");
    }
}

// Enemy.java
public 