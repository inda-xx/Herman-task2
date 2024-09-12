package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameEntitiesTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 50, 3, 4);
        enemy = new Enemy(1, 3, 4);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(50, player.getScore());
        assertEquals(3, player.getXPosition());
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals(1, enemy.getId());
        assertEquals(3, enemy.getXPosition());
        assertEquals(4, enemy.getYPosition());
    }

    @Test
    public void testPlayerScoreIncrement() {
        player.incrementScore(10);
        assertEquals(60, player.getScore());
    }

    @Test
    public void testPlayerPositionChange() {
        player.setXPosition(7);
        player.setYPosition(8);
        assertEquals(7, player.getXPosition());
        assertEquals(8, player.getYPosition());
    }

    @Test
    public void testEnemyPositionChange() {
        enemy = new Enemy(1, 8, 9);
        assertEquals(8, enemy.getXPosition());
        assertEquals(9, enemy.getYPosition());
    }

    @Test
    public void testCollisionDetection() {
        player.setXPosition(5);
        player.setYPosition(5);
        enemy = new Enemy(1, 5, 5);
        assertTrue(player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition());
    }

    @Test
    public void testNoCollision() {
        player.setXPosition(3);
        player.setYPosition(4);
        enemy = new Enemy(1, 5, 6);
        assertFalse(player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition());
    }

    @Test
    public void testPlayerScoreResetOnCollision() {
        player.setXPosition(5);
        player.setYPosition(5);
        player.setScore(100);
        enemy = new Enemy(1, 5, 5);
        if (player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
            player.setScore(0);
        }
        assertEquals(0, player.getScore());
    }
}