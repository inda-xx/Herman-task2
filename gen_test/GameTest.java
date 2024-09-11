package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Bee");
        enemy = new Enemy("Wasp", 8);
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testEnemyInitialPosition() {
        assertEquals(5, enemy.getPositionX());
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testPlayerMove() {
        player.move(1, 1);
        assertEquals(1, player.getPositionX());
        assertEquals(1, player.getPositionY());
        assertEquals(1, player.getScore());
    }

    @Test
    public void testPlayerMoveNegative() {
        player.move(-1, -1);
        assertEquals(-1, player.getPositionX());
        assertEquals(-1, player.getPositionY());
        assertEquals(1, player.getScore());
    }

    @Test
    public void testPlayerInteractWithEnemyNoEncounter() {
        player.move(1, 1); // Move once, no encounter expected
        player.interactWithEnemy(enemy);
        assertEquals(1, player.getScore()); // Score should remain the same
    }

    @Test
    public void testPlayerInteractWithEnemyEncounter() {
        player.setPositionX(5);
        player.setPositionY(5);
        player.interactWithEnemy(enemy);
        assertEquals(-8, player.getScore());
    }

    @Test
    public void testPlayerNameSetterGetter() {
        player.setPlayerName("Buzz");
        assertEquals("Buzz", player.getPlayerName());
    }

    @Test
    public void testEnemyNameSetterGetter() {
        enemy.setEnemyName("Bee Killer");
        assertEquals("Bee Killer", enemy.getEnemyName());
    }

    @Test
    public void testEnemyStrengthSetterGetter() {
        enemy.setStrength(10);
        assertEquals(10, enemy.getStrength());
    }

    @Test
    public void testEnemyPositionSetterGetter() {
        enemy.setPositionX(3);
        enemy.setPositionY(4);
        assertEquals(3, enemy.getPositionX());
        assertEquals(4, enemy.getPositionY());
    }

    @Test
    public void testPlayerScoreSetterGetter() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testPerformanceWithManyMoves() {
        for (int i = 0; i < 1000; i++) {
            player.move(1, 1);
        }
        assertEquals(1000, player.getScore()); // Ensure score increments correctly
        assertEquals(1000, player.getPositionX());
        assertEquals(1000, player.getPositionY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnemyStrength() {
        enemy.setStrength(-1); // Expect exception on invalid strength
    }
}