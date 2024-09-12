class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize fields
    public Player(String name, int score, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getters and setters
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

    // Method to increment the score
    public void incrementScore(int points) {
        this.score += points;
    }

    // Method to print player info
    public void printPlayerInfo() {
        System.out.println("Player: " + name + ", Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public static void main(String[] args) {
        // Create a player instance
        Player player1 = new Player("Hero", 0, 5, 5);
        player1.printPlayerInfo();

        // Simulate collecting a coin
        player1.incrementScore(10);
        System.out.println("After collecting a coin:");
        player1.printPlayerInfo();

        // Create an enemy instance
        Enemy enemy1 = new Enemy(1, 5, 5);
        enemy1.printEnemyInfo();

        // Check for collision
        if (player1.getXPosition() == enemy1.getXPosition() && player1.getYPosition() == enemy1.getYPosition()) {
            System.out.println("Player " + player1.getName() + " caught by enemy!");
            player1.setScore(0); // Reset score upon collision
            player1.printPlayerInfo();
        }
    }
}
```

Enemy.java
```java
public 