class Player {
    // Instance fields
    private String name;
    private int score;
    private int xPosition;
    private int yPosition;
    
    // Constructor
    public Player(String name, int startX, int startY) {
        this.name = name;
        this.xPosition = startX;
        this.yPosition = startY;
        this.score = 0;
    }
    
    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getXPosition() {
        return this.xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return this.yPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    // Player movement methods
    public void moveUp() {
        this.yPosition += 1;
    }

    public void moveDown() {
        this.yPosition -= 1;
    }

    public void moveLeft() {
        this.xPosition -= 1;
    }

    public void moveRight() {
        this.xPosition += 1;
    }

    // Enemy interaction method
    public void interactWithEnemy() {
        System.out.println(name + " encountered an enemy!");
        this.score -= 10;
    }

    // Main method
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        
        player.moveUp();
        player.moveRight();
        
        System.out.println("Player Position: (" + player.getXPosition() + ", " + player.getYPosition() + ")");
        player.interactWithEnemy();
        System.out.println("Score: " + player.getScore());
    }
}