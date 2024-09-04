package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Aragorn", 100, 1, 5); // Initialize player with a score of 100, position 1, and defense 5
    }

    @Test
    public void testPlayerGetName() {
        assertEquals("Player name should be Aragorn", "Aragorn", player.getName());
    }

    @Test
    public void testPlayerSetName() {
        player.setName("Gandalf");
        assertEquals("Player name should be updated to Gandalf", "Gandalf", player.getName());
    }

    @Test
    public void testPlayerGetScore() {
        assertEquals("Player score should be 100", 100, player.getScore());
    }

    @Test
    public void testPlayerSetScore() {
        player.setScore(200);
        assertEquals("Player score should be updated to 200", 200, player.getScore());
    }

    @Test
    public void testPlayerGetPosition() {
        assertEquals("Player position should be 1", 1, player.getPosition());
    }

    @Test
    public void testPlayerSetPosition() {
        player.setPosition(2);
        assertEquals("Player position should be updated to 2", 2, player.getPosition());
    }

    @Test
    public void testPlayerGetDefense() {
        assertEquals("Player defense should be 5", 5, player.getDefense());
    }

    @Test
    public void testPlayerSetDefense() {
        player.setDefense(8);
        assertEquals("Player defense should be updated to 8", 8, player.getDefense());
    }
}


// ShadowExampleTest.java

package test;

import main.ShadowExample;
import org.junit.Test;
import static org.junit.Assert.*;

public 