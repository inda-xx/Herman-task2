package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy goblin;
    private Enemy dragon;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        goblin = new Enemy("Goblin", 5, 5);
        dragon = new Enemy("Dragon", 10, 10);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testPlayerMovement() {
        player.move(3, 3);
        assertEquals(3, player.getXPosition());
        assertEquals(3, player.getYPosition());

        player.move(-1, -1); // Test negative movement
        assertEquals(2, player.getXPosition());
        assertEquals(2, player.getYPosition());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(15);
        assertEquals(15, player.getScore());

        player.increaseScore(0); // Edge case: No score change
        assertEquals(15, player.getScore());
    }

    @Test
    public void testInteractionWithEnemy() {
        player.interactWithEnemy(goblin);
        // You may want to verify the console output or simulate actual interaction effects if integrated

        player.interactWithEnemy(dragon);
        // Further interactions can be validated similarly
    }

    @Test(expected = NullPointerException.class)
    public void testInteractionWithNullEnemy() {
        player.interactWithEnemy(null); // Invalid input edge case
    }

    @Test
    public void testPlayerNameSet() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }
}

package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

// Unit test 