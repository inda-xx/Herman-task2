package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyPlayerTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5, 5);
        player = new Player("Hero", 0, 0);
    }

    // Tests for the Enemy class

    @Test
    public void testGetEnemyType() {
        assertEquals("Goblin", enemy.getEnemyType());
    }

    @Test
    public void testSetEnemyType() {
        enemy.setEnemyType("Orc");
        assertEquals("Orc", enemy.getEnemyType());
    }

    @Test
    public void testGetPosX() {
        assertEquals(5, enemy.getPosX());
    }

    @Test
    public void testSetPosX() {
        enemy.setPosX(10);
        assertEquals(10, enemy.getPosX());
    }

    @Test
    public void testGetPosY() {
        assertEquals(5, enemy.getPosY());
    }

    @Test
    public void testSetPosY() {
        enemy.setPosY(10);
        assertEquals(10, enemy.getPosY());
    }

    @Test
    public void testEnemyInfoPrinting() {
        // This can be checked manually to see if the console output is correct since System.out.println cannot be captured by assert
        enemy.printEnemyInfo();
    }

    // Tests for the Player class

    @Test
    public void testGetPlayerName() {
        assertEquals("Hero", player.getPlayerName());
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("Villain");
        assertEquals("Villain", player.getPlayerName());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testAddScore() {
        player.addScore(15);
        assertEquals(15, player.getScore());
    }

    @Test
    public void testGetPosX() {
        assertEquals(0, player.getPosX());
    }

    @Test
    public void testSetPosX() {
        player.setPosX(20);
        assertEquals(20, player.getPosX());
    }

    @Test
    public void testGetPosY() {
        assertEquals(0, player.getPosY());
    }

    @Test
    public void testSetPosY() {
        player.setPosY(30);
        assertEquals(30, player.getPosY());
    }

    @Test
    public void testPlayerInfoPrinting() {
        // This can be checked manually to see if the console output is correct since System.out.println cannot be captured by assert
        player.printPlayerInfo();
    }

    @Test
    public void testPlayerEnemyInteraction() {
        player.interact(enemy);
        assertEquals(10, player.getScore());
        // Check if the interaction effect is correctly printed
    }

    @Test(expected = NullPointerException.class)
    public void testPlayerInteractionWithNullEnemy() {
        player.interact(null);
    }
}