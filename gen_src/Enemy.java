class Enemy {
    private String enemyName;
    private int strength;
    private int positionX;
    private int positionY;
    
    // Constructor initializes enemy attributes
    public Enemy(String enemyName, int strength) {
        this.enemyName = enemyName;
        this.strength = strength;
        this.positionX = 5; // Arbitrary starting position X
        this.positionY = 5; // Arbitrary starting position Y
    }
    
    // Getter for enemyName
    public String getEnemyName() {
        return enemyName;
    }

    // Getter and setter for strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
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
}

// Main.java
public 