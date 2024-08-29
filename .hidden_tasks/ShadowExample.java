class ShadowExample {

    private int number = 1; // I want this number printed :(

    public void shadowTest() {
        int number = 5;
        System.out.println(this.number); // Using "this" to access instance variable
    }

    public static void main(String[] args) {
        new ShadowExample().shadowTest();
    }
}