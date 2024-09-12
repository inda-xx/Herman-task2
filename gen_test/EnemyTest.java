package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 100, 10, 10);
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testSetType() {
        enemy.setType("Orc");
        assertEquals("Orc", enemy.getType());
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
    public void testGetXPosition() {
        assertEquals(10, enemy.getXPosition());
    }

    @Test
    public void testSetXPosition() {
        enemy.setXPosition(15);
        assertEquals(15, enemy.getXPosition());
    }

    @Test
    public void testGetYPosition() {
        assertEquals(10, enemy.getYPosition());
    }

    @Test
    public void testSetYPosition() {
        enemy.setYPosition(20);
        assertEquals(20, enemy.getYPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeHealth() {
        enemy.setHealth(-10);
    }

    @Test
    public void testPrintInfo() {
        enemy.printInfo(); // This can be manually verified for correct output if needed
    }
}

// File: PlayerTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 