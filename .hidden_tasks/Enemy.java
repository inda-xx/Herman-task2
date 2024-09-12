class Enemy {
    private String type;
    private int position;
    private int attackPower;

    // Constructor to initialize the enemy's type, position, and attack power
    public Enemy(String type, int position, int attackPower) {
        this.type = type;
        this.position = position;
        this.attackPower = attackPower;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Getter for position
    public int getPosition() {
        return position;
    }

    // Setter for position
    public void setPosition(int position) {
        this.position = position;
    }

    // Getter for attack power
    public int getAttackPower() {
        return attackPower;
    }

    // Method to interact with a player and decrease their score
    public void interact(Player player) {
        if (player.getPosition() == this.position) {
            System.out.println("Encounter: Player " + player.getName() + " vs " + type + "!");
            player.increaseScore(-this.attackPower);
            System.out.println("Player's score is now " + player.getScore());
        } else {
            System.out.println(type + " is not at the same position as the player.");
        }
    }

    // Method to print the enemy's current status
    public void printStatus() {
        System.out.println(type + " at position " + position + " with attack power " + attackPower);
    }
}
```

Game.java
```java
public 