class ShadowExample {
    private int value = 10; // Instance field

    // Method demonstrating variable shadowing
    public void demonstrateShadow(int value) {
        System.out.println("Local variable value: " + value);
        System.out.println("Instance field value: " + this.value); // Access instance field using 'this'
    }

    // Main method for testing
    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.demonstrateShadow(5); // Pass a local variable to shadow the instance field
    }
}