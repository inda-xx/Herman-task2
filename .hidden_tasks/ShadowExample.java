class ShadowExample {
    private int score = 10;

    public void displayScore() {
        int score = 50; // Local variable shadows instance field
        System.out.println(score); // Outputs the local score variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.displayScore(); // Outputs 50 due to variable shadowing
    }
}