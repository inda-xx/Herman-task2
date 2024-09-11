package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 5, 5);
        enemy = new Enemy("Orc", 2, 2);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(5, player.getxPosition());
        assertEquals(5, player.getyPosition());
        assertTrue(player.isAlive());
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Orc", enemy.getType());
        assertEquals(2, enemy.getxPosition());
        assertEquals(2, enemy.getyPosition());
        assertTrue(enemy.isAlive());
    }

    @Test
    public void testPlayerSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testEnemySetType() {
        enemy.setType("Goblin");
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testPlayerSetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testPlayerChangeAliveStatus() {
        player.setAlive(false);
        assertFalse(player.isAlive());
    }

    @Test
    public void testEnemyChangeAliveStatus() {
        enemy.setAlive(false);
        assertFalse(enemy.isAlive());
    }

    @Test
    public void testPlayerInteractWithEnemy() {
        player.interactWithEnemy(enemy);
        assertEquals(10, player.getScore());
        assertFalse(enemy.isAlive());
    }

    @Test
    public void testPlayerInteractWithDeadEnemy() {
        enemy.setAlive(false);
        player.interactWithEnemy(enemy);
        assertEquals(0, player.getScore());
        assertFalse(enemy.isAlive());
    }

    @Test
    public void testEnemySetPosition() {
        enemy.setxPosition(3);
        enemy.setyPosition(4);
        assertEquals(3, enemy.getxPosition());
        assertEquals(4, enemy.getyPosition());
    }

    @Test
    public void testEnemyPositionBoundary() {
        enemy.setxPosition(Integer.MAX_VALUE);
        enemy.setyPosition(Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, enemy.getxPosition());
        assertEquals(Integer.MIN_VALUE, enemy.getyPosition());
    }

    @Test
    public void testPerformancePlayerInteraction() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Player testPlayer = new Player("Hero" + i, i, i, i);
            Enemy testEnemy = new Enemy("Orc" + i, i, i);
            testPlayer.interactWithEnemy(testEnemy);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        assertTrue("Performance issue detected", duration < 1000);
    }
}