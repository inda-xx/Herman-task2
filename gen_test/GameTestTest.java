package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        enemy = new Enemy(5, 5);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testEnemyInitialization() {
        enemy = new Enemy(10, 10);
        // No getter methods to test directly, relying on interaction
        player.move(10, 10);
        enemy.interact(player);
        assertEquals(10, player.getXPosition());
        assertEquals(10, player.getYPosition());
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPlayerMovement() {
        player.move(5, 5);
        assertEquals(5, player.getXPosition());
        assertEquals(5, player.getYPosition());
    }

    @Test
    public void testMultipleMovements() {
        player.move(3, 4);
        player.move(-1, -2);
        assertEquals(2, player.getXPosition());
        assertEquals(2, player.getYPosition());
    }

    @Test
    public void testPlayerScoring() {
        player.move(5, 5);
        enemy.interact(player);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEnemyNoInteraction() {
        player.move(4, 4);
        enemy.interact(player);
        assertEquals(0, player.getScore());
    }

    @Test(expected = IllegalArgumentException.