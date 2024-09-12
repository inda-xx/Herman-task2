class Player extends GameElement {
    private int xPosition;
    private int yPosition;

    public Player(String name, int health) {
        super(name, health);
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public void move(int x, int y) {
        this.xPosition += x;
        this.yPosition += y;
        System.out.println(getName() + " moved to position: (" + xPosition + ", " + yPosition + ")");
    }

    public int getXPosition() { return xPosition; }
    public int getYPosition() { return yPosition; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Position: (" + xPosition + ", " + yPosition + ")");
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 100);
        hero.move(5, 3);
        hero.printInfo();
    }
}

// Enemy.java
public 