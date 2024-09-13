import java.util.Set;

class Player {
    // Fields
    private String name;
    private int position;
    private int score;

    // Constructor
    public Player(String name, int position, int score) {
        this.name = name;
        this.position = position;
        this.score = score;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Method to move the player
    public void move(int steps) {
        this.position += steps;
    }

    // Method to increase the player's score
    public void increaseScore(int points) {
        this.score += points;
    }

    // Method to interact with an enemy
    public void interactWithEnemy(Enemy enemy) {
        if (this.getPosition() == enemy.getPosition()) {
            System.out.println(this.getName() + " encountered " + enemy.getType());
            this.increaseScore(-enemy.getDamage());
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Player hero = new Player("Hero", 5, 100);
        Enemy goblin = new Enemy("Goblin", 5, 20);

        hero.interactWithEnemy(goblin);
        System.out.println("Score after encounter: " + hero.getScore());
    }
}