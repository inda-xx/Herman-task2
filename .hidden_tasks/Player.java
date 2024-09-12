public class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;
    private boolean isAlive;

    public Player(String name, int score, int positionX, int positionY, boolean isAlive) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
    }

    public void interactWithEnemy(Enemy enemy) {
        if (this.positionX == enemy.getPositionX() && this.positionY == enemy.getPositionY()) {
            System.out.println("Encounter with " + enemy.getType());
            this.isAlive = false; // Simple logic for demo purposes
        }
    }

    public void printInfo() {
        System.out.println("Player [Name: " + this.name + ", Score: " + this.score + ", Position: (" + this.positionX + "," + this.positionY + "), Alive: " + this.isAlive + " ]");
    }
}