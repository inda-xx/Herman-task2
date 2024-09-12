class ShadowExample {

    private int number = 10;

    public void demonstrateShadowing() {
        int number = 20;
        System.out.println("Local number: " + number); // prints the local variable
        System.out.println("Instance number: " + this.number); // prints the instance variable
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.demonstrateShadowing();
    }
}
```

These classes together create a simple text-based adventure game with a player and enemy that interact on a basic level. The game design leverages fundamental programming concepts such as classes, constructors, encapsulation, and method usage.