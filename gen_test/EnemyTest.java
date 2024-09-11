package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy(7, 7);
        player = new Player("Hero", 100, 5, 5); // Start with score 100 for testing purposes
    }

    @Test
    public void testEnemyInitialPosition() {
        assertEquals(7, enemy.getPositionX());
        assertEquals(7, enemy.getPositionY());
    }

    @Test
    public void testSetPositionX() {
        enemy.setPositionX(8);
        assertEquals(8, enemy.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        enemy.setPositionY(9);
        assertEquals(9, enemy.getPositionY());
    }

    @Test
    public void testInteractWithPlayerReducesScore() {
        enemy.interact(player);
        assertEquals(90, player.getScore()); // Score should be reduced by 10
    }
    
    @Test
    public void testPlayerInitialPosition() {
        assertEquals(5, player.getPositionX());
        assertEquals(5, player.getPositionY());
    }

    @Test
    public void testChangePlayerPosition() {
        player.setPositionX(10);
        player.setPositionY(10);
        assertEquals(10, player.getPositionX());
        assertEquals(10, player.getPositionY());
    }

    @Test
    public void testIncreasePlayerScore() {
        player.increaseScore(20);
        assertEquals(120, player.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerConstructor() {
        Player invalidPlayer = new Player(null, 0, 0, 0);
        invalidPlayer.getPlayerName();
    }

    // Additional edge cases like negative score, extreme coordinates
    @Test
    public void testNegativeScoreHandling() {
        player.setScore(-10);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testBoundaryPlayerMovement() {
        player.setPositionX(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getPositionX());
        player.setPositionX(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, player.getPositionX());
    }
    
    @Test(timeout = 1000)
    public void testPerformance() {
        for (int i = 0; i < 10000; i++) {
            player.increaseScore(1);
        }
    }
}