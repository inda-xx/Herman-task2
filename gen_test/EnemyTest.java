package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 0, 0, 20);
        player = new Player("Hero");
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(0, enemy.getXPosition());
        assertEquals(0, enemy.getYPosition());
        assertEquals(20, enemy.getDamage());
    }

    @Test
    public void testAttackPlayerInSamePosition() {
        enemy.attack(player);
        assertFalse(player.isAlive());
    }

    @Test
    public void testAttackPlayerInDifferentPosition() {
        player.movePlayer(1, 1);
        enemy.attack(player);
        assertTrue(player.isAlive());
    }

    @Test
    public void testSetGetEnemyName() {
        enemy.setName("Orc");
        assertEquals("Orc", enemy.getName());
    }

    @Test
    public void testSetGetXPosition() {
        enemy.setXPosition(5);
        assertEquals(5, enemy.getXPosition());
    }

    @Test
    public void testSetGetYPosition() {
        enemy.setYPosition(10);
        assertEquals(10, enemy.getYPosition());
    }

    @Test
    public void testSetGetDamage() {
        enemy.setDamage(30);
        assertEquals(30, enemy.getDamage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPosition() {
        enemy.setXPosition(Integer.MAX_VALUE + 1);
    }

    @Test
    public void testPerformanceOfRepeatedAttacks() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            enemy.attack(player);
        }
        long endTime = System.currentTimeMillis();
        assertTrue("Performance test failed", endTime - startTime < 1000);
    }
}

// PlayerTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 