class Player {
    // Private fields to encapsulate the player's attributes
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize the player's attributes
    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Getter for positionX
    public int getPositionX() {
        return positionX;
    }

    // Setter for positionX
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter for positionY
    public int getPositionY() {
        return positionY;
    }

    // Setter for positionY
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to print player's information
    public void printInfo() {
        System.out.println("Player Name: " + getName());
        System.out.println("Score: " + getScore());
        System.out.println("Position: (" + getPositionX() + ", " + getPositionY() + ")");
    }

    // Method to interact with an enemy
    public void interact(Enemy enemy) {
        System.out.println("Player " + getName() + " encounters " + enemy.getName() + "!");
        // Additional interaction logic can be added here
    }

    public static void main(String[] args) {
        // Initialize Player with the constructor
        Player hero = new Player("Hero", 10, 5, 5);
        hero.printInfo();

        // Create an enemy and interact with it
        Enemy villain = new Enemy("Villain", 8, 5);
        hero.interact(villain);
    }
}
```

Enemy.java
```java
public 