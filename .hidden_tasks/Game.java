public class Game {

    public static void main(String[] args) {
        Player hero = new Player("Archer", 0, 0, 0, true);
        Enemy goblin = new Enemy("Goblin", 5, 5, 10);

        System.out.println("Player Name: " + hero.getName());
        System.out.println("Is Alive: " + hero.isAlive());

        System.out.println("Enemy Type: " + goblin.getType());
        System.out.println("Enemy Damage: " + goblin.getDamage());

        hero.move(5, 5);
        hero.interactWithEnemy(goblin);

        hero.printInfo();
        goblin.printInfo();
    }
}