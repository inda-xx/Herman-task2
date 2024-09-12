class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    /**
     * Constructs a Player with the specified name and initial position.
     * 
     * @param name the name of the player
     * @param positionX the initial x-coordinate of the player
     * @param positionY the initial y-coordinate of the player
     */
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.score = 0; // Initial score
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getters and setters for the name, score, positionX, and positionY
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

    /**
     * Moves the player in the specified direction and prints the new position.
     * 
     * @param direction the direction to move ("up", "down", "left", "right")
     */
    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                this.positionY++;
                break;
            case "down":
                this.positionY--;
                break;
            case "left":
                this.positionX--;
                break;
            case "right":
                this.positionX++;
                break;
            default:
                System.out.println("Invalid direction!");
                return;
        }
        System.out.println(name + " moved to (" + this.positionX + ", " + this.positionY + ")");
    }
}
```

Enemy.java
```java
package game;

/**
 * The Enemy 