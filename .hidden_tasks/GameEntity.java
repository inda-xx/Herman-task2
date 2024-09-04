class GameEntity {

    // Fields of the GameEntity class
    private String name;
    private int x;    // Representing the x-coordinate
    private int y;    // Representing the y-coordinate
    private int score;
    private boolean isAlive;

    // Constructor to initialize all fields
    public GameEntity(String name, int x, int y, int score, boolean isAlive) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.score = score;
        this.isAlive = isAlive;
    }

    // Getters and setters for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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

    // Method to print the status of the GameEntity
    public void printStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: (" + this.x + ", " + this.y + ")");
        System.out.println("Score: " + this.score);
        System.out.println("Is Alive: " + this.isAlive);
    }

    // Method to move the GameEntity to a new position
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Method to add points to the GameEntity's score
    public void addScore(int points) {
        this.score += points;
    }

    // Main method to demonstrate the functionality of the GameEntity class
    public static void main(String[] args) {
        // Creating a new GameEntity object
        GameEntity player = new GameEntity("Hero", 0, 0, 0, true);

        // Demonstrate methods on the GameEntity object
        player.printStatus();
        
        // Move the player and update the score
        player.move(5, 10);
        player.addScore(15);
        
        // Print the updated status
        player.printStatus();
    }
}