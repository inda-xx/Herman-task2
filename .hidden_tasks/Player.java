class Player {
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize the fields
    public Player(String name, int score, int xPosition, int yPosition) {
        this.name = name;
        this.score = score;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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

    // Method to increment score
    public void incrementScore(int points) {
        this.score += points;
    }

    // Method to print player's information
    public void printPlayerInfo() {
        System.out.println("Player: " + name + ", Score: " + score);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 5, 5);
        player1.printPlayerInfo();

        // Example of scoring
        player1.incrementScore(10);
        player1.printPlayerInfo();
    }
}

