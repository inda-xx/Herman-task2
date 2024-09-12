package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero");
        enemy = new Enemy("Villain", 5);
    }

    @Test
    public void testGetPlayerName() {
        assertEquals("Hero", player.getPlayerName());
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("Champion");
        assertEquals("Champion", player.getPlayerName());
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(0, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(0, player.getPositionX());
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testMoveLeft() {
        player.moveLeft();
        assertEquals(-1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interactWithEnemy(enemy);
        assertEquals(-5, player.getScore());
        assertEquals("Villain", enemy.getEnemyName());
    }
}