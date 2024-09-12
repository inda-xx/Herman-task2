class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero", 0);
        Enemy goblin = new Enemy("Goblin", 5, 10);
        
        // Moving the player
        player.move(5);
        player.printStatus();
        
        // Encountering the enemy
        if (player.getPosition() == goblin.getPosition()) {
            goblin.interact(player);
        }
        
        player.printStatus();
        goblin.printStatus();
    }
}
```

Example.java
```java
public 