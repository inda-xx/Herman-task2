package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class SpaceAdventureTest {
    private Player astronaut;
    private Enemy alien;

    @Before
    public void setUp() {
        astronaut = new Player("Astronaut", 0, 0, 0);
        alien = new Enemy("Alien", 5, 5, true);
    }

    @Test
    public void testPlayerInitialValues() {
        assertEquals("Astronaut", astronaut.getName());
        assertEquals(0, astronaut.getScore());
        assertEquals(0, astronaut.getPositionX());
        assertEquals(0, astronaut.getPositionY());
    }

    @Test
    public void testEnemyInitialValues() {
        assertEquals("Alien", alien.getType());
        assertEquals(5, alien.getPositionX());
        assertEquals(5, alien.getPositionY());
        assertTrue(alien.isAlive());
    }

    @Test
    public void testSetPlayerScore() {
        astronaut.setScore(10);
        assertEquals(10, astronaut.getScore());
    }
    
    @Test
    public void testPlayerMovement() {
        astronaut.moveUp();
        assertEquals(1, astronaut.getPositionY());
        astronaut.moveRight();
        assertEquals(1, astronaut.getPositionX());
        astronaut.moveDown();
        assertEquals(0, astronaut.getPositionY());
        astronaut.moveLeft();
        assertEquals(0, astronaut.getPositionX());
    }

    @Test
    public void testInteractWithEnemyDefeatsIt() {
        Player anotherAstronaut = new Player("Cosmonaut", 0, 5, 5);
        anotherAstronaut.interactWithEnemy(alien);
        assertFalse(alien.isAlive());
    }

    @Test
    public void testEnemySetType() {
        alien.setType("New Alien");
        assertEquals("New Alien", alien.getType());
    }

    @Test
    public void testPlayerSetName() {
        astronaut.setName("NewAstronaut");
        assertEquals("NewAstronaut", astronaut.getName());
    }

    @Test
    public void testPlayerSetPosition() {
        astronaut.setPositionX(3);
        astronaut.setPositionY(7);
        assertEquals(3, astronaut.getPositionX());
        assertEquals(7, astronaut.getPositionY());
    }
}