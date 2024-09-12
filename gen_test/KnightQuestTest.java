package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class KnightQuestTest {

    private KnightQuest game;

    @Before
    public void setUp() {
        game = new KnightQuest();
    }

    @Test
    public void testInitialPlayerPosition() {
        assertEquals(0, game.getPlayerPosition());
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, game.getScore());
    }
    
    @Test
    public void testEnemiesDefeatedAtStart() {
        assertEquals(0, game.getEnemiesDefeated());
    }

    @Test
    public void testSetPlayerPosition() {
        game.setPlayerPosition(10);
        assertEquals(10, game.getPlayerPosition());
    }

    @Test
    public void testSetScore() {
        game.setScore(200);
        assertEquals(200, game.getScore());
    }
    
    @Test
    public void testSetEnemiesDefeated() {
        game.setEnemiesDefeated(5);
        assertEquals(5, game.getEnemiesDefeated());
    }

    @Test
    public void testNegativePlayerPosition() {
        game.setPlayerPosition(-5);
        assertEquals(-5, game.getPlayerPosition());
    }

    @Test
    public void testNegativeScore() {
        game.setScore(-10);
        assertEquals(-10, game.getScore());
    }
    
    @Test
    public void testNegativeEnemiesDefeated() {
        game.setEnemiesDefeated(-1);
        assertEquals(-1, game.getEnemiesDefeated());
    }

    @Test
    public void testLargeScore() {
        game.setScore(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, game.getScore());
    }

    @Test(expected = Exception.class)
    public void testInvalidInputForPosition() {
        game.setPlayerPosition(Integer.parseInt("abc")); // Should throw NumberFormatException
    }

    // Additional edge case tests can be added as needed
}

package shadowexample;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public 