class ShadowGame {
    private int level = 0; // I want this level printed :(

    public void printLevel() {
        int level = 5;
        System.out.println(this.level); // Now it prints the correct instance level
    }

    public static void main(String[] args) {
        new ShadowGame().printLevel();
    }
}