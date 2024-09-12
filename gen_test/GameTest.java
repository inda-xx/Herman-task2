package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private ArrayList<Enemy> enemies;

    @Before
    public void setUp() {
        // Initialize player with position (0, 0)
        player = new Player("Hero", 0, 0);
        // Initialize enemies list
        enemies = new ArrayList<>();
    }

    @Test
    public void testPlayerMovementUp() {
        player.move("up");
        assertEquals(1, player.getPositionY());
    }
    
    @Test
    public void testPlayerMovementDown() {
        player.move("down");
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testPlayerMovementLeft() {
        player.move("left");
        assertEquals(-1, player.getPositionX());
    }

    @Test
    public void testPlayerMovementRight() {
        player.move("right");
        assertEquals(1, player.getPositionX());
    }

    @Test
    public void testPlayerInvalidMovement() {
        player.move("diagonal");
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testEnemyInteractionPlayerSamePosition() {
        Enemy enemy = new Enemy(0, 0);
        enemies.add(enemy);
        enemy.interact(player);
        assertEquals(-1, player.getScore());
    }

    @Test
    public void testEnemyInteractionPlayerDifferentPosition() {
        Enemy enemy = new Enemy(1, 0);
        enemies.add(enemy);
        enemy.interact(player);
        assertEquals(0, player.getScore()); // Score should remain the same
    }

    @Test
    public void testGamePlay() {
        enemies.add(new Enemy(1, 0));
        Game game = new Game(player, enemies);

        game.play();

        // Check if player's score decreased due to enemy interaction
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertEquals(-1, player.getScore());
    }

    @Test
    public void testMultipleEnemiesHandling() {
        enemies.add(new Enemy(1, 0));
        enemies.add(new Enemy(1, 1));
        player.move("right"); // Move player to (1, 0)

        for (Enemy enemy : enemies) {
            enemy.interact(player);
        }
        
        // Player should only interact with the first enemy
        assertEquals(-1, player.getScore());
    }

    @Test
    public void testBoundaryConditions() {
        // Maximum integer positions
        player.setPositionX(Integer.MAX_VALUE);
        player.move("right"); // Test boundary overflow if not handled
        assertEquals(Integer.MAX_VALUE + 1, player.getPositionX());

        player.setPositionY(Integer.MAX_VALUE);
        player.move("up");
        assertEquals(Integer.MAX_VALUE + 1, player.getPositionY());
    }

    @Test
    public void testBoundaryConditionsNegative() {
        // Minimum integer positions
        player.setPositionX(Integer.MIN_VALUE);
        player.move("left");
        assertEquals(Integer.MIN_VALUE - 1, player.getPositionX());

        player.setPositionY(Integer.MIN_VALUE);
        player.move("down");
        assertEquals(Integer.MIN_VALUE - 1, player.getPositionY());
    }

    @Test
    public void testNullPlayerInGame() {
        try {
            Game gameWithNullPlayer = new Game(null, enemies);
            gameWithNullPlayer.play();
            fail("Should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void testNullPointerForEnemies() {
        try {
            Game gameWithNullEnemies = new Game(player, null);
            gameWithNullEnemies.play();
            fail("Should have thrown a NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}