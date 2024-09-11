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
    public void testGetPositionX() {
        assertEquals(0, player.getPositionX());
    }

    @Test
    public void testSetPositionX() {
        player.setPositionX(2);
        assertEquals(2, player.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testSetPositionY() {
        player.setPositionY(3);
        assertEquals(3, player.getPositionY());
    }

    @Test
    public void testMove() {
        player.move(5, 5);
        assertEquals(5, player.getPositionX());
        assertEquals(5, player.getPositionY());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }
}