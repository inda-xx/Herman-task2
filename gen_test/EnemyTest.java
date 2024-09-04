package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy goblin;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 5, 5);
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", goblin.getEnemyType());
        assertEquals(5, goblin.getXPosition());
        assertEquals(5, goblin.getYPosition());
    }

    @Test
    public void testEnemySetters() {
        goblin.setEnemyType("Orc");
        assertEquals("Orc", goblin.getEnemyType());

        goblin.setXPosition(7);
        assertEquals(7, goblin.getXPosition());

        goblin.setYPosition(8);
        assertEquals(8, goblin.getYPosition());
    }
}

// Note: Ensure all 