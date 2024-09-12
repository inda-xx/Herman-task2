class Enemy extends GameElement {
    public Enemy(String name, int health) {
        super(name, health);
    }

    public void attack(Player player) {
        int damage = 10; // Fixed damage for simplicity
        player.setHealth(player.getHealth() - damage);
        System.out.println(getName() + " attacked " + player.getName() + " for " + damage + " damage!");
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 100);
        Enemy goblin = new Enemy("Goblin", 50);
        goblin.attack(hero);
        hero.printInfo();
    }
}

// ShadowExample.java
public 