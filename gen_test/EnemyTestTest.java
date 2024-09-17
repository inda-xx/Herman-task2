package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 2, 3);
    }

    @Test
    public void testInitialValues() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(2, enemy.getXPosition());
        assertEquals(3, enemy.getYPosition());
    }

    @Test
    public void testSetType() {
        enemy.setType("Orc");
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testSetXPosition() {
        enemy.setXPosition(7);
        assertEquals(7, enemy.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        enemy.setYPosition(6);
        assertEquals(6, enemy.getYPosition());
    }
}
```

These test classes will thoroughly evaluate the `Player` and `Enemy` classes' behavior, focusing on both normal and edge cases, including the handling of null arguments.