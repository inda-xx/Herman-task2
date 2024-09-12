class Game {
    public static void main(String[] args) {
        Player player = new Player("Alice", 0, 0, 0);
        Enemy enemy = new Enemy("Goblin", 5, 5);

        player.printInfo();
        player.move(1, 2);
        player.attack(enemy);
        player.increaseScore(10);
    }
}

// ShadowExample.java
public 