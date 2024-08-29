package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero");
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
        assertEquals(0, player.getScore());
        assertTrue(player.isAlive());
    }

    @Test
    public void testMovePlayer() {
        player.movePlayer(3, 4);
        assertEquals(3, player.getXPosition());
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testAddScore() {
        player.addScore(15);
        assertEquals(15, player.getScore());
    }

    @Test
    public void testSetGetPlayerName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetGetXPosition() {
        player.setXPosition(7);
        assertEquals(7, player.getXPosition());
    }

    @Test
    public void testSetGetYPosition() {
        player.setYPosition(12);
        assertEquals(12, player.getYPosition());
    }

    @Test
    public void testSetGetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testSetGetAliveStatus() {
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidScore() {
        player.setScore(-10);
    }
}