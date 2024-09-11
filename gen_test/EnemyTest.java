package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 100, 3, 3);
        player = new Player("Hero");
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
    public void testGetHealth() {
        assertEquals(100, enemy.getHealth());
    }

    @Test
    public void testSetHealth() {
        enemy.setHealth(80);
        assertEquals(80, enemy.getHealth());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(3, enemy.getPositionX());
    }

    @Test
    public void testSetPositionX() {
        enemy.setPositionX(5);
        assertEquals(5, enemy.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(3, enemy.getPositionY());
    }

    @Test
    public void testSetPositionY() {
        enemy.setPositionY(7);
        assertEquals(7, enemy.getPositionY());
    }

    @Test
    public void testEncounter() {
        player.setScore(50);
        enemy.encounter(player);
        assertEquals(40, player.getScore());
    }
}

// PlayerTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 