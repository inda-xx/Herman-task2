package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPlayerGetName() {
        assertEquals("Hero", player.getName());
    }
        
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidScoreSet() {
        player.setScore(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionX() {
        player.setPositionX(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionY() {
        player.setPositionY(-1);
    }
}

// Ensure that you implement the custom exceptions or input validations to handle the cases where illegal state or arguments could occur in the original classes. 
// This includes adding checks for invalid health or position values.