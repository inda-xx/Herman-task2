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

    // Getters
    public int getId() {
        return id;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    // Method to print enemy info
    public void printEnemyInfo() {
        System.out.println("Enemy ID: " + id);
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }
}
```

This solution fulfills all the exercises covered in the assignment:

- `Player` 