package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {
    private Player player;
    
    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("Hero", player.getPlayerName());
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("Warrior");
        assertEquals("Warrior", player.getPlayerName());
    }
    
    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }
    
    @Test
    public void testSetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }
    
    @Test
    public void testGetPlayerPositionX() {
        assertEquals(0, player.getPlayerPositionX());
    }

    @Test
    public void testSetPlayerPositionX() {
        player.setPlayerPositionX(5);
        assertEquals(5, player.getPlayerPositionX());
    }

    @Test
    public void testGetPlayerPositionY() {
        assertEquals(0, player.getPlayerPositionY());
    }

    @Test
    public void testSetPlayerPositionY() {
        player.setPlayerPositionY(3);
        assertEquals(3, player.getPlayerPositionY());
    }
    
    @Test
    public void testPrintPlayerInfo() {
        // For testing the print statement, actual assertion might not be needed
        // This is more about checking manually if output is correct
        player.printPlayerInfo();
    }

    @Test
    public void testInvalidPosition() {
        // Possibly check if setting negative positions or out of bounds causes errors
        // If program logic is added to handle that.
    }
}