class ShadowExample {
    private int number = 10; // I want this number printed
    
    public void printNumber() {
        int number = 20;
        System.out.println(this.number); // Use 'this' to access instance field
    }
    
    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.printNumber(); // This should print "10"
    }
}