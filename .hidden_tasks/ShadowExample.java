class ShadowExample {
    private String attribute = "Global";

    public void shadowingDemo() {
        String attribute = "Local";
        System.out.println(attribute); // Access the local 'attribute'
        System.out.println(this.attribute); // Access the instance variable 'attribute'
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.shadowingDemo();
    }
}
```

These classes should be saved in individual files named `Player.java`, `Enemy.java`, and `ShadowExample.java`. Each file contains a `main` method to demonstrate the functionality of the classes. Adjust the file paths and package declarations as needed to fit the structure of your project.