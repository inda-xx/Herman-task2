class Player {

    private String name;
    private int score;
    private int health;
    private int[] position; // position[0] for x, position[1] for y

    // Constructor
    public Player(String name, int score, int health, int[] position) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.position = position;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    // Method to move the player
    public void move(int deltaX, int deltaY) {
        this.position[0] += deltaX;
        this.position[1] += deltaY;
        System.out.println(name + " moved to position (" + position[0] + ", " + position[1] + ")");
    }

    // Method to collect points
    public void collectPoints(int points) {
        this.score += points;
        System.out.println(name + " collected " + points + " points! Total score: " + score);
    }

    // Method to interact with an enemy
    public void encounterEnemy(Enemy enemy) {
        this.health -= enemy.getStrength();
        if (this.health <= 0) {
            System.out.println(name + " was defeated by " + enemy.getName());
        } else {
            System.out.println(name + " encountered " + enemy.getName() + " and survived! Health: " + this.health);
        }
    }
}
```

`Enemy.java`
```java
public 