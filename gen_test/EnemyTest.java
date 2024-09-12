package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Zombie", 15);
    }

    @Test
    public void testInitialEnemyState() {
        assertEquals("Zombie", enemy.getType());
        assertEquals(15, enemy.getDamage());
    }

    @Test
    public void testSetEnemyType() {
        enemy.setType("Vampire");
        assertEquals("Vampire", enemy.getType());
    }

    @Test
    public void testSetEnemyDamage() {
        enemy.setDamage(25);
        assertEquals(25, enemy.getDamage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeDamage() {
        enemy.setDamage(-5); // Expecting an exception
    }

    @Test
    public void testZeroDamage() {
        enemy.setDamage(0);
        assertEquals(0, enemy.getDamage());
    }

    @Test
    public void testMaxDamage() {
        // Assuming there's some logical maximum for damage
        int maxDamage = Integer.MAX_VALUE;
        enemy.setDamage(maxDamage);
        assertEquals(maxDamage, enemy.getDamage());
    }
}

// Note: The main package should contain Enemy.java and Player.java classes
// It is assumed that IllegalArgumentException is thrown in setters for negative values, which must be implemented in the main classes.