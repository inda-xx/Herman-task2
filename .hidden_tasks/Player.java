class Player {
    private String name;
    private int score;
    private int posX;
    private int posY;

    public Player(String name, int posX, int posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
        this.score = 0; // Initial score
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

    public void move(int deltaX, int deltaY) {
        this.posX += deltaX;
        this.posY += deltaY;
        System.out.println(name + " moved to position (" + posX + ", " + posY + ")");
    }

    public void incrementScore(int points) {
        this.score += points;
        System.out.println(name + " scored! New score: " + score);
    }
}

// Enemy.java
public 