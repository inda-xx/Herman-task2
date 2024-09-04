package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Villain", 8, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Villain", enemy.getName());
    }

    @Test
    public void testSetName() {
        enemy.setName("Nemesis");
        assertEquals("Nemesis", enemy.getName());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(8, enemy.getPositionX());
    }

    @Test
    public void testSetPositionX() {
        enemy.setPositionX(10);
        assertEquals(10, enemy.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testSetPositionY() {
        enemy.setPositionY(12);
        assertEquals(12, enemy.getPositionY());
    }
}
```