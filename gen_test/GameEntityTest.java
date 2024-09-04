package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameEntityTest {
    
    private GameEntity entity;

    @Before
    public void setUp() {
        entity = new GameEntity("Hero", 0, 0, 0, true);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", entity.getName());
    }

    @Test
    public void testSetName() {
        entity.setName("Warrior");
        assertEquals("Warrior", entity.getName());
    }

    @Test
    public void testGetX() {
        assertEquals(0, entity.getX());
    }

    @Test
    public void testSetX() {
        entity.setX(10);
        assertEquals(10, entity.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(0, entity.getY());
    }

    @Test
    public void testSetY() {
        entity.setY(20);
        assertEquals(20, entity.getY());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, entity.getScore());
    }

    @Test
    public void testSetScore() {
        entity.setScore(40);
        assertEquals(40, entity.getScore());
    }

    @Test
    public void testIsAlive() {
        assertTrue(entity.isAlive());
    }

    @Test
    public void testSetAlive() {
        entity.setAlive(false);
        assertFalse(entity.isAlive());
    }

    @Test
    public void testMove() {
        entity.move(15, 25);
        assertEquals(15, entity.getX());
        assertEquals(25, entity.getY());
    }

    @Test
    public void testAddScore() {
        entity.addScore(10);
        assertEquals(10, entity.getScore());
        entity.addScore(5);
        assertEquals(15, entity.getScore());
    }

    @Test
    public void testPrintStatus() {
        // This test simply calls printStatus to check for any exceptions/errors during execution.
        // As we can't easily capture console output in JUnit 4 without additional libraries, 
        // this is a basic sanity check.
        entity.printStatus();
    }

    @Test
    public void testNegativeAndBoundaryConditions() {
        entity.setScore(-10);
        assertTrue(entity.getScore() < 0);

        entity.move(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, entity.getX());
        assertEquals(Integer.MIN_VALUE, entity.getY());

        entity.setX(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, entity.getX());
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameToNull() {
        entity.setName(null);
        assertNull(entity.getName());
    }

}