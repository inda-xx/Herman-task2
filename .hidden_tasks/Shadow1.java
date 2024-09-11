class Shadow1 {
    private int number = 10; // Intended to print

    public void printShadow() {
        System.out.println(this.number); // Prints the instance variable
    }

    public static void main(String[] args) {
        new Shadow1().printShadow();
    }
}
```

Creature.java
```java
public 