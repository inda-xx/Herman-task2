class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int xPosition, int yPosition) {
        this.name = name;
        this.score = 0; // Initial score is 0
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

    public void increaseScore(int points) {
        this.score += points;
    }
}

// Enemy.java
public 