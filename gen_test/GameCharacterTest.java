package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameCharacterTest {
    private GameCharacter gameCharacter;

    @Before
    public void setUp() {
        gameCharacter = new GameCharacter("Hero", 0, 0, 0, true);
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Hero", gameCharacter.getName());
        assertEquals(0, gameCharacter.getXPosition());
        assertEquals(0, gameCharacter.getYPosition());
        assertEquals(0, gameCharacter.getScore());
        assertTrue(gameCharacter.isAlive());
    }

    @Test
    public void testSetName() {
        gameCharacter.setName("Warrior");
        assertEquals("Warrior", gameCharacter.getName());
    }

    @Test
    public void testSetXPosition() {
        gameCharacter.setXPosition(10);
        assertEquals(10, gameCharacter.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        gameCharacter.setYPosition(20);
        assertEquals(20, gameCharacter.getYPosition());
    }

    @Test
    public void testSetScore() {
        gameCharacter.setScore(100);
        assertEquals(100, gameCharacter.getScore());
    }

    @Test
    public void testSetIsAlive() {
        gameCharacter.setIsAlive(false);
        assertFalse(gameCharacter.isAlive());
    }

    @Test
    public void testMoveFunction() {
        gameCharacter.move(5, 5);
        assertEquals(5, gameCharacter.getXPosition());
        assertEquals(5, gameCharacter.getYPosition());
    }

    @Test
    public void testMoveToNegativePosition() {
        gameCharacter.move(-5, -5);
        assertEquals(-5, gameCharacter.getXPosition());
        assertEquals(-5, gameCharacter.getYPosition());
    }

    @Test
    public void testEncounterEnemy() {
        gameCharacter.encounterEnemy();
        assertEquals(10, gameCharacter.getScore());
        assertFalse(gameCharacter.isAlive());
    }

    @Test
    public void testMultipleEncounters() {
        gameCharacter.encounterEnemy();
        gameCharacter.encounterEnemy();
        assertEquals(20, gameCharacter.getScore());
        assertFalse(gameCharacter.isAlive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNameSet() {
        gameCharacter.setName(null);
    }

    @Test
    public void testBoundaryConditionXPosition() {
        gameCharacter.setXPosition(Integer.MAX_VALUE);
        gameCharacter.move(1, 0);
        assertTrue(gameCharacter.getXPosition() > 0); // Depending on the implementation, if overflow is handled, check accordingly

        gameCharacter.setXPosition(Integer.MIN_VALUE);
        gameCharacter.move(-1, 0);
        assertTrue(gameCharacter.getXPosition() < 0); // Depending on the implementation, if underflow is handled, check accordingly
    }

    @Test
    public void testBoundaryConditionYPosition() {
        gameCharacter.setYPosition(Integer.MAX_VALUE);
        gameCharacter.move(0, 1);
        assertTrue(gameCharacter.getYPosition() > 0); // Depending on the implementation, if overflow is handled, check accordingly

        gameCharacter.setYPosition(Integer.MIN_VALUE);
        gameCharacter.move(0, -1);
        assertTrue(gameCharacter.getYPosition() < 0); // Depending on the implementation, if underflow is handled, check accordingly
    }
}