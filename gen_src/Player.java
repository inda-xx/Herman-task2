class Player {
    private int x, y;
    private int score;

    // Constructor
    public Player(int startX, int startY, int startScore) {
        this.x = startX;
        this.y = startY;
        this.score = startScore;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
}



// Enemy.
public