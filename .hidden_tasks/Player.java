class Player {
    // Fields
    private String name;
    private int score;
    private int position;
    private int defense;

    // Constructor
    public Player(String name, int score, int position, int defense) {
        this.name = name;
        this.score = score;
        this.position = position;
        this.defense = defense;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Print player information
    public void printInfo() {
        System.out.println("Player Info:");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: " + position);
    }

    public static void main(String[] args) {
        Player hero = new Player("Aragorn", 0, 0, 5); // Adding defense for completeness
        hero.printInfo();
    }
}
```

Enemy.java:
```java
