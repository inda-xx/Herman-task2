class ScopeExample {
    private int value = 10; // Instance field

    public void demonstrateScope() {
        int value = 20; // Local variable
        System.out.println("Local Value: " + value);
        System.out.println("Instance Value: " + this.value);
    }

    public static void main(String[] args) {
        new ScopeExample().demonstrateScope();
    }
}



// GameApplication.
public