package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0);
        enemy = new Enemy("Goblin", 5, 10);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(5, enemy.getPosition());
        assertEquals(10, enemy.getAttackPower());
    }
    
    @Test
    public void testSetPosition() {
        enemy.setPosition(3);
        assertEquals(3, enemy.getPosition());
    }

    @Test
    public void testInteractWithPlayer_AtSamePosition() {
        player.setPosition(5);
        enemy.interact(player);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testInteractWithPlayer_AtDifferentPosition() {
        player.setPosition(3);
        int initialScore = player.getScore();
        enemy.interact(player);
        assertEquals(initialScore, player.getScore());
    }

    @Test
    public void testPrintingEnemyStatus() {
        enemy.printStatus(); // manual inspection of printed output might be required
    }
}

public 