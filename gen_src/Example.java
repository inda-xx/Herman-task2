class Example {
    private int number = 10;

    public void printNumber() {
        int number = 5;
        System.out.println(number); // Prints the local variable 5, not the field number 10
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.printNumber(); // Correctly prints the local variable, not the field
    }
}
```

In the `Example` class, note that variable shadowing occurs when a local variable named `number` is defined in the `printNumber` method, which shadows the instance variable of the same name. To print the instance variable instead, you could use `System.out.println(this.number);`.

These classes implement the basic structure for a simple adventure game in Java, where a player can move, interact with an enemy, and print their status.