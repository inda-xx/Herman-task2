class Enemy extends GameObject {
    
    public Enemy(String name, int x, int y) {
        super(name, x, y);
    }

    public void interact(Player player) {
        System.out.println("Enemy " + this.getName() + " battles with " + player.getName());
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy enemy = new Enemy("Villain", 10, 10);
        enemy.interact(player);
    }
}

// VariableShadowing.java
public 