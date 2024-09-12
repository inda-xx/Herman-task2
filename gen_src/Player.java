class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    private boolean isAlive;

    // Constructor
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0;
        this.isAlive = true;
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println("Player moved to position: (" + positionX + ", " + positionY + ")");
    }

    // Method to increment score
    public void incrementScore(int points) {
        this.score += points;
        System.out.println("Player score is now: " + score);
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player Info:");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Is Alive: " + isAlive);
    }
}

// Enemy.
public