class Player {
    // Player fields
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
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

    // Method to print player info
    public void printInfo() {
        System.out.println("Player Info:");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    public static void main(String[] args) {
        Player player = new Player("Explorer", 0, 0, 0);
        player.printInfo();
        player.setPositionX(5);
        player.setPositionY(3);
        System.out.println("Player position updated to (" + player.getPositionX() + ", " + player.getPositionY() + ")");
    }
}
```

Enemy.java:
```java
public 