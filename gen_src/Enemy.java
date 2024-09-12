class Enemy {
    private String type;
    private int damage;

    public Enemy(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static void main(String[] args) {
        Enemy golem = new Enemy("Golem", 10);
        System.out.println("Enemy Type: " + golem.getType());
        System.out.println("Enemy Damage: " + golem.getDamage());
    }
}
