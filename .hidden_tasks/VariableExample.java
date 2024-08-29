class VariableExample {
    
    private int num = 10; // This is the instance variable

    public void show() {
        // Use 'this' keyword to refer to the instance variable
        System.out.println(this.num); // Now it will print the instance variable
    }

    public static void main(String[] args) {
        VariableExample example = new VariableExample();
        example.show(); // This will print 10, the instance variable value
    }
}