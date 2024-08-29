class Player {
    // Fields
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;
    private boolean isAlive;

    // Constructor
    public Player(String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.score = 0;
        this.isAlive = true;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Movement Methods
    public void moveUp() {
        yPosition++;
        System.out.println("Moved up to position: (" + xPosition + ", " + yPosition + ")");
    }

    public void moveDown() {
        yPosition--;
        System.out.println("Moved down to position: (" + xPosition + ", " + yPosition + ")");
    }

    // Method to handle interaction with an enemy
    public void encounterEnemy(Enemy enemy) {
        System.out.println(name + " has encountered an enemy!");
        this.score += 10; // Gain points for encountering the enemy
        System.out.println(name + "'s new score: " + score);
    }

    // Main Method
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);

        // Print initial player state using getters
        System.out.println("Player Name: " + hero.getName());
        System.out.println("Position: (" + hero.getXPosition() + ", " + hero.getYPosition() + ")");
        System.out.println("Score: " + hero.getScore());
        System.out.println("Is Alive: " + hero.isAlive());

        // Test movement methods
        hero.moveUp();
        hero.moveDown();

        // Create an enemy and handle interaction
        Enemy enemy = new Enemy(5, 5);
        hero.encounterEnemy(enemy);
    }
}
```

Enemy.java
```java
public 