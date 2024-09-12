class Player {
    // Fields
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    private boolean isActive;

    // Constructor
    public Player(String name, int score, int positionX, int positionY, boolean isActive) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isActive = isActive;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println(name + " moved to position: (" + positionX + ", " + positionY + ")");
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + " scored " + points + " points. Total score: " + score);
    }

    // Method to interact with an enemy
    public void interact(Enemy enemy) {
        System.out.println(name + " encountered an enemy of type: " + enemy.getType() + " at position: (" + enemy.getPositionX() + ", " + enemy.getPositionY() + ")");
        this.score -= enemy.getDamageValue();
        System.out.println("After interaction, " + name + "'s score is: " + score);
    }

    // Main method for testing
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 10, 10, true);
        
        System.out.println("Player Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Position: (" + player1.getPositionX() + ", " + player1.getPositionY() + ")");
        System.out.println("Is Active: " + player1.isActive());
        
        player1.move(5, -3);
        player1.increaseScore(20);

        Enemy enemy1 = new Enemy("Orc", 15, 7, 5);
        player1.interact(enemy1);
    }
}
```

Enemy.java
```java
public 