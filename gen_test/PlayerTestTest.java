package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Knight", 10, 5, 100);
    }

    @Test
    public void testInitialValues() {
        assertEquals("Knight", player.getName());
        assertEquals(10, player.getX());
        assertEquals(5, player.getY());
        assertEquals(100, player.getScore());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetX() {
        player.setX(15);
        assertEquals(15, player.getX());
    }

    @Test
    public void testSetY() {
        player.setY(20);
        assertEquals(20, player.getY());
    }

    @Test
    public void testSetScore() {
        player.setScore(150);
        assertEquals(150, player.getScore());
    }

    @Test(expected = IllegalArgumentException.