package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    private Player player;
    private Enemy enemy1;
    private Enemy enemy2;
    private Game game;

    @Before
    public void setUp() {
        player = new Player("Explorer", 0, 0, 0);
        enemy1 = new Enemy("Goblin", 0, 0);
        enemy2 = new Enemy("Orc", 2, 3);
        game = new Game(player);
    }

    @Test
    public void testInitialPlayerSetup() {
        assertEquals("Explorer", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testAddEnemy() {
        game.addEnemy(enemy1);
        game.addEnemy(enemy2);
        // Assuming the Game 