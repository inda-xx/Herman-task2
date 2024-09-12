public class Enemy {
    private String name;
    private int x, y, damage;

    // Constructor
    public Enemy(String name, int x, int y, int damage) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.damage = damage;
    }

    // Enemy interaction method
    public void interact(Player player) {
        System.out.println(this.name + " attacks " + player.getName() + "!");
        player.setScore(player.getScore() - this.damage);
        System.out.println(player.getName() + "'s score is now: " + player.getScore());
    }

    public static void main(String[] args) {
        Player knight = new Player("Knight", 10, 5, 100);
        Enemy goblin = new Enemy("Goblin", 10, 5, 25);

        goblin.interact(knight);
        knight.displayInfo();
    }
}