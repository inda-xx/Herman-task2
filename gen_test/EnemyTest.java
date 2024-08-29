package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy(10, 20);
    }

    @Test
    public void testGetXPosition() {
        assertEquals(10, enemy.getXPosition());
    }

    @Test
    public void testGetYPosition() {
        assertEquals(20, enemy.getYPosition());
    }

    @Test
    public void testSetXPosition() {
        enemy.setXPosition(15);
        assertEquals(15, enemy.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        enemy.setYPosition(25);
        assertEquals(25, enemy.getYPosition());
    }
}

// PlayerTest.java
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 