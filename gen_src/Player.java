class Player {
    // Private instance fields
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize all fields
    public Player(String playerName, int score, int positionX, int positionY) {
        this.playerName = playerName;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
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

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the player and update score
    public void movePlayer(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        this.score += 10;
        System.out.println("Player " + playerName + " moved to position (" + positionX + ", " + positionY + ").");
        System.out.println("Current Score: " + score);
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    public static void main(String[] args) {
        // Create a new Player object using the constructor
        Player player1 = new Player("Hero", 0, 0, 0);

        // Move player to a new position
        player1.movePlayer(5, 3);

        // Print player information
        player1.printInfo();
    }
}
```

Enemy.java
```java
public 