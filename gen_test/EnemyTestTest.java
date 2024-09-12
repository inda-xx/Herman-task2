package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5);
        player = new Player("Hero", 10, 10);
    }

    @Test
    public void testGetEnemyName() {
        assertEquals("Goblin", enemy.getEnemyName());
    }

    @Test
    public void testSetEnemyName() {
        enemy.setEnemyName("Orc");
        assertEquals("Orc", enemy.getEnemyName());
    }

    @Test
    public void testGetDamagePoints() {
        assertEquals(5, enemy.getDamagePoints());
    }

    @Test
    public void testSetDamagePointsValid() {
        enemy.setDamagePoints(10);
        assertEquals(10, enemy.getDamagePoints());
    }

    @Test(expected = IllegalArgumentException.