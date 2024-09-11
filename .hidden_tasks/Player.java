class Player {

    // Private fields to store player information
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;
    private boolean isAlive;

    // Constructor to initialize player attributes
    public Player(String name, int initialScore, int startXPosition, int startYPosition) {
        this.name = name;
        this.score = initialScore;
        this.xPosition = startXPosition;
        this.yPosition = startYPosition;
        this.isAlive = true;
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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player Info");
        System.out.println("Name: " + this.getName());
        System.out.println("Score: " + this.getScore());
        System.out.println("Position: (" + this.getxPosition() + ", " + this.getyPosition() + ")");
        System.out.println("Is alive: " + this.isAlive());
    }

    // Method for player interaction with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            System.out.println(this.getName() + " interacts with enemy of type " + enemy.getType() + "!");
            // Example interaction logic: Increase score
            this.setScore(this.getScore() + 10);
            System.out.println("New score: " + this.getScore());
            enemy.setAlive(false); // Example logic to 'defeat' the enemy
        }
    }

    public static void main(String[] args) {
        // Creating a player instance with initial values
        Player hero = new Player("Hero", 0, 5, 5);

        // Printing out player information
        hero.printInfo();
    }
}
```

**Enemy.java**
```java
public 