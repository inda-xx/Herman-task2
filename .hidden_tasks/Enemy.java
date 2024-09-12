class Enemy extends GameObject {

    // Constructor to initialize fields
    public Enemy(String name, int x, int y) {
        super(name, x, y);
    }

    // Method for interaction with the player
    public void interact(Player player) {
        System.out.println("Enemy " + this.getName() + " battles with " + player.getName());
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Villain", 10, 10);
        enemy.interact(player);
    }
}
```

File: `VariableShadowing.java`

```java
public 