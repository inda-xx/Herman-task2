public class Player {
    private String name;
    private int score;
    private int posX;
    private int posY;

    public Player(String name, int posX, int posY) {
        this.name = name;
        this.score = 0; // Score starts at 0
        this.posX = posX;
        this.posY = posY;
    }

    public String getPlayerName() {
        return name;
    }

    public void setPlayerName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void printPlayerInfo() {
        System.out.println("Player: " + name + " Position: (" + posX + ", " + posY + ") Score: " + score);
    }

    public void interact(Enemy enemy) {
        System.out.println(name + " interacts with " + enemy.getEnemyType());
        addScore(10);
    }

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0);
        player1.printPlayerInfo();
    }
}