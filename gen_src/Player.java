class Player {
    private String name;
    private int score;
    private int position;

    public Player(String name, int startPosition) {
        this.name = name;
        this.score = 0;
        this.position = startPosition;
    }

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

    public void move(int steps) {
        this.position += steps;
    }

    public void increaseScore(int points) {
        this.score += points;
    }

    public void printStatus() {
        System.out.println("Player " + name + " at position " + position + " has score " + score);
    }
}
```

Enemy.java
```java
public 