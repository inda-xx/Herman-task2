class ShadowExample {
    private int score = 10; // Instance field

    // Method where variable shadowing occurs
    public void displayScore() {
        int score = 50; // Local variable that shadows the instance field
        System.out.println(score); // Outputs the local `score` variable
    }

    // Main method to demonstrate variable shadowing
    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.displayScore(); // Calls displayScore method
    }
}
