class VariableShadowing {

    private int health = 100;

    // Method demonstrating variable shadowing
    public void displayHealth() {
        int health = 50; // This local variable shadows the instance field
        System.out.println("Health: " + health); // Prints the local variable's value
    }

    public static void main(String[] args) {
        VariableShadowing vs = new VariableShadowing();
        vs.displayHealth();
    }
}
```

These files create a simple structure for a game with classes for game objects, players, and enemies, demonstrating movement, scoring, interactions, and variable shadowing concepts. Each main method in the classes provides a basic test to demonstrate functionality.