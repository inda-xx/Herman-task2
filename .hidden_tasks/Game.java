class Game {
    public static void main(String[] args) {
        Player hero = new Player("Adventurer", 0, 100, 0, 0);
        hero.printInfo();

        Enemy goblin = new Enemy("Goblin", 50, 2, 2);
        hero.interact(goblin);
    }
}