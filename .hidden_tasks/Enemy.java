class Enemy {
    private String enemyName;
    private int strength;
    private int positionX;
    private int positionY;

    // Constructor
    public Enemy(String enemyName, int strength) {
        this.enemyName = enemyName;
        this.strength = strength;
        this.positionX = 5; // Initial position for enemies
        this.positionY = 5;
    }

    // Getter and setter for enemyName
    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
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
```

**Main.java**
```java
public 