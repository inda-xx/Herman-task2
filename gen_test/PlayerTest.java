package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("John", 0, 0);
        enemy = new Enemy(3, 2);
    }

    @Test
    public void testInitialPlayerState() {
        assertEquals("John", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testPlayerMovement() {
        player.move(1, 1);
        assertEquals(1, player.getXPosition());
        assertEquals(1, player.getYPosition());
        
        player.move(-1, -1);
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPlayerInvalidMovement() {
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test
    public void testScoreModification() {
        player.addScore(50);
        assertEquals(50, player.getScore());

        player.addScore(-10);
        assertEquals(40, player.getScore());
    }

    @Test
    public void testEnemyChallengeReducesScore() {
        int initialScore = player.getScore();
        enemy.challenge(player);
        assertEquals(initialScore - 10, player.getScore());
    }

    @Test
    public void testEnemyChallengeLogsCorrectMessage() {
        // Capture console output to validate
        // Note: Implementing console output tests is important
    }

    @Test
    public void testBoundaryConditions() {
        player.move(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, player.getXPosition());
        assertEquals(Integer.MIN_VALUE, player.getYPosition());

        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(-1, player.getXPosition());
        assertEquals(-1, player.getYPosition());
    }
}

// EnemyTest.java
package test;

import main.Player;
import main.Enemy;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 