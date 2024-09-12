package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Knight", 0, 0);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Knight", player.getName());
        assertEquals(0, player.getPosX());
        assertEquals(0, player.getPosY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetPosX() {
        player.setPosX(3);
        assertEquals(3, player.getPosX());
    }

    @Test
    public void testSetPosY() {
        player.setPosY(4);
        assertEquals(4, player.getPosY());
    }

    @Test
    public void testMove() {
        player.move(2, 3);
        assertEquals(2, player.getPosX());
        assertEquals(3, player.getPosY());
    }

    @Test
    public void testIncrementScore() {
        player.incrementScore(15);
        assertEquals(15, player.getScore());
    }

    @Test
    public void testNegativeScore() {
        player.incrementScore(-5);
        assertEquals(-5, player.getScore());
    }
}