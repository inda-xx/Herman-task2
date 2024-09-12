public class Player {
    private String playerName;
    private int score;
    private int position;
    private boolean isAlive;

    public Player(String playerName, int position) {
        this.playerName = playerName;
        this.position = position;
        this.score = 0;
        this.isAlive = true;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void printStatus() {
        System.out.println("> Player: " + playerName);
        System.out.println("> Score: " + score);
        System.out.println("> Position: " + position);
    }

    public void interactWithEnemy(Enemy enemy) {
        if (this.position == enemy.getEnemyPosition() && !enemy.isDefeated()) {
            System.out.println("> " + playerName + " encountered " + enemy.getEnemyType() + "!");
            enemy.setDefeated(true);
            this.score += 1;
        }
    }
}