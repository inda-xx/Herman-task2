class Enemy {
    // Fields
    private int hitPoints;
    private int attackPower;

    // Constructor
    public Enemy(int hitPoints, int attackPower) {
        this.hitPoints = hitPoints;
        this.attackPower = attackPower;
    }

    // Getters and Setters
    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Enemy attacks a player
    public void attack(Player player) {
        int damage = this.attackPower - player.getDefense();
        System.out.println("Enemy attacks " + player.getName() + " with damage: " + damage);
    }

    public static void main(String[] args) {
        Player hero = new Player("Aragorn", 0, 0, 5); // Adding defense for completeness
        Enemy goblin = new Enemy(30, 7);
        goblin.attack(hero);
    }
}
```

ShadowExample.java:
```java
public 