class Enemy {

    // Private fields for enemy attributes
    private String type;
    private int xPosition;
    private int yPosition;
    private boolean isAlive;

    // Constructor to initialize enemy attributes
    public Enemy(String type, int xPosition, int yPosition) {
        this.type = type;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isAlive = true;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    // Main method for testing
    public static void main(String[] args) {
        Enemy orc = new Enemy("Orc", 2, 2);

        // Printing enemy details for verification
        System.out.println("Enemy Type: " + orc.getType());
        System.out.println("Position: (" + orc.getxPosition() + ", " + orc.getyPosition() + ")");
        System.out.println("Is alive: " + orc.isAlive());
    }
}
```

These two classes encapsulate the functionality as specified: a `Player` 