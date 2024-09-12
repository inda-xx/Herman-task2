class GameCharacter {

    private String name;
    private int health;
    private int score;
    private int positionX;
    private int positionY;
    private boolean active;

    // Constructor
    public GameCharacter(String name, int health, int positionX, int positionY) {
        this.name = name;
        this.health = health;
        this.score = 0;
        this.positionX = positionX;
        this.positionY = positionY;
        this.active = true;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Method to move the player
    public void moveTo(int x, int y) {
        this.positionX = x;
        this.positionY = y;
        System.out.println(name + " moved to position (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        GameCharacter player = new GameCharacter("Hero", 100, 0, 0);
        System.out.println("Player " + player.name + " created!");
        player.setScore(10);
        System.out.println("Score: " + player.getScore());
        player.moveTo(5, 5);
    }
}



// GameEnemy.