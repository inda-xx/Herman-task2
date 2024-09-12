public class SimpleExample {
    private int number = 42; // I want this number printed :(

    public void showNumber() {
        int number = 7;
        System.out.println(this.number); // Prints the correct number using the `this` keyword.
    }

    public static void main(String[] args) {
        new SimpleExample().showNumber();
    }
}