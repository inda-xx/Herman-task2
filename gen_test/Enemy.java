package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Enemy {
    private int xPosition;
    private int yPosition;

    public Enemy(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void challenge(Player player) {
        player.addScore(-10);
        System.out.println("Enemy at (" + xPosition + ", " + yPosition + ") challenges " +
                           player.getName() + "! Score is now: " + player.getScore());
    }
}

// File: Game.java
package main;

public 