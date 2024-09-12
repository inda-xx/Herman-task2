package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 20, 0, 0);
        enemy = new Enemy("Villain", 50, 10);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(20, player.getStrength());
        player.move("north");
        assertEquals(1, player.getY());
        assertEquals(0, player.getX());
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Villain", enemy.getName());
        assertEquals(50, enemy.getHealth());
        assertEquals(10, enemy.getStrength());
    }

    @Test
    public void testPlayerMoveNorth() {
        player.move("north");
        assertEquals(1, player.getY());
    }

    @Test
    public void testPlayerMoveSouth() {
        player.move("south");
        assertEquals(-1, player.getY());
    }

    @Test
    public void testPlayerMoveEast() {
        player.move("east");
        assertEquals(1, player.getX());
    }

    @Test
    public void testPlayerMoveWest() {
        player.move("west");
        assertEquals(-1, player.getX());
    }

    @Test
    public void testPlayerMoveInvalid() {
        player.move("upwards");
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testPlayerAttack() {
        player.attack(enemy);
        assertEquals(40, enemy.getHealth());
    }

    @Test
    public void testPlayerAttackFails() {
        Player weakPlayer = new Player("Weakling", 100, 5, 0, 0);
        weakPlayer.attack(enemy);
        assertEquals(50, enemy.getHealth());
    }

    @Test
    public void testSetPlayerHealth() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testSetEnemyHealth() {
        enemy.setHealth(30);
        assertEquals(30, enemy.getHealth());
    }

    @Test
    public void testNegativeHealthForPlayer() {
        player.setHealth(-10);
        assertEquals(-10, player.getHealth());
    }

    @Test
    public void testNegativeHealthForEnemy() {
        enemy.setHealth(-20);
        assertEquals(-20, enemy.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void testEnemyNameNull() {
        Enemy nullNamedEnemy = new Enemy(null, 50, 10);
        assertNull(nullNamedEnemy.getName());
    }
}