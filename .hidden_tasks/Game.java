class Game {

    public static void main(String[] args) {
        // Instantiate a Player and an Enemy
        Player player1 = new Player("Hero");
        Enemy enemy1 = new Enemy("Goblin", 100, 3, 3);

        // Demonstrate player movements and interactions with the enemy
        player1.move(2, 3);
        enemy1.encounter(player1);

        player1.increaseScore(20);
        player1.move(3, 3);
        enemy1.encounter(player1);
    }
}

// ShadowingExample.java
public 