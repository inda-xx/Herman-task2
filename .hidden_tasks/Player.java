class Player extends GameObject {

    private int score;

    // Constructor to initialize fields
    public Player(String name, int x, int y) {
        super(name, x, y);
        this.score = 0;
    }

    // Getters and setters for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }

    // Print information about the player
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        player.move(5, 7);
        player.printInfo();
    }
}
```

File: `Enemy.java`

```java
public 