package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 1, 1);
    }

    @Test
    public void testInitialEnemyPosition() {
        assertEquals(1, enemy.getPositionX());
        assertEquals(1, enemy.getPositionY());
    }

    @Test
    public void testEnemyType() {
        assertEquals("Goblin", enemy.getType());
    }
}