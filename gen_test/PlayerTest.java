package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 100, 0, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(90);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testGetXPosition() {
        assertEquals(0, player.getXPosition());
    }

    @Test
    public void testSetXPosition() {
        player.setXPosition(5);
        assertEquals(5, player.getXPosition());
    }

    @Test
    public void testGetYPosition() {
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testSetYPosition() {
        player.setYPosition(8);
        assertEquals(8, player.getYPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeHealth() {
        player.setHealth(-20);
    }

    @Test
    public void testInteractWithEnemy() {
        Enemy enemy = new Enemy("Goblin", 50, 2, 2);
        player.interact(enemy);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testPrintInfo() {
        player.printInfo(); // This can be manually verified for correct output if needed
    }
}

// File: GameTest.java
import org.junit.Test;

public 