class Example {
    private int exampleField = 10;

    public void shadowExample() {
        int exampleField = 5; // This shadows the instance variable
        System.out.println("Shadowed value: " + exampleField);
        System.out.println("Actual instance field value: " + this.exampleField);
    }
}
