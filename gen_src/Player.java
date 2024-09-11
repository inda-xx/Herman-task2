class Player {
    // Instance fields
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

    // Getters and setters
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 5, 5);

        // Print player's initial position
        System.out.println("Player: " + player1.getPlayerName());
        System.out.println("Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
        System.out.println("Score: " + player1.getScore());
    }
}
```

Enemy.java
```java
public 