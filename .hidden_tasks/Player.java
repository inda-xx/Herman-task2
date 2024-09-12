import java.util.Set;

public class Player {

    // Fields
    private String name;
    private int x, y, score;

    // Constructor
    public Player(String name, int x, int y, int initialScore) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.score = initialScore;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Display player information
    public void displayInfo() {
        System.out.println("Player: " + getName());
        System.out.println("Position: (" + getX() + ", " + getY() + ")");
        System.out.println("Score: " + getScore());
    }

    public static void main(String[] args) {
        Player hero = new Player("Knight", 10, 5, 100);
        hero.displayInfo();
    }
}