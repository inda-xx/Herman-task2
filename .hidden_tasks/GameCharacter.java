class GameCharacter {

    // Private instance fields
    private String name;
    private int health;
    private int score;
    private boolean hasKey;

    // Constructor to initialize all attributes
    public GameCharacter(String name, int health, int score, boolean hasKey) {
        this.name = name;
        this.health = health;
        this.score = score;
        this.hasKey = hasKey;
    }

    // Getter and Setter methods for encapsulation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isHasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }

    // Method to print GameCharacter information
    public void printInfo() {
        System.out.println("> Character Info:");
        System.out.println("> Name: " + this.getName());
        System.out.println("> Health: " + this.getHealth());
        System.out.println("> Score: " + this.getScore());
        System.out.println("> Has Key: " + this.isHasKey());
    }

    // Method to handle encounter with an enemy
    public void encounterEnemy(GameCharacter enemy) {
        int damage = 20;
        this.health -= damage;
        System.out.println(this.name + " encountered " + enemy.getName() + " and took " + damage + " damage!");
        System.out.println(this.name + "'s health is now " + this.getHealth());
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Creating game characters
        GameCharacter player = new GameCharacter("Hero", 100, 0, false);
        GameCharacter enemy = new GameCharacter("Goblin", 30, 0, false);

        // Displaying initial player info
        player.printInfo();

        // Simulating an encounter with an enemy
        player.encounterEnemy(enemy);

        // Printing the updated player info after the encounter
        player.printInfo();
    }
}
```