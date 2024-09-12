public class ShadowExample {
    private int number = 42;

    public void printShadow() {
        int number = 5;
        System.out.println(number); // Prints 5, the local variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printShadow();
    }
}