class Main {
    public static void main(String[] args) {
        Player bee = new Player("Bee");
        Enemy wasp = new Enemy("Wasp", 8);

        // Initial positions
        System.out.println("Player: " + bee.getPlayerName() + " is at (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Enemy: " + wasp.getEnemyName() + " is at (" + wasp.getPositionX() + ", " + wasp.getPositionY() + ")");

        // Move the player
        bee.move(1, 1);
        System.out.println("Player moved to: (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Player score: " + bee.getScore());

        // Interact with enemy
        bee.interactWithEnemy(wasp);
        System.out.println("Player score after interaction: " + bee.getScore());
    }
}
```

This implementation includes the Player and Enemy classes with their respective fields, constructors, and methods. The Player's move method updates the player's position and increments the score, while interactWithEnemy checks for player interaction with an enemy and adjusts the score accordingly. The Main 