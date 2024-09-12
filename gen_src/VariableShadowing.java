class VariableShadowing {

    private int health = 100;

    public void displayHealth() {
        int health = 50; // This local variable shadows the instance field
        System.out.println("Health: " + health); // Prints the local variable's value
    }

    public void displayCorrectHealth() {
        System.out.println("Correct Health: " + this.health); // Using 'this' to access the instance field
    }

    public static void main(String[] args) {
        VariableShadowing vs = new VariableShadowing();
        vs.displayHealth();
        vs.displayCorrectHealth();
    }
}