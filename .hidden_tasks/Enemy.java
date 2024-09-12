public class Enemy {
    private String type;
    private int positionX;
    private int positionY;
    private int damage;

    public Enemy(String type, int positionX, int positionY, int damage) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void printInfo() {
        System.out.println("Enemy [Type: " + this.type + ", Position: (" + this.positionX + "," + this.positionY + "), Damage: " + this.damage + " ]");
    }
}