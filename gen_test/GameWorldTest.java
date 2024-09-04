package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameWorldTest {

    private GameWorld gameWorld;
    private Player player;
    private Enemy[] enemies;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, new Position(0, 0));
        Enemy goblin = new Enemy("Goblin", 50, new Position(5, 5));
        enemies = new Enemy[] { goblin };
        gameWorld = new GameWorld(player, enemies);
    }

    @Test
    public void testGetPlayer() {
        assertEquals("Hero", gameWorld.getPlayer().getName());
    }

    @Test
    public void testStartGame() {
        gameWorld.startGame();
        // After startGame, the player is expected to move to (1, 1)
        assertEquals(1, player.getPosition().getX());
        assertEquals(1, player.getPosition().getY());
        // The player's health should be 90 after attack by one goblin
        assertEquals(90, player.getHealth());
    }
}
```

Each of these test classes tests their respective 