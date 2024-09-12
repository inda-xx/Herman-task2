public class ShadowExample {
    private int level = 1; // We want this level

    public void showLevel() {
        int level = 5;
        System.out.println(level); // This prints local level which is 5
    }

    public static void main(String[] args) {
        new ShadowExample().showLevel(); // Demonstrates scope and shadowing
    }
}