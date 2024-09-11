class Player {
    private String name;
    private int health;
    private int x, y;

    public Player(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        System.out.println(name + " moved to: " + x + ", " + y);
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " attacks " + enemy.getName());
        enemy.setHealth(enemy.getHealth() - 10);
        System.out.println("Enemy " + enemy.getName() + " new health: " + enemy.getHealth());
    }
}
```

Enemy.java
```java
public 