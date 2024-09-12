class ShadowExample {
    private String name = "Player";

    public void printShadow() {
        String name = "Local Player";
        System.out.println(name); // Displays the local variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printShadow();
    }
}