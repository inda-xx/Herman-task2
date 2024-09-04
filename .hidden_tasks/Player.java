class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
    public Player(String name, int xPosition, int yPosition) {
        this.name = name;
        this.score = 0; // Score starts at 0
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Score
    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    // Getter and Setter for X Position
    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter and Setter for Y Position
    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
        System.out.println(name + " moved to (" + xPosition + ", " + yPosition + ")");
    }
}
```

Enemy.java
```java
public 