package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Game game;

    @Before
    public void setUp() {
        // Initialize Game with default values
        game = new Game("TestPlayer", 0, 0, 5);
    }

    @Test
    public void testInitialState() {
        assertEquals("TestPlayer", game.getPlayerName());
        assertEquals(0, game.getPlayerScore());
        assertEquals(0, game.getPlayerPosition());
        assertEquals(5, game.getEnemyPosition());
        assertFalse(game.isGameOver());
    }

    @Test
    public void testMovePlayerSimpleMove() {
        game.movePlayer(2);
        assertEquals(2, game.getPlayerPosition());
        assertEquals(2, game.getPlayerScore());
        assertFalse(game.isGameOver());
    }

    @Test
    public void testMovePlayerReachEnemy() {
        game.movePlayer(3);
        game.movePlayer(2);
        assertEquals(5, game.getPlayerPosition());
        assertEquals(15, game.getPlayerScore()); // 3 + 2 + 10 bonus
        assertTrue(game.isGameOver());
    }

    @Test
    public void testSetterMethods() {
        game.setPlayerName("NewName");
        assertEquals("NewName", game.getPlayerName());

        game.setPlayerScore(10);
        assertEquals(10, game.getPlayerScore());

        game.setPlayerPosition(3);
        assertEquals(3, game.getPlayerPosition());

        game.setEnemyPosition(4);
        assertEquals(4, game.getEnemyPosition());

        game.setGameOver(true);
        assertTrue(game.isGameOver());
    }

    @Test
    public void testMovePlayerNoMove() {
        game.movePlayer(0);
        assertEquals(0, game.getPlayerPosition());
        assertEquals(0, game.getPlayerScore());
        assertFalse(game.isGameOver());
    }

    @Test
    public void testMovePlayerNegativeMove() {
        game.movePlayer(-3);
        assertEquals(-3, game.getPlayerPosition());
        assertEquals(3, game.getPlayerScore()); // Score should be positive
        assertFalse(game.isGameOver());
    }

    @Test
    public void testMovePlayerLargePositiveMove() {
        game.movePlayer(10);
        assertEquals(10, game.getPlayerPosition());
        assertEquals(10, game.getPlayerScore());
        assertFalse(game.isGameOver());
    }

    @Test
    public void testMovePlayerReachEnemyAfterNegativeMove() {
        game.movePlayer(-2);
        game.movePlayer(7); // Moves from -2 to 5
        assertEquals(5, game.getPlayerPosition());
        assertEquals(19, game.getPlayerScore()); // 2 + 7 + 10 bonus
        assertTrue(game.isGameOver());
    }

    @Test
    public void testPerformanceOnLargeMovements() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            game.movePlayer(1);
        }
        long duration = System.currentTimeMillis() - start;
        System.out.println("Performance test duration: " + duration + "ms");
        assertTrue("Performance could be improved", duration < 1000);
    }
}