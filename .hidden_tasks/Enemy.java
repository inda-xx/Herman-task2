class Enemy {
    private String type;
    private int health;
    private Position position;

    public Enemy(String type, int health, Position position) {
        this.type = type;
        this.health = health;
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public Position getPosition() {
        return position;
    }

    public void attack(Player player) {
        int damage = 10;
        player.setHealth(player.getHealth() - damage);
        System.out.println(player.getName() + " was attacked by a " + type + " and now has " + player.getHealth() + " health.");
    }

    @Override
    public String toString() {
        return "Enemy: " + type + " at " + position;
    }
}
```

GameWorld.java
```java
import java.util.Arrays;

public 