class Game {
    private Player player;
    private Enemy enemy;

    public Game(String playerName, int startX, int startY) {
        this.player = new Player(playerName, startX, startY);
        // Initialize the enemy at a random position, for example purposes
        this.enemy = new Enemy(5, 5); 
    }

    public void moveLeft() {
        player.setXPosition(player.getXPosition() - 1);
        checkEnemyCollision();
    }

    public void moveRight() {
        player.setXPosition(player.getXPosition() + 1);
        checkEnemyCollision();
    }

    public void moveUp() {
        player.setYPosition(player.getYPosition() - 1);
        checkEnemyCollision();
    }

    public void moveDown() {
        player.setYPosition(player.getYPosition() + 1);
        checkEnemyCollision();
    }

    private void checkEnemyCollision() {
        if (enemy.isCollidedWithPlayer(player)) {
            System.out.println("Enemy encountered! Score reduced.");
            player.setScore(player.getScore() - 10); // Lose 10 points for encountering an enemy
        }
    }

    public void printPlayerStatus() {
        System.out.println("Player: " + player.getName());
        System.out.println("Score: " + player.getScore());
        System.out.println("Position: (" + player.getXPosition() + ", " + player.getYPosition() + ")");
    }

    public static void main(String[] args) {
        Game game = new Game("Explorer", 0, 0);
        game.printPlayerStatus();
        game.moveRight();
        game.moveUp();
        game.printPlayerStatus();
    }
}