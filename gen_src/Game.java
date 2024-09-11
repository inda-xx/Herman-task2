class Game {

    public static void main(String[] args) {
        // Create a player and an enemy
        Player player1 = new Player("Hero");
        Enemy enemy1 = new Enemy("Goblin", 100, 3, 3);

        // Demonstrating player's movement and the interaction with the enemy
        player1.move(2, 3);
        enemy1.encounter(player1);

        player1.increaseScore(20);
        player1.move(3, 3);
        enemy1.encounter(player1);
    }
}


// ShadowingExample.java
public 