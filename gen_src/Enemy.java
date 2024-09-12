class Enemy {
    private String type;
    private int position;
    private int attackPower;

    public Enemy(String type, int position, int attackPower) {
        this.type = type;
        this.position = position;
        this.attackPower = attackPower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void interact(Player player) {
        System.out.println("Encountered " + type + "! Player's score is decreased by " + attackPower);
        player.setScore(player.getScore() - attackPower);
    }

    public void printStatus() {
        System.out.println("Enemy " + type + " at position " + position + " with attack power " + attackPower);
    }
}
```

Game.java
```java
public 