package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {

    @Test
    public void testConstructorAndGetters() {
        Enemy enemy = new Enemy("Orc", 50, 10, 10);
        assertEquals("Orc", enemy.getType());
        assertEquals(50, enemy.getHealth());
        assertEquals(10, enemy.getPositionX());
        assertEquals(10, enemy.getPositionY());
    }

    @Test
    public void testSetType() {
        Enemy enemy = new Enemy("Orc", 50, 10, 10);
        enemy.setType("Goblin");
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testSetHealth() {
        Enemy enemy = new Enemy("Orc", 50, 10, 10);
        enemy.setHealth(45);
        assertEquals(45, enemy.getHealth());
    }

    @Test
    public void testSetPositionX() {
        Enemy enemy = new Enemy("Orc", 50, 10, 10);
        enemy.setPositionX(15);
        assertEquals(15, enemy.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        Enemy enemy = new Enemy("Orc", 50, 10, 10);
        enemy.setPositionY(20);
        assertEquals(20, enemy.getPositionY());
    }

    @Test(expected = IllegalArgumentException.