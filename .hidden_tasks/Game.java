class Game {
    public static void main(String[] args) {
        // Instantiate Player
        Player player1 = new Player("Hero", 0, 0);
        
        // Instantiate Enemies
        Enemy goblin = new Enemy("Goblin", 5, 5);
        Enemy dragon = new Enemy("Dragon", 10, 10);
        
        // Demonstration of movement and interaction
        player1.move(4, 4);
        player1.increaseScore(10);
        player1.interactWithEnemy(goblin);
        
        // Additional movement and interaction
        player1.move(2, 1);
        player1.interactWithEnemy(dragon);
    }
}