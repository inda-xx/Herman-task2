class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // initialize score to zero
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    // Method to move the player
    public void move(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }
    
    // Method to increment score
    public void incrementScore(int points) {
        this.score += points;
    }
}

// Enemy.java
public 