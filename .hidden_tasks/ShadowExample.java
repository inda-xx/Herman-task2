class ShadowExample {
    private int value = 42; // Desired value to print

    public void printValue() {
        int value = 100;
        System.out.println(this.value); // Use 'this' to access the instance variable
    }

    public static void main(String[] args) {
        new ShadowExample().printValue();
    }
}

// Creature.java
public 