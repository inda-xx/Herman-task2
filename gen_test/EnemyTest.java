package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy(1, 1);
        player = new Player(1, 1);
    }

    @Test
    public void testInitialPosition() {
        assertEquals(1, enemy.getX());
        assertEquals(1, enemy.getY());
    }

    @Test
    public void testSetX() {
        enemy.setX(3);
        assertEquals(3, enemy.getX());
    }

    @Test
    public void testSetY() {
        enemy.setY(3);
        assertEquals(3, enemy.getY());
    }

    @Test
    public void testInteractWithPlayer_PlayerSamePosition() {
        player.setScore(10);
        enemy.interactWithPlayer(player);
        assertEquals(9, player.getScore()); // Score should decrease
    }

    @Test
    public void testInteractWithPlayer_PlayerDifferentPosition() {
        player.setX(0);
        player.setY(0);
        player.setScore(10);
        enemy.interactWithPlayer(player);
        assertEquals(10, player.getScore()); // Score should remain same
    }
}

// GameTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 