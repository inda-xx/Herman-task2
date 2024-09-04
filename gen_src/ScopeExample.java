class ScopeExample {
    private int scopeValue = 10; // I want to use this one.

    public void printValue() {
        int scopeValue = 20;
        System.out.println(scopeValue); // Prints 20 because of local variable shadowing the field.
        System.out.println(this.scopeValue); // Use 'this' to refer to the class's field, prints 10.
    }

    public static void main(String[] args) {
        ScopeExample ex = new ScopeExample();
        ex.printValue(); // Demonstrates variable shadowing
    }
}