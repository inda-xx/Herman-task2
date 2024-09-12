package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy1;
    private Enemy enemy2;

    @Before
    public void setUp() {
        enemy1 = new Enemy("Goblin", 100);
        enemy2 = new Enemy("Troll", 200);
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", enemy1.getType());
        assertEquals("Troll", enemy2.getType());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, enemy1.getHealth());
        assertEquals(200, enemy2.getHealth());
    }

    @Test
    public void testIsDefeated() {
        assertFalse(enemy1.isDefeated());
        assertFalse(enemy2.isDefeated());
    }

    @Test
    public void testSetType() {
        enemy1.setType("Orc");
        assertEquals("Orc", enemy1.getType());
    }

    @Test
    public void testSetHealth() {
        enemy1.setHealth(150);
        assertEquals(150, enemy1.getHealth());
    }

    @Test
    public void testSetDefeated() {
        enemy1.setDefeated(true);
        assertTrue(enemy1.isDefeated());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeHealth() {
        enemy1.setHealth(-50);
    }

    @Test
    public void testZeroHealthDefeated() {
        enemy1.setHealth(0);
        enemy1.setDefeated(true);
        assertTrue(enemy1.isDefeated());
    }

    @Test
    public void testMaxHealthBoundary() {
        enemy1.setHealth(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, enemy1.getHealth());
    }

    @Test
    public void testMinHealthBoundary() {
        enemy1.setHealth(Integer.MIN_VALUE + 1);
        assertTrue(enemy1.getHealth() < 0); // Assuming health can be negative for testing
    }
    
    @Test
    public void testPerformanceForSettingHealth() {
        for (int i = 0; i < 1000000; i++) {
            enemy1.setHealth(i);
            assertEquals(i, enemy1.getHealth());
        }
    }
}