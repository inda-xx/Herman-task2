class Player {
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    public Player(String name, int positionX, int positionY, int score) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = score;
    }

    public String getName() {
        return name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void collideWithEnemy(Enemy enemy) {
        this.score -= 5; // Decrease score by a fixed value
        System.out.println("Collided with enemy " + enemy.getName() + "! Score decreased.");
    }

    public void printInfo() {
        System.out.println("Player " + name + " is at position (" + positionX + ", " + positionY + ") with score: " + score);
    }

    public void moveRandomly() {
        // Simulate random movement within a 5x5 grid
        this.positionX = (int)(Math.random() * 5);
        this.positionY = (int)(Math.random() * 5);
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 0);
        player.setPositionX(1);
        player.setPositionY(1);
        player.setScore(10);
        player.printInfo();
    }
}
```

Enemy.java
```java
public 