public class Player {

    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int score, int positionX, int positionY) {
        this.name = name;
        this.score = score;
        this.positionX = positionX;
        this.positionY = positionY;
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

    public void printInfo() {
        System.out.println("Player Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    public void moveUp() {
        positionY += 1;
        System.out.println("Moved to position: (" + positionX + ", " + positionY + ")");
    }

    public void moveDown() {
        positionY -= 1;
        System.out.println("Moved to position: (" + positionX + ", " + positionY + ")");
    }

    public void moveLeft() {
        positionX -= 1;
        System.out.println("Moved to position: (" + positionX + ", " + positionY + ")");
    }

    public void moveRight() {
        positionX += 1;
        System.out.println("Moved to position: (" + positionX + ", " + positionY + ")");
    }

    public void interactWithEnemy(Enemy enemy) {
        if (positionX == enemy.getPositionX() && positionY == enemy.getPositionY() && enemy.isAlive()) {
            enemy.setAlive(false);
            System.out.println("Player " + name + " attacked and defeated the " + enemy.getType() + "!");
        }
    }
}