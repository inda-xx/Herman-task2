package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("TestPlayer", 0, 0, 0);
    }

    @Test
    public void testInitialState() {
        assertEquals("TestPlayer", player.getPlayerName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMovePlayer() {
        player.movePlayer(10, 20);
        assertEquals(10, player.getPositionX());
        assertEquals(20, player.getPositionY());
        assertEquals(10, player.getScore()); // Score should increase by 10
    }

    @Test
    public void testSetPlayerName() {
        player.setPlayerName("NewName");
        assertEquals("NewName", player.getPlayerName());
    }

    @Test
    public void testSetScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testSetPosition() {
        player.setPositionX(15);
        player.setPositionY(25);
        assertEquals(15, player.getPositionX());
        assertEquals(25, player.getPositionY());
    }
}

// EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 