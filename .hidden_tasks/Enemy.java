class Enemy {
    // Fields
    private String type;
    private int positionX;
    private int positionY;
    private int damageValue;

    // Constructor
    public Enemy(String type, int positionX, int positionY, int damageValue) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.damageValue = damageValue;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getDamageValue() {
        return damageValue;
    }

    public void setDamageValue(int damageValue) {
        this.damageValue = damageValue;
    }
}
```

In these two classes, the Player 