class ShadowExample {
    private int number = 10; // I want this number printed

    public void printNumber() {
        int number = 20;
        System.out.println(this.number); // Use 'this' to access instance field
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printNumber(); // Expected output: 10
    }
}
```

Each `.java` file represents a distinct component of the game. The `GameWorld` manages the game state and interactions, the `Player` handles player actions and positions, and the `Enemy` represents potential adversaries in the game. The `ShadowExample` demonstrates handling of variable shadowing in Java. Save each code block in separate files named after their respective 