class ShadowExample {
    private int score = 100;

    public void displayScore() {
        int score = 50; // Local variable shadows the instance field
        System.out.println("Local score is: " + score);
        System.out.println("Instance score is: " + this.score);
    }

    public static void main(String[] args) {
        new ShadowExample().displayScore();
    }
}