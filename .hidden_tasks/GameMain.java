public class GameMain {
    public static void main(String[] args) {
        // Create player instance
        Player hero = new Player("Hero", 0, 100, 5, 5);
        
        // Create enemy instance
        Enemy monster = new Enemy("Orc", 50, 10, 10);

        // Display initial positions
        hero.printInfo();
        monster.printInfo();

        // Move player
        hero.move(2, 3);
        
        // Increase player score
        hero.increaseScore(10);

        // Print updated information
        hero.printInfo();
    }
}