class Player {
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.score = 0;
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

    public void move(String direction) {
        switch (direction.toLowerCase()) {
            case "up":
                this.positionY++;
                break;
            case "down":
                this.positionY--;
                break;
            case "left":
                this.positionX--;
                break;
            case "right":
                this.positionX++;
                break;
            default:
                System.out.println("Invalid direction!");
                return;
        }
        System.out.println("Player moved to (" + this.positionX + ", " + this.positionY + ")");
    }
}



// Enemy.
package game;

public