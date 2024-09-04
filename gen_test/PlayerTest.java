package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;
    
    @Before
    public void setUp() {
        player = new Player("Hero", 10, 5, 5);
        enemy = new Enemy("Villain", 8, 5);
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
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(20);
        assertEquals(20, player.getScore());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(5, player.getPositionX());
    }

    @Test
    public void testSetPositionX() {
        player.setPositionX(7);
        assertEquals(7, player.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(5, player.getPositionY());
    }

    @Test
    public void testSetPositionY() {
        player.setPositionY(9);
        assertEquals(9, player.getPositionY());
    }

    @Test
    public void testPrintInfo() {
        // Testing console output can be complex; here, we check the method completes without errors
        player.printInfo();
    }
    
    @Test
    public void testInteractWithEnemy() {
        // Simply checks if the method runs without exceptions for now
        player.interact(enemy);
    }
    
    @Test
    public void testInteractionMessage() {
        // To fully test the output, consider capturing the System.out.println using streams (not shown here)
        player.interact(enemy);
    }
}

// EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 