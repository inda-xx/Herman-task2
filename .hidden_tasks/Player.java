class Player {
    // Fields
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.score = 0; // Initialize score to 0
        this.xPosition = x;
        this.yPosition = y;
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

    // Methods
    public void move(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    public void interactWithEnemy(Enemy enemy) {
        System.out.println(name + " encountered an " + enemy.getEnemyType());
        // Interaction logic can be added here.
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + "'s score is now: " + score);
    }
}

// Enemy.java
public 