package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 0, 0);
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("TestPlayer", player.getName());
    }

    @Test
    public void testSetName() {
        player.setName("NewName");
        assertEquals("NewName", player.getName());
    }

    @Test
    public void testGetPosition() {
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testSetPosition() {
        player.setXPosition(10);
        player.setYPosition(20);
        assertEquals(10, player.getXPosition());
        assertEquals(20, player.getYPosition());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(1, player.getYPosition());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(-1, player.getYPosition());
    }

    @Test
    public void testScore() {
        assertEquals(0, player.getScore());
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testIsAlive() {
        assertTrue(player.isAlive());
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test
    public void testEncounterEnemy() {
        player.encounterEnemy(enemy);
        assertEquals(10, player.getScore());
    }
}