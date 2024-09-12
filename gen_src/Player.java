class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

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
    
    // Method to print player information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to move the player
    public void move(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println("New Position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to increase score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println("New Score: " + score);
    }

    // Method to attack an enemy
    public void attack(Enemy enemy) {
        int scoreIncrease = (int)(Math.random() * 10) + 1; // Random score increase between 1 and 10
        increaseScore(scoreIncrease);
        System.out.println(name + " attacked an enemy of type " + enemy.getType() + " and increased score by " + scoreIncrease);
    }
}
```

Enemy.java:
```java
public 