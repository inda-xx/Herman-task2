class ShadowExample {
    private String name = "Player";

    public void printShadow() {
        String name = "Local Player";
        System.out.println(name); // Displays the local variable
        
        // Using 'this' to access the instance variable
        System.out.println(this.name); // Displays the instance variable
    }
}
```

The provided code includes all functionalities described in the task description such as player movement, scoring, and enemy interaction. It also demonstrates variable shadowing and how it can be addressed using `this` in the `ShadowExample` class. Each 