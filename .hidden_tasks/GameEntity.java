class GameEntity {
    // Declare private fields for encapsulation
    private String name;
    private int x;
    private int y;
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

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and setter for y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Getter and setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for isAlive
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to print the current status
    public void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Score: " + score);
        System.out.println("Is Alive: " + isAlive);
    }

    // Method to move the GameEntity to a new position
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Method to add points to the current score
    public void addScore(int points) {
        this.score += points;
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        // Create a new GameEntity using the constructor
        GameEntity player = new GameEntity("Hero", 0, 0, 0, true);

        // Print initial status
        player.printStatus();

        // Move the player and add score
        player.move(5, 10);
        player.addScore(15);

        // Print the updated status
        player.printStatus();
    }
}