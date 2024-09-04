class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize the player's name and starting position
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.positionX = startX;
        this.positionY = startY;
        this.score = 0;
    }

    // Getters and setters for each field
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

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the player
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                positionY--;
                break;
            case "down":
                positionY++;
                break;
            case "left":
                positionX--;
                break;
            case "right":
                positionX++;
                break;
        }
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
    }
}
```

```java
// Enemy.java
public 