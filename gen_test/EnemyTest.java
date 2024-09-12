package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5, 5, 3);
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(5, enemy.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testGetDamageValue() {
        assertEquals(3, enemy.getDamageValue());
    }

    @Test
    public void testSetType() {
        enemy.setType("Troll");
        assertEquals("Troll", enemy.getType());
    }

    @Test
    public void testSetPositionX() {
        enemy.setPositionX(10);
        assertEquals(10, enemy.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        enemy.setPositionY(15);
        assertEquals(15, enemy.getPositionY());
    }

    @Test
    public void testSetDamageValue() {
        enemy.setDamageValue(7);
        assertEquals(7, enemy.getDamageValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionX() {
        enemy.setPositionX(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionY() {
        enemy.setPositionY(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDamageValue() {
        enemy.setDamageValue(-5);
    }
}