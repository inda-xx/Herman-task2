package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("John", 0, 0);
        enemy = new Enemy(3, 2);
    }

    @Test
    public void testEnemySetup() {
        assertNotNull(enemy);
    }

    @Test
    public void testEnemyChallengeInteraction() {
        int initialScore = player.getScore();
        enemy.challenge(player);
        assertEquals(initialScore - 10, player.getScore());
    }

    @Test
    public void testEnemyChallengeOutput() {
        // Test for correct print output
    }
}

// Main Java Files
// File: Player.java
package main;

public 