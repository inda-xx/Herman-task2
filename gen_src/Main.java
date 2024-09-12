class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", 100, 0);
        Enemy enemy = new Enemy("Goblin", 50);

        player.move();
        player.attack(enemy);
        player.addScore(10);
        
        // Additional interaction
        player.attack(enemy);
        player.addScore(20);
    }
}
