public class Game {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        player.printPlayerInfo();
        
        // Move player
        player.move(1, 2);
        
        // Simulate scoring
        player.increaseScore(10);
        
        // Interactions with enemies can be added here
        
        player.printPlayerInfo();
    }
}