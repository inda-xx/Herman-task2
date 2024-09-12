class Enemy {
    private String enemyName;
    private int damage;

    public Enemy(String enemyName, int damage) {
        this.enemyName = enemyName;
        this.damage = damage;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
```

Game.java:
```java
import java.util.Scanner;

public 