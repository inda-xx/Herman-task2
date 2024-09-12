public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Space Ace", 5);
        Enemy alien = new Enemy("Alien Invader", 5);

        player1.interactWithEnemy(alien);
        player1.printStatus();
        alien.printStatus();
    }
}