class GameEnemy {

    private String type;
    private int power;
    private boolean defeated;

    public GameEnemy(String type, int power) {
        this.type = type;
        this.power = power;
        this.defeated = false;
    }

    // Method to interact with a player
    public void interact(GameCharacter player) {
        if (!defeated) {
            player.setHealth(player.getHealth() - this.power);
            System.out.println(player.getName() + " is attacked! Health: " + player.getHealth());
        }
    }

    public static void main(String[] args) {
        GameCharacter player = new GameCharacter("Hero", 100, 0, 0);
        GameEnemy enemy = new GameEnemy("Goblin", 10);

        enemy.interact(player);
    }
}
