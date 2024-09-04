class Enemy {

    private String name;
    private int positionX;
    private int positionY;

    // Constructor to initialize enemy attributes
    public Enemy(String name, int positionX, int positionY) {
        this.name = name;
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

    // Main method for testing
    public static void main(String[] args) {
        // Test creating an enemy
        Enemy villain = new Enemy("Villain", 8, 5);
        System.out.println("Enemy Name: " + villain.getName());
        System.out.println("Position: (" + villain.getPositionX() + ", " + villain.getPositionY() + ")");
    }
}
```

This solution covers 