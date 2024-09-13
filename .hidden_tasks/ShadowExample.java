public class ShadowExample {
    private int score = 100; // Desired score to print

    public void printScore() {
        int score = 50; // Local variable
        System.out.println(this.score); // Correctly uses the instance field
    }

    public static void main(String[] args) {
        new ShadowExample().printScore();
    }
}