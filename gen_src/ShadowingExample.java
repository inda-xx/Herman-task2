class ShadowingExample {

    private int value = 0; 

    public void printValue() {
        System.out.println(this.value); // Use this. to refer to the instance variable instead of the local variable
    }

    public static void main(String[] args){
        new ShadowingExample().printValue();
    }
}