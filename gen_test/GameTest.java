package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 0, 0, 0);
        enemy = new Enemy("TestEnemy", 5, 5);
    }

    @Test
    public void testPlayerConstructor() {
        assertEquals("TestPlayer", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testEnemyConstructor() {
        assertEquals("TestEnemy", enemy.getType());
        assertEquals(5, enemy.getXPosition());
        assertEquals(5, enemy.getYPosition());
    }

    @Test
    public void testPlayerSetName() {
        player.setName("NewPlayer");
        assertEquals("NewPlayer", player.getName());
    }

    @Test
    public void testPlayerSetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    @Test
    public void testPlayerSetXPosition() {
        player.setXPosition(3);
        assertEquals(3, player.getXPosition());
    }

    @Test
    public void testPlayerSetYPosition() {
        player.setYPosition(4);
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testPlayerMove() {
        player.move(6, 7);
        assertEquals(6, player.getXPosition());
        assertEquals(7, player.getYPosition());
    }

    @Test
    public void testPlayerIncreaseScore() {
        player.increaseScore(20);
        assertEquals(20, player.getScore());
    }

    @Test
    public void testPlayerAttack() {
        int oldScore = player.getScore();
        player.attack(enemy);
        assertTrue(player.getScore() > oldScore);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnemyConstruction() {
        new Enemy(null, -1, -1);
    }

    @Test
    public void testAttackRandomness() {
        int initialScore = player.getScore();
        player.attack(enemy);
        int newScore = player.getScore();
        assertTrue(newScore >= initialScore + 1 && newScore <= initialScore + 10);
    }

    @Test(timeout = 1000)
    public void testPerformanceOfMove() {
        for (int i = 0; i < 1_000_000; i++) {
            player.move(i, i);
        }
    }
} 

package main;

public 