public class ShadowExample {
    private int level = 1; // The level we want

    public void shadowMethod() {
        int level = 5;
        System.out.println("Level: " + level); // Prints incorrect level
    }

    public static void main(String[] args) {
        new ShadowExample().shadowMethod(); // Fix needed
    }
}