public class Enemy {

    private String type;
    private int positionX;
    private int positionY;
    private boolean alive;

    public Enemy(String type, int positionX, int positionY, boolean alive) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.alive = alive;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void printInfo() {
        System.out.println("Enemy Type: " + type);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Alive: " + alive);
    }
}