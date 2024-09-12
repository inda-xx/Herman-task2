class Creature {
    private String identity;

    public Creature(String identity) {
        this.identity = identity; // Properly assign the parameter to the instance variable
    }

    public static void main(String[] args) {
        Creature goblin = new Creature("Goblin");
        System.out.println(goblin.identity);  // Should print "Goblin"
    }
}