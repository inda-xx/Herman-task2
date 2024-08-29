package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy goblin;
    private Player hero;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 10, 10, 100);
        hero = new Player("Hero", 0, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Goblin", goblin.getName());
    }

    @Test
    public void testSetName() {
        goblin.setName("Orc");
        assertEquals("Orc", goblin.getName());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(10, goblin.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(10, goblin.getPositionY());
    }

    @Test
    public void testSetPositionX() {
        goblin.setPositionX(20);
        assertEquals(20, goblin.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        goblin.setPositionY(20);
        assertEquals(20, goblin.getPositionY());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, goblin.getHealth());
    }

    @Test
    public void testSetHealth() {
        goblin.setHealth(50);
        assertEquals(50, goblin.getHealth());
    }

    @Test
    public void testInteractWithPlayer() {
        goblin.interact(hero);
        assertEquals(90, goblin.getHealth());
        assertEquals(-10, hero.getScore());
    }

    @Test
    public void testInteractWithPlayerWhenEnemyIsDefeated() {
        goblin.setHealth(0);
        goblin.interact(hero);
        assertEquals(0, goblin.getHealth());
        assertEquals(0, hero.getScore());
    }
}

// ShadowExampleTest.java
package original;

import org.junit.Test;

public 