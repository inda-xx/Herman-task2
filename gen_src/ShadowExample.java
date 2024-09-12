class ShadowExample {
    private int positionX = 5;

    public void changePosition() {
        int positionX = 10;
        System.out.println(positionX); // Prints the local positionX, which is 10
        System.out.println(this.positionX); // Resolves shadowing, prints the instance positionX, which is 5
    }

    public static void main(String[] args) {
        new ShadowExample().changePosition();
    }
}
