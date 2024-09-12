class Player {

    private String name;
    private int health;
    private int strength;
    private int x;
    private int y;

    public Player(String name, int health, int strength, int x, int y) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.x = x;
        this.y = y;
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

    public int getStrength() {
        return strength;
    }

    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                y += 1;
                break;
            case "south":
                y -= 1;
                break;
            case "east":
                x += 1;
                break;
            case "west":
                x -= 1;
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }
        System.out.println("Moved " + direction + ". New position: [" + x + ", " + y + "]");
    }

    public void attack(Enemy enemy) {
        if (this.strength > enemy.getStrength()) {
            enemy.setHealth(enemy.getHealth() - 10);
            System.out.println("You attacked " + enemy.getName() + " successfully!");
        } else {
            System.out.println("Attack failed!");
        }
    }

    // Shadowing example
    public void shadowExample() {
        int health = 5; // This shadows the instance variable 'health'
        System.out.println("Shadowed value: " + health);
        System.out.println("Actual value: " + this.health);
    }
}
```

Enemy.java
```java
public 