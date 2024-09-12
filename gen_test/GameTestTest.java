package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {
    
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Space Ace", 5);
        enemy = new Enemy("Alien Invader", 5);
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Alien Invader", enemy.getEnemyType());
        assertEquals(5, enemy.getEnemyPosition());
        assertFalse(enemy.isDefeated());
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Space Ace", player.getPlayerName());
        assertEquals(5, player.getPosition());
        assertEquals(0, player.getScore());
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerEnemyInteractionPositionMatch() {
        player.interactWithEnemy(enemy);
        assertTrue(enemy.isDefeated());
        assertEquals(1, player.getScore());
    }

    @Test
    public void testPlayerEnemyInteractionPositionMismatch() {
        enemy.setEnemyPosition(3);
        player.interactWithEnemy(enemy);
        assertFalse(enemy.isDefeated());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerEnemyAlreadyDefeated() {
        enemy.setDefeated(true);
        player.interactWithEnemy(enemy);
        assertTrue(enemy.isDefeated());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetAndGetEnemyType() {
        enemy.setEnemyType("New Alien");
        assertEquals("New Alien", enemy.getEnemyType());
    }

    @Test
    public void testSetAndGetPosition() {
        player.setPosition(3);
        assertEquals(3, player.getPosition());
        player.setPosition(10);
        assertEquals(10, player.getPosition());
    }

    @Test
    public void testSetAndGetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetAndGetDefeatedStatus() {
        enemy.setDefeated(true);
        assertTrue(enemy.isDefeated());
    }

    @Test
    public void testSetAndGetPlayerName() {
        player.setPlayerName("Ace Space");
        assertEquals("Ace Space", player.getPlayerName());
    }

    @Test
    public void testSetAndGetAliveStatus() {
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test
    public void testSetAndGetEnemyPosition() {
        enemy.setEnemyPosition(10);
        assertEquals(10, enemy.getEnemyPosition());
    }

    // Additional tests to handle edge cases
    @Test
    public void testNegativeEnemyPosition() {
        enemy.setEnemyPosition(-1);
        assertEquals(-1, enemy.getEnemyPosition());
    }

    @Test
    public void testEmptyPlayerName() {
        player.setPlayerName("");
        assertEquals("", player.getPlayerName());
    }

    @Test
    public void testNullEnemyType() {
        enemy.setEnemyType(null);
        assertNull(enemy.getEnemyType());
    }
}