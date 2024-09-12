package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPosition());
    }
    
    @Test
    public void testIncreaseScore_PositiveValue() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testIncreaseScore_NegativeValue() {
        player.increaseScore(-5);
        assertEquals(-5, player.getScore());
    }

    @Test
    public void testSetPosition() {
        player.setPosition(5);
        assertEquals(5, player.getPosition());
    }

    @Test
    public void testMove() {
        player.move(3);
        assertEquals(3, player.getPosition());
        player.move(-2);
        assertEquals(1, player.getPosition());
    }

    @Test
    public void testPrintingStatus() {
        player.increaseScore(15);
        player.move(5);
        player.printStatus(); // manual inspection of printed output might be required
    }
}

public 