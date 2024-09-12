class Game {

    public static void main(String[] args) {
        // Create a new player and enemy
        Player player = new Player("Hero", 0, 100, new int[]{0, 0});
        Enemy enemy = new Enemy("Goblin", 50, new int[]{1, 1});

        // Exercise the classes and methods
        player.setScore(10);
        enemy.setStrength(5);

        System.out.println("Player: " + player.getName() + ", Score: " + player.getScore());
        System.out.println("Enemy: " + enemy.getName() + ", Strength: " + enemy.getStrength());

        // Move the player
        player.move(1, 1);
        // Collect points
        player.collectPoints(5);
        // Encounter enemy
        player.encounterEnemy(enemy);
    }
}
```

`ShadowExample.java`
```java
