package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameEntitiesTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, 0, 0);
        enemy = new Enemy("Villain", 50, 5, 5);
    }

    @Test
    public void testPlayerInitialAttributes() {
        assertEquals("Hero", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testEnemyInitialAttributes() {
        assertEquals("Villain", enemy.getName());
        assertEquals(50, enemy.getHealth());
        assertEquals(5, enemy.getX());
        assertEquals(5, enemy.getY());
    }

    @Test
    public void testPlayerMove() {
        player.move(3, 4);
        assertEquals(3, player.getX());
        assertEquals(4, player.getY());
    }

    @Test
    public void testPlayerNameChange() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testEnemyNameChange() {
        enemy.setName("Berserker");
        assertEquals("Berserker", enemy.getName());
    }

    @Test
    public void testPlayerHealthChange() {
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testEnemyHealthChange() {
        enemy.setHealth(40);
        assertEquals(40, enemy.getHealth());
    }

    @Test
    public void testEnemyAttackPlayer() {
        enemy.attack(player);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testEnemyAttackReducesPlayerHealth() {
        int initialHealth = player.getHealth();
        enemy.attack(player);
        assertEquals(initialHealth - 10, player.getHealth());
    }

    @Test
    public void testAttackOnPlayerWithLowHealth() {
        player.setHealth(5);
        enemy.attack(player);
        assertEquals(-5, player.getHealth());
    }

    @Test
    public void testEnemyPositionChange() {
        enemy.setX(10);
        enemy.setY(10);
        assertEquals(10, enemy.getX());
        assertEquals(10, enemy.getY());
    }

    @Test
    public void testPlayerBoundaryMove() {
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getX());
        assertEquals(Integer.MAX_VALUE, player.getY());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHealthForPlayer() {
        player.setHealth(-10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHealthForEnemy() {
        enemy.setHealth(-20);
    }
    
    @Test(timeout = 1000)
    public void testPerformanceAttack() {
        for (int i = 0; i < 1000000; i++) {
            enemy.attack(player);
        }
    }
}