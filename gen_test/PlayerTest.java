package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player hero;

    @Before
    public void setUp() {
        hero = new Player("Hero", 0, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", hero.getName());
    }

    @Test
    public void testSetName() {
        hero.setName("NewHero");
        assertEquals("NewHero", hero.getName());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(0, hero.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(0, hero.getPositionY());
    }

    @Test
    public void testMove() {
        hero.move(5, 5);
        assertEquals(5, hero.getPositionX());
        assertEquals(5, hero.getPositionY());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoveWithInvalidInput() {
        hero.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test
    public void testSetPositionX() {
        hero.setPositionX(10);
        assertEquals(10, hero.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        hero.setPositionY(10);
        assertEquals(10, hero.getPositionY());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, hero.getScore());
    }

    @Test
    public void testIncrementScore() {
        hero.incrementScore(10);
        assertEquals(10, hero.getScore());
        
        hero.incrementScore(-5);
        assertEquals(5, hero.getScore());
    }

    @Test
    public void testSetScore() {
        hero.setScore(50);
        assertEquals(50, hero.getScore());
    }
}

// EnemyTest.java
package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 