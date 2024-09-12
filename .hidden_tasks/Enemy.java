class Enemy {
    private int id;
    private int xPosition;
    private int yPosition;

    // Constructor to initialize fields
    public Enemy(int id, int xPosition, int yPosition) {
        this.id = id;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    // Getter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    // Method to print enemy's information
    public void printEnemyInfo() {
        System.out.println("Enemy ID: " + id);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
}

