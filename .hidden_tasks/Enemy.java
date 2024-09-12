import java.util.Set;

public class Enemy {
    private String enemyName;
    private int damagePoints;

    // Constructor to initialize Enemy object
    public Enemy(String enemyName, int damagePoints) {
        this.enemyName = enemyName; // using 'this' to resolve variable shadowing
        this.damagePoints = damagePoints;
    }

    // Getter for enemyName
    public String getEnemyName() {
        return enemyName;
    }

    // Setter for enemyName
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    // Getter for damagePoints
    public int getDamagePoints() {
        return damagePoints;
    }

    // Setter for damagePoints
    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    // Additional method to demonstrate use and interaction
    public void attackPlayer(Player player) {
        System.out.println(enemyName + " attacks " + player.getPlayerName() + 
                           " causing " + damagePoints + " damage!");
        // Possible integration: reduce player's health by damagePoints
        // Assume there's a method in Player for reducing health.
    }
}