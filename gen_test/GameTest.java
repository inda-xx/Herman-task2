package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
        enemy = new Enemy("Goblin", 2, 2);
    }

    @Test
    public void testPlayerInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerMoveUp() {
        player.move("up");
        assertEquals(0, player.getPositionX());
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testPlayerMoveDown() {
        player.move("down");
        assertEquals(0, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testPlayerMoveLeft() {
        player.move("left");
        assertEquals(-1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerMoveRight() {
        player.move("right");
        assertEquals(1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testPlayerIncreaseScore() {
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEnemyInitialPosition() {
        assertEquals(2, enemy.getPositionX());
        assertEquals(2, enemy.getPositionY());
    }

    @Test
    public void testEncounterWithEnemy() {
        player.setPositionX(2);
        player.setPositionY(2);
        Game.checkForEnemies(player, enemy);  // Add logic in Game for testability
        // Normally we would validate the output, but we need to restructure
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlayerMoveInvalidDirection() {
        player.move("diagonal");
    }

    @Test
    public void testGameMainLoopExit() {
        String simulatedInput = "exit\n";
        InputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);
        Game.main(new String[]{});
        // Validate that the game loop exits cleanly, or output checks
    }

    @Test
    public void testCheckpointScoreIncrease() {
        player.setPositionX(1);
        player.setPositionY(1);
        Game.printGameState(player, enemy);
        assertEquals(10, player.getScore());  // Ensure method interaction increases score
    }

    @After
    public void tearDown() {
        // Clean up resources if necessary
    }
}