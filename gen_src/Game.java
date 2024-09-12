class Game {
    private Player player;
    private ArrayList<Enemy> enemies;

    public Game(Player player, ArrayList<Enemy> enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    public void play() {
        // Simplified interaction loop
        player.move("right");
        for (Enemy enemy : enemies) {
            enemy.interact(player);
        }
        printStatus();
    }

    private void printStatus() {
        System.out.println("Player Score: " + player.getScore());
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy(1, 0));

        Game game = new Game(player, enemies);
        game.play();
    }
}



// Level.
package game;

public