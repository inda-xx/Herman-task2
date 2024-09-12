public class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    public Player(String name, int startX, int startY) {
        this.name = name;
        this.xPosition = startX;
        this.yPosition = startY;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setXPosition(int x) {
        this.xPosition = x;
    }

    public void setYPosition(int y) {
        this.yPosition = y;
    }

    public void move(int xChange, int yChange) {
        xPosition += xChange;
        yPosition += yChange;
        System.out.println(name + " moved to position (" + xPosition + ", " + yPosition + ")");
    }

    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + " scored! New score: " + score);
    }
}