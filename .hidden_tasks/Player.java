class Player {
    private String name;
    private int health;
    private int score;
    private Position position;

    public Player(String name, int health, Position position) {
        this.name = name;
        this.health = health;
        this.position = position;
        this.score = 0; // Initial score
    }

    public String getName() {
        return name;
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

    public Position getPosition() {
        return position;
    }

    public void moveUp() {
        position.setY(position.getY() + 1);
    }

    public void moveDown() {
        position.setY(position.getY() - 1);
    }

    public void moveLeft() {
        position.setX(position.getX() - 1);
    }

    public void moveRight() {
        position.setX(position.getX() + 1);
    }

    @Override
    public String toString() {
        return "Player: " + name + " at " + position + " with health " + health + " and score " + score;
    }
}
```

Enemy.java
```java
public 