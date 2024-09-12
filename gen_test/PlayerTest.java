package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 10);
        enemy = new Enemy("Dragon", 20);
    }

    @Test
    public void testInitialPlayerState() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getScore());
        assertEquals(10, player.getPosition());
    }

    @Test
    public void testSetPlayerName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetPlayerScore() {
        player.setScore(150);
        assertEquals(150, player.getScore());
    }

    @Test
    public void testSetPlayerPosition() {
        player.setPosition(5);
        assertEquals(5, player.getPosition());
    }

    @Test
    public void testEncounterWithEnemy() {
        player.encounter(enemy);
        assertEquals(80, player.getScore());
        assertEquals(9, player.getPosition());
    }

    @Test
    public void testEncounterWithHighDamageEnemy() {
        Enemy strongEnemy = new Enemy("Tiger", 150);
        player.encounter(strongEnemy);
        assertEquals(-50, player.getScore()); // Score should go negative
        assertEquals(9, player.getPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeScore() {
        player.setScore(-10); // Expecting an exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativePosition() {
        player.setPosition(-5); // Expecting an exception
    }

    @Test
    public void testPrintPlayerInfo() {
        // You might want to test if this method prints correctly, which usually requires a more complex setup with System.out
    }
    
    @Test
    public void testMultipleEncounters() {
        player.encounter(new Enemy("Goblin", 10));
        player.encounter(new Enemy("Orc", 15));
        assertEquals(75, player.getScore());
        assertEquals(8, player.getPosition());
    }
}

package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import main.Enemy;

public 