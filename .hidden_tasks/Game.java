class Game {
    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 10, 10, 100);

        hero.move(5, 5);
        goblin.interact(hero);

        System.out.println(hero.getName() + " is at position (" + hero.getPositionX() + ", " + hero.getPositionY() + ") with score " + hero.getScore());
        System.out.println(goblin.getName() + " has " + goblin.getHealth() + " health left.");
    }
}

// ShadowExample.java
public 