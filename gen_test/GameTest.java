package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void testInitialGameState() {
        // Ensure initial player position
        Player player = game.getPlayer();
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
        
        // Ensure initial score is zero
        assertEquals(0, game.getScore());
        
        // Ensure enemies are correctly initialized
        Enemy[] enemies = game.getEnemies();
        assertEquals(5, enemies.length);
        for (int i = 0; i < enemies.length; i++) {
            assertEquals("Goblin", enemies[i].getType());
            assertEquals(i, enemies[i].getX());
            assertEquals(i + 1, enemies[i].getY());
            assertEquals(10, enemies[i].getHealth());
        }
    }

    @Test
    public void testPlayerMovement() {
        game.getPlayer().move(5, 5);
        
        Player player = game.getPlayer();
        assertEquals(5, player.getX());
        assertEquals(5, player.getY());
    }

    @Test
    public void testIncreaseScore() {
        game.increaseScore(10);
        assertEquals(10, game.getScore());
        
        game.increaseScore(5);
        assertEquals(15, game.getScore());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncreaseScoreNegativePoints() {
        game.increaseScore(-5); // Assuming the increaseScore method should not accept negative points
    }

    @Test
    public void testEnemyInteraction() {
        Player player = game.getPlayer();
        for (Enemy enemy : game.getEnemies()) {
            enemy.interact(player);
            // Assuming no state change, just check interaction
            assertEquals(10, enemy.getHealth());
        }
    }

    @Test
    public void testEnemyHealthModification() {
        Enemy enemy = game.getEnemies()[0];
        enemy.setHealth(5);
        assertEquals(5, enemy.getHealth());
        
        enemy.setHealth(0);
        assertEquals(0, enemy.getHealth());
    }
    
    // Additional boundary test example
    @Test
    public void testPlayerMoveBoundary() {
        Player player = game.getPlayer();
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getX());
        assertEquals(Integer.MAX_VALUE, player.getY());
    }
}

// Game.java modifications to accommodate testing

package original;

public 