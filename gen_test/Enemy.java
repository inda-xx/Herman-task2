package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Enemy {
    private int health;

    // Constructor
    public Enemy(int health) {
        this.health = health;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Method for interaction between player and enemy
    public void interact(Player player) {
        System.out.println("Player " + player.getPlayerName() + " encountered an enemy!");
        player.setScore(player.getScore() + 5); // increment score by 5 for interaction
        System.out.println("Current Score after interaction: " + player.getScore());
    }

    public static void main(String[] args) {
        Player player1 = new Player("Hero", 0, 0, 0);
        Enemy goblin = new Enemy(100); // example enemy with health 100
        goblin.interact(player1);
        player1.printInfo();
    }
}

// PlayerTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 