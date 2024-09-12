package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class IntegrationTest {

    private Player player;
    private Enemy goblin;

    @Before
    public void setUp() {
        player = new Player("Hero", 0);
        goblin = new Enemy("Goblin", 5, 10);
    }

    @Test
    public void testPlayerInteractsWithEnemy() {
        player.move(5);
        // Check before interaction
        assertEquals(5, player.getPosition());
        assertEquals(0, player.getScore());
        goblin.interact(player);
        // Check after interaction
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testPerformance() {
        long startTime = System.currentTimeMillis();
        player.move(1000000);
        long endTime = System.currentTimeMillis();
        assertTrue("The move operation took too long.", (endTime - startTime) < 1000);
    }
}