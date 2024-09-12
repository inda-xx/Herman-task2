class Player {
    private String name;
    private int score;
    private int position;

    public Player() {
    }

    public Player(String name, int score, int position) {
        this.name = name;
        this.score = score;
        this.position = position;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void printPlayerInfo() {
        System.out.println("Player Info");
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: " + position);
    }

    public void encounter(Enemy enemy) {
        System.out.println("Encountered " + enemy.getType() + ", lost " + enemy.getDamage() + " points!");
        this.score -= enemy.getDamage();
        this.position -= 1;
    }

    public static void main(String[] args) {
        Player newbie = new Player("Rookie", 0, 1);
        newbie.printPlayerInfo();

        Enemy golem = new Enemy("Golem", 10);
        newbie.encounter(golem);

        System.out.println("Player Position: " + newbie.getPosition());
        System.out.println("Player Score: " + newbie.getScore());
    }
}