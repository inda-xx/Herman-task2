class Game {

    private Player player;
    private Enemy enemy;
    private int score;

    // Constructor
    public Game() {
        this.player = new Player("Hero", 100, 20, 0, 0);
        this.enemy = new Enemy("Villain", 50, 10);
        this.score = 0;
        System.out.println("Welcome to Adventure Quest!");
    }

    // Method to start the game
    public void startGame() {
        // Example game loop (simplified for the task)
        player.move("north");
        player.attack(enemy);
        if (enemy.getHealth() <= 0) {
            score += 10;
            System.out.println("Enemy defeated! Score: " + score);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
```

Player.java
```java
public 