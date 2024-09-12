class GameCharacter {

    // Private fields for encapsulation
    private String name;
    private int xPosition;
    private int yPosition;
    private int score;
    private boolean isAlive;

    // Constructor to initialize the GameCharacter
    public GameCharacter(String name, int xPosition, int yPosition, int score, boolean isAlive) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.score = score;
        this.isAlive = isAlive;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    // Getter and Setter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getter and Setter for isAlive
    public boolean isAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Method to print character information
    public void printInfo() {
        System.out.println("> INFO");
        System.out.println("> Character: " + name);
        System.out.println("> Position: (" + xPosition + ", " + yPosition + ")");
        System.out.println("> Score: " + score);
        System.out.println("> Is Alive: " + isAlive);
    }

    // Method to move the character
    public void move(int deltaX, int deltaY) {
        this.xPosition += deltaX;
        this.yPosition += deltaY;
    }

    // Method to simulate an enemy encounter
    public void encounterEnemy() {
        System.out.println("> " + name + " encountered an enemy!");
        this.score += 10;
        this.isAlive = false; // For the purpose of this example, the character dies on enemy encounter.
        System.out.println("> Score: " + score);
        System.out.println("> Is Alive: " + isAlive);
    }

    // Main method for execution examples
    public static void main(String[] args) {
        // Create a new "GameCharacter" object using constructor
        GameCharacter player = new GameCharacter("Player1", 0, 0, 0, true);

        // Print initial setup
        player.printInfo();

        // Move the character and print new position
        player.move(5, 10);
        System.out.println("After moving:");
        player.printInfo();

        // Simulate encountering an enemy
        player.encounterEnemy();

        // Final state after the encounter
        player.printInfo();
    }
}
