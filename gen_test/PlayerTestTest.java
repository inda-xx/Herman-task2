package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {

    @Test
    public void testConstructorAndGetters() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(100, player.getHealth());
        assertEquals(5, player.getPositionX());
        assertEquals(5, player.getPositionY());
    }

    @Test
    public void testMove() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.move(2, 3);
        assertEquals(7, player.getPositionX());
        assertEquals(8, player.getPositionY());
    }

    @Test
    public void testIncreaseScore() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.increaseScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetName() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetScore() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testSetHealth() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.setHealth(80);
        assertEquals(80, player.getHealth());
    }

    @Test
    public void testSetPositionX() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.setPositionX(10);
        assertEquals(10, player.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        Player player = new Player("Hero", 0, 100, 5, 5);
        player.setPositionY(10);
        assertEquals(10, player.getPositionY());
    }

    @Test(expected = IllegalArgumentException.