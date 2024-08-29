class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    // Constructor
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Initial score is zero
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getScore() {
        return score;
    }

    // Setters
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method to move up
    public void moveUp() {
        this.positionY += 1;
        printPosition();
    }

    // Method to move down
    public void moveDown() {
        this.positionY -= 1;
        printPosition();
    }

    // Method to move left
    public void moveLeft() {
        this.positionX -= 1;
        printPosition();
    }

    // Method to move right
    public void moveRight() {
        this.positionX += 1;
        printPosition();
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            this.score -= 10;
            System.out.println("Player " + name + " encountered an enemy " + enemy.getType() + "! Score reduced by 10.");
        }
    }

    // Method to print player's position
    private void printPosition() {
        System.out.println("Player " + name + " is now at (" + positionX + ", " + positionY + ")");
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player: " + name + " at (" + positionX + ", " + positionY + ") Score: " + score);
    }
}
```

Enemy.java
```java
public 