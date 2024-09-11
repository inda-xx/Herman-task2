class Main {
    public static void main(String[] args) {
        // Create a player named Bee
        Player bee = new Player("Bee");
        
        // Display initial position and score
        System.out.println("Player: " + bee.getPlayerName() + " is at (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Initial Player Score: " + bee.getScore());
        
        // Create an enemy named Wasp with strength 8
        Enemy wasp = new Enemy("Wasp", 8);
        
        // Move the player and display new position and score
        bee.move(1, 0); // Move right
        bee.move(0, 1); // Move up
        System.out.println("Player moved to: (" + bee.getPositionX() + ", " + bee.getPositionY() + ")");
        System.out.println("Player score: " + bee.getScore());
        
        // Interact with the enemy and display score
        bee.interactWithEnemy(wasp);
        System.out.println("Player score after interaction: " + bee.getScore());
    }
}