class ShadowExample {
    private int value = 10;

    public void demonstrateShadow(int value) {
        System.out.println("Local variable value: " + value);
        System.out.println("Instance field value: " + this.value);
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.demonstrateShadow(5);
    }
}
