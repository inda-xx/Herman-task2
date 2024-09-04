class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name, int x, int y) {
        this.name = name;
        this.score = 0;    // Initialize score to 0
        this.xPosition = x;
        this.yPosition = y;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and Setter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter and Setter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to move the player
    public void move(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println(name + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        System.out.println(name + " encountered an " + enemy.getEnemyType());
        // Interaction logic can be added here.
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + "'s score is now: " + score);
    }
}
```

Enemy.java:
```java
public 