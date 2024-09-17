import java.util.Set;

public class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor
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

    // Method to move the player
    public void move(int dx, int dy) {
        this.xPosition += dx;
        this.yPosition += dy;
        System.out.println("Moved to new position: (" + this.xPosition + ", " + this.yPosition + ")");
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        this.score += 10; // Increase score by 10 points when interacting with an enemy
        System.out.println("Encountered an enemy of type: " + enemy.getType());
        System.out.println("New Score: " + this.score);
    }

    public void printInfo() {
        System.out.println("Player: " + this.getName());
        System.out.println("Score: " + this.getScore());
        System.out.println("Position: (" + this.getXPosition() + ", " + this.getYPosition() + ")");
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0, 0);
        hero.printInfo();
        Enemy monster = new Enemy("Orc", 5, 5);
        hero.move(5, 5);
        hero.interactWithEnemy(monster);
    }
}