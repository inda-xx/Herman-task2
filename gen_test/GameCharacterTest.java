package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameCharacterTest {

    private GameCharacter character;

    @Before
    public void setUp() {
        character = new GameCharacter("Hero", 100, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", character.getName());
    }

    @Test
    public void testSetName() {
        character.setName("Warrior");
        assertEquals("Warrior", character.getName());
    }

    @Test
    public void testInitialHealth() {
        assertEquals(100, character.getHealth());
    }

    @Test
    public void testSetHealthWithinLimit() {
        character.setHealth(80);
        assertEquals(80, character.getHealth());
        assertTrue(character.isAlive());
    }

    @Test
    public void testSetHealthBelowZero() {
        character.setHealth(-10);
        assertEquals(0, character.getHealth());
        assertFalse(character.isAlive());
    }

    @Test
    public void testSetPosition() {
        character.setPosition(5);
        assertEquals(5, character.getPosition());
    }

    @Test
    public void testIsAliveTrueInitially() {
        assertTrue(character.isAlive());
    }

    @Test
    public void testReceiveDamageLessThanHealth() {
        character.receiveDamage(10);
        assertEquals(90, character.getHealth());
        assertTrue(character.isAlive());
    }

    @Test
    public void testReceiveDamageMoreThanHealth() {
        character.receiveDamage(110);
        assertEquals(0, character.getHealth());
        assertFalse(character.isAlive());
    }

    @Test
    public void testMoveWhenAlive() {
        character.move(10);
        assertEquals(10, character.getPosition());
    }

    @Test
    public void testMoveWhenNotAlive() {
        character.receiveDamage(100);
        character.move(10);
        assertEquals(0, character.getPosition()); // Position should not change
    }

    @Test
    public void testAliveStatusAfterDamage() {
        character.receiveDamage(99);
        assertTrue(character.isAlive());
        character.receiveDamage(1);
        assertFalse(character.isAlive());
    }

    @Test
    public void testAliveStatusResiliency() {
        character.receiveDamage(50);
        assertTrue(character.isAlive());
        character.receiveDamage(50);
        assertFalse(character.isAlive());
    }

    @Test
    public void testMultipleMoves() {
        character.move(5);
        character.move(10);
        assertEquals(15, character.getPosition());
    }

    @Test
    public void testReceiveDamageCumulativeEffect() {
        character.receiveDamage(50);
        character.receiveDamage(25);
        assertEquals(25, character.getHealth());
        assertTrue(character.isAlive());
    }
}

```

The above code includes comprehensive unit tests for the `VariableExample` and `GameCharacter` classes based on the original 