package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 100);
    }

    @Test
    public void testMove() {
        player.move(5, 3);
        assertEquals(5, player.getXPosition());
        assertEquals(3, player.getYPosition());
    }

    @Test
    public void testPositionsInitiallyZero() {
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testPlayerInheritance() {
        assertTrue(player instanceof GameElement);
    }
}

package original;

import org.junit.Test;
import static org.junit.Assert.*;

public 