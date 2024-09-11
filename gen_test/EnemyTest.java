package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy(100);
        player = new Player("Hero", 50, 0, 0);
    }

    @Test
    public void testInitialHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testSetHealth() {
        enemy.setHealth(150);
        assertEquals(150, enemy.getHealth());
    }

    @Test
    public void testInteract() {
        enemy.interact(player);
        assertEquals(55, player.getScore()); // Score should increase by 5 after interaction
    }
}