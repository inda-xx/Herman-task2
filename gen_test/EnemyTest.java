package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Villain", 5);
    }

    @Test
    public void testGetEnemyName() {
        assertEquals("Villain", enemy.getEnemyName());
    }

    @Test
    public void testSetEnemyName() {
        enemy.setEnemyName("Monster");
        assertEquals("Monster", enemy.getEnemyName());
    }

    @Test
    public void testGetDamage() {
        assertEquals(5, enemy.getDamage());
    }

    @Test
    public void testSetDamage() {
        enemy.setDamage(10);
        assertEquals(10, enemy.getDamage());
    }
}

package game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 