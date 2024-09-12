class Player {
    
    // Fields
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
    
    // Getters
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Print player information
    public void printInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }
    
    // Movement methods
    public void moveUp() {
        this.positionY += 1;
        printCurrentPosition();
    }
    
    public void moveDown() {
        this.positionY -= 1;
        printCurrentPosition();
    }

    public void moveLeft() {
        this.positionX -= 1;
        printCurrentPosition();
    }

    public void moveRight() {
        this.positionX += 1;
        printCurrentPosition();
    }

    private void printCurrentPosition() {
        System.out.println("Moved to position: (" + positionX + ", " + positionY + ")");
    }
    
    // Interact with Enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            if (enemy.isAlive()) {
                enemy.setAlive(false);
                System.out.println("Player " + name + " attacked and defeated the " + enemy.getType() + "!");
            } else {
                System.out.println("Enemy is already defeated.");
            }
        } else {
            System.out.println("No enemy to interact with at this position.");
        }
    }
}



// File: Enemy.
public