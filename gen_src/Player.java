class Player extends GameObject {
    
    private int score;

    public Player(String name, int x, int y) {
        super(name, x, y);
        this.score = 0;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void move(int deltaX, int deltaY) {
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        player.move(5, 7);
        player.printInfo();
    }
}

// Enemy.java
public 