class Example1 {
    private int value = 10;

    public void demonstrateShadowing() {
        int value = 20; // Local variable 'value' shadows the instance variable
        System.out.println(value); // Prints local variable, i.e., 20
    }

    public void printInstanceValue() {
        System.out.println(this.value); // Using 'this' to print the instance variable
    }

    public static void main(String[] args) {
        new Example1().demonstrateShadowing();
        new Example1().printInstanceValue();
    }
}
```

These Java classes fulfill the requirements of the task description. The `Player` 