class Level {
    private int levelNumber = 1;

    public void printLevel(int levelNumber) {
        System.out.println("Current Level: " + this.levelNumber);
    }

    public static void main(String[] args) {
        Level level = new Level();
        level.printLevel(2);
    }
}
