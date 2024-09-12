public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        Enemy enemy1 = new Enemy(5, 5);
        
        player1.move(5, 5);
        enemy1.interact(player1);
    }
}