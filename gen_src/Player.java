class Player {
    // Instance fields
    private String name;
    private int positionX;
    private int positionY;
    private int score;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.positionX = 0;
        this.positionY = 0;
        this.score = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Print player info
    public void printPlayerInfo() {
        System.out.println("Player: " + name);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Score: " + score);
    }

    // Move player
    public void move(int deltaX, int deltaY) {
        this.positionX += deltaX;
        this.positionY += deltaY;
        System.out.println(name + " moved to position (" + positionX + ", " + positionY + ")");
    }

    // Increase score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println(name + " scored! Current score: " + score);
    }
}



// Enemy.
public