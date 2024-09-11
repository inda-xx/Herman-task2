class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0, 0);
        Enemy enemy = new Enemy("Orc", 2, 2);

        // Simple game loop
        for (int i = 0; i < 5; i++) {
            player.moveRandomly();
            if (player.getPositionX() == enemy.getPositionX() && player.getPositionY() == enemy.getPositionY()) {
                player.collideWithEnemy(enemy);
            }
            player.printInfo();
        }
    }
}
```

Shadow1.java
```java
public 