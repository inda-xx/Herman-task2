package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameCharacterTest {

    private GameCharacter player;
    private GameCharacter enemy;

    @Before
    public void setUp() {
        player = new GameCharacter("Hero", 100, 0, false);
        enemy = new GameCharacter("Goblin", 30, 10, false);
    }

    @Test
    public void testGetName_ShouldReturnCorrectName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testSetName_ShouldUpdateName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testGetHealth_ShouldReturnCorrectHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testSetHealth_ShouldUpdateHealth() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testGetScore_ShouldReturnCorrectScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore_ShouldUpdateScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testIsHasKey_ShouldReturnFalseInitially() {
        assertFalse(player.isHasKey());
    }

    @Test
    public void testSetHasKey_ShouldUpdateHasKeyState() {
        player.setHasKey(true);
        assertTrue(player.isHasKey());
    }

    @Test
    public void testEncounterEnemy_ShouldDecreaseHealthBy20() {
        player.encounterEnemy(enemy);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testEncounterEnemy_WhenHealthIsLow_ShouldHandleEdgeCase() {
        player.setHealth(15);
        player.encounterEnemy(enemy);
        assertEquals(-5, player.getHealth()); // Health should decrease below zero
    }

    @Test
    public void testEncounterEnemy_WithNegativeHealth_ShouldRetainNegativeValue() {
        player.setHealth(-10);
        player.encounterEnemy(enemy);
        assertEquals(-30, player.getHealth());
    }
    
    @Test
    public void testPrintInfo_ShouldNotThrowException() {
        player.printInfo(); // Ensure no exceptions are thrown for printing
    }
}