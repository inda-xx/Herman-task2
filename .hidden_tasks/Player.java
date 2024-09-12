public class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.score = 0;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
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

    public void move(int dx, int dy) {
        this.positionX += dx;
        this.positionY += dy;
    }

    public void printInfo() {
        System.out.println("Player: Name = " + name + ", Position = (" + positionX + ", " + positionY + "), Score = " + score);
    }
}