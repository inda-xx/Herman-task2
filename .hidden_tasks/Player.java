class Player {
    private String playerName;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String playerName, int score, int positionX, int positionY) {
        this.playerName = playerName;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter and Setter for playerName
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and Setter for positionX
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and Setter for positionY
    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to move the Player
    public void movePlayer(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        this.score += 10; // increment score by 10 for every move
        System.out.println("Player " + playerName + " moved to position (" + x + ", " + y + ").");
        System.out.println("Current Score: " + score);
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0, 0);
        player1.movePlayer(5, 3);
        player1.printInfo();
    }
}
```

Enemy.java:
```java
public 