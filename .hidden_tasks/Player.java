import java.util.Set;

public class Player {
    private String playerName;
    private int score;
    private int playerPositionX;
    private int playerPositionY;

    // Constructor for initializing Player object
    public Player(String playerName, int startX, int startY) {
        this.playerName = playerName;
        this.score = 0; // Initial score
        this.playerPositionX = startX;
        this.playerPositionY = startY;
    }

    // Getter for playerName
    public String getPlayerName() {
        return playerName;
    }

    // Setter for playerName
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for playerPositionX
    public int getPlayerPositionX() {
        return playerPositionX;
    }

    // Setter for playerPositionX
    public void setPlayerPositionX(int playerPositionX) {
        this.playerPositionX = playerPositionX;
    }

    // Getter for playerPositionY
    public int getPlayerPositionY() {
        return playerPositionY;
    }

    // Setter for playerPositionY
    public void setPlayerPositionY(int playerPositionY) {
        this.playerPositionY = playerPositionY;
    }

    // Method to print player's information
    public void printPlayerInfo() {
        System.out.println("Player: " + getPlayerName());
        System.out.println("Score: " + getScore());
        System.out.println("Position: (" + getPlayerPositionX() + ", " + getPlayerPositionY() + ")");
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        hero.printPlayerInfo();
    }
}