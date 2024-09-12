class ShadowExample {
    private int position = 1; 

    public void updatePosition() {
        int position = 5; 
        System.out.println("Position: " + position); // Unexpected output 
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.updatePosition(); // Outputs "Position: 5" due to variable shadowing.
    }
}