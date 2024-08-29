class Player {

    // Instance fields for Player class
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor to initialize Player
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Default score
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for score
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    // Getter and setter for positionX
    public int getPositionX() {
        return positionX;
    }
    
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    // Getter and setter for positionY
    public int getPositionY() {
        return positionY;
    }
    
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    // Method to print player information
    public void printInfo() {
        System.out.println("Player: " + this.name);
        System.out.println("Position: (" + this.positionX + ", " + this.positionY + ")");
        System.out.println("Score: " + this.score);
    }
    
    // Method to increase player's score
    public void increaseScore(int points) {
        this.score += points;
        System.out.println(this.name + " scored " + points + " points!");
    }

    public static void main(String[] args) {
        Player hero = new Player("Hero", 0, 0);
        hero.printInfo();
        hero.increaseScore(20);
        hero.printInfo();
    }
}


// Enemy.java

public 