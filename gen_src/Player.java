class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int startX, int startY) {
        this.name = name;
        this.positionX = startX;
        this.positionY = startY;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void moveUp() {
        positionY--;
    }

    public void moveDown() {
        positionY++;
    }

    public void moveLeft() {
        positionX--;
    }
    
    public void moveRight() {
        positionX++;
    }

    public void printStatus() {
        System.out.println("Player: " + name);
        System.out.println("Score: " + score);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
    }

    public static void main(String[] args) {
        Player playerOne = new Player("Alice", 0, 0);
        playerOne.moveRight();
        playerOne.moveUp();
        playerOne.printStatus();
    }
}



// Enemy.

public