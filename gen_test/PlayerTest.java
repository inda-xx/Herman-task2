package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player(0, 0);
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testMove() {
        player.move(1, 1);
        assertEquals(1, player.getX());
        assertEquals(1, player.getY());
    }

    @Test
    public void testSetX() {
        player.setX(5);
        assertEquals(5, player.getX());
    }

    @Test
    public void testSetY() {
        player.setY(5);
        assertEquals(5, player.getY());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }
}

// EnemyTest.java

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 