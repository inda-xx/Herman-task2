package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private Enemy goblin;
    private Enemy orc;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        goblin = new Enemy("Goblin", 2, 3, 5);
        orc = new Enemy("Orc", 0, 0, 10);
    }

    @Test
    public void testPlayerInitialState() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertTrue(player.isAlive());
    }

    @Test
    public void testEnemyInitialState() {
        assertEquals("Goblin", goblin.getType());
        assertEquals(2, goblin.getPositionX());
        assertEquals(3, goblin.getPositionY());
        assertEquals(5, goblin.getDamage());
    }

    @Test
    public void testPlayerMovement() {
        player.move(2, 3);
        assertEquals(2, player.getPositionX());
        assertEquals(3, player.getPositionY());
    }

    @Test
    public void testPlayerInteractionWithEnemy() {
        player.move(2, 3);
        goblin.interact(player);
        assertEquals(-5, player.getScore());
    }

    @Test
    public void testInteractionWithEnemyAtSamePosition() {
        orc.interact(player);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testNoInteractionWhenNotSamePosition() {
        goblin.interact(player);
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetPlayerName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetPlayerPosition() {
        player.setPositionX(5);
        player.setPositionY(6);
        assertEquals(5, player.getPositionX());
        assertEquals(6, player.getPositionY());
    }

    @Test
    public void testSetEnemyType() {
        goblin.setType("Orc");
        assertEquals("Orc", goblin.getType());
    }

    @Test
    public void testSetEnemyDamage() {
        goblin.setDamage(15);
        assertEquals(15, goblin.getDamage());
    }

    @Test
    public void testInvalidPlayerMovement() {
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getPositionX());
        assertEquals(Integer.MAX_VALUE, player.getPositionY());
    }

    @Test
    public void testEdgeCasePlayerScoreUnderflow() {
        orc.interact(player);  // Set score to -10
        orc.interact(player);  // Interactions do not underflow integer values
        assertEquals(-20, player.getScore());
    }
}