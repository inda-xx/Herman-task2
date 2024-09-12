class Enemy {
    // Fields for the Enemy class
    private String type;
    private int positionX;
    private int positionY;
    private int damage;

    // Constructor for Enemy class
    public Enemy(String type, int positionX, int positionY, int damage) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Method to interact with a player
    public void interact(Player player) {
        // Check if the player is at the same position
        if (player.getPositionX() == this.positionX && player.getPositionY() == this.positionY) {
            System.out.println("Encounter with enemy! Player's score decreased by " + damage);
            player.incrementScore(-damage);
        }
    }

    // Method to print enemy info
    public void printInfo() {
        System.out.println("Enemy Type: " + type);
        System.out.println("Position: (" + positionX + ", " + positionY + ")");
        System.out.println("Damage: " + damage);
    }
}
```

```java
// Main.java
public 