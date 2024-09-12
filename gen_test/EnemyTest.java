package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Orc", 5, 5);
        player = new Player("Hero", 0, 0);
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Orc", enemy.getType());
        assertEquals(5, enemy.getPosX());
        assertEquals(5, enemy.getPosY());
    }

    @Test
    public void testSetType() {
        enemy.setType("Troll");
        assertEquals("Troll", enemy.getType());
    }

    @Test
    public void testSetPosX() {
        enemy.setPosX(10);
        assertEquals(10, enemy.getPosX());
    }

    @Test
    public void testSetPosY() {
        enemy.setPosY(8);
        assertEquals(8, enemy.getPosY());
    }

    @Test
    public void testInteractWhenNotOnSamePosition() {
        player.setPosX(2);
        player.setPosY(3);
        int initialScore = player.getScore();
        enemy.interact(player);
        assertEquals(initialScore, player.getScore());
    }

    @Test
    public void testInteractWhenOnSamePosition() {
        player.setPosX(5);
        player.setPosY(5);
        player.incrementScore(20);
        enemy.interact(player);
        assertEquals(10, player.getScore());
    }
}

package tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import main.Player;

public 