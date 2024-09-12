class GameElement {
    private String name;
    private int health;
    private int score;

    // Constructor
    public GameElement(String name, int health) {
        this.name = name;
        this.health = health;
        this.score = 0;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    // Printing details
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        GameElement hero = new GameElement("Hero", 100);
        hero.printInfo();
    }
}

// Player.java
public 