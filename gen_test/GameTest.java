package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        enemy = new Enemy(5, 5);
    }

    // Player Tests

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testAddScore() {
        player.addScore(10);
        assertEquals(10, player.getScore());

        player.addScore(-5);
        assertEquals(5, player.getScore());
    }

    @Test
    public void testPlayerMove() {
        player.move(3, 4);
        assertEquals(3, player.getPositionX());
        assertEquals(4, player.getPositionY());
    }

    @Test
    public void testSetPlayerPosition() {
        player.setPositionX(9);
        player.setPositionY(8);

        assertEquals(9, player.getPositionX());
        assertEquals(8, player.getPositionY());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    // Enemy Tests

    @Test
    public void testEnemyInitialization() {
        assertEquals(5, enemy.getPositionX());
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testEnemyMoveTo() {
        enemy.moveTo(10, 3);
        assertEquals(10, enemy.getPositionX());
        assertEquals(3, enemy.getPositionY());
    }

    @Test
    public void testSetEnemyPosition() {
        enemy.setPositionX(1);
        enemy.setPositionY(1);

        assertEquals(1, enemy.getPositionX());
        assertEquals(1, enemy.getPositionY());
    }

    // Edge and Boundary Cases

    @Test
    public void testPlayerMoveBoundary() {
        player.move(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getPositionX());
        assertEquals(Integer.MIN_VALUE, player.getPositionY());
    }

    @Test
    public void testEnemyMoveBoundary() {
        enemy.moveTo(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, enemy.getPositionX());
        assertEquals(Integer.MIN_VALUE, enemy.getPositionY());
    }

    @Test
    public void testNegativeScoreHandling() {
        player.addScore(10);
        player.addScore(-20);
        assertEquals(-10, player.getScore());
    }
}