package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 10, 10, true);
        enemy = new Enemy("Orc", 15, 7, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(10, player.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(10, player.getPositionY());
    }

    @Test
    public void testIsActive() {
        assertTrue(player.isActive());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetPositionX() {
        player.setPositionX(20);
        assertEquals(20, player.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        player.setPositionY(25);
        assertEquals(25, player.getPositionY());
    }

    @Test
    public void testSetActive() {
        player.setActive(false);
        assertFalse(player.isActive());
    }

    @Test
    public void testMove() {
        player.move(5, -3);
        assertEquals(15, player.getPositionX());
        assertEquals(7, player.getPositionY());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(20);
        assertEquals(20, player.getScore());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interact(enemy);
        assertEquals(-5, player.getScore());
    }
}

// EnemyTest.java
package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 