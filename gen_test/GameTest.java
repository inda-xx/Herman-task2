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
    public void testInitialPlayerPosition() {
        Player player = getPlayer();
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testInitialEnemyPosition() {
        Enemy enemy = getEnemy();
        assertEquals(1, enemy.getX());
        assertEquals(1, enemy.getY());
    }
    
    // Assuming getter methods for player and enemy are available
    private Player getPlayer() {
        // This method assumes you have a way in your game 