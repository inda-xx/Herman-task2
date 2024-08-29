class Game {
    public static void main(String[] args) {
        // Instantiate a Player object
        Player hero = new Player("Adventurer", 0, 0);
        hero.printInfo(); // Print initial player info

        // Move the player around
        hero.moveRight();
        hero.moveUp();
        
        // Instantiate an Enemy object
        Enemy goblin = new Enemy("Goblin", 1, 1);
        goblin.printInfo(); // Print enemy info

        // Interact with the enemy (if at the same position)
        hero.interactWithEnemy(goblin);
        
        // Interact with the enemy again at a different position
        hero.moveUp();
        hero.interactWithEnemy(new Enemy("Orc", 0, 1));

        // Demonstrating points scoring logic (not encountering an enemy)
        
        // Player reaches a 'treasure' position
        if (hero.getPositionX() == 2 && hero.getPositionY() == 2) {
            hero.setScore(hero.getScore() + 20);
            System.out.println("Player " + hero.getName() + " collected a treasure at (2, 2)! Score increased by 20.");
        }
    }
}
```

This code defines a simple game setup with a `Player` 