package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Adventurer adventurer;

    @Before
    public void setUp() {
        enemy = new Enemy("Orc", 30, 10);
        adventurer = new Adventurer("Aragorn", 100, 0, 50);
    }

    @Test
    public void testGetType() {
        assertEquals("Orc", enemy.getType());
    }

    @Test
    public void testSetType() {
        enemy.setType("Troll");
        assertEquals("Troll", enemy.getType());
    }

    @Test
    public void testGetAndSetHealth() {
        assertEquals(30, enemy.getHealth());
        enemy.setHealth(20);
        assertEquals(20, enemy.getHealth());
    }

    @Test
    public void testGetAndSetDamage() {
        assertEquals(10, enemy.getDamage());
        enemy.setDamage(20);
        assertEquals(20, enemy.getDamage());
    }

    @Test
    public void testCounterAttackDecreasesAdventurerHealth() {
        enemy.counterAttack(adventurer);
        assertEquals(90, adventurer.getHealth());
    }

    @Test
    public void testCounterAttackCannotReduceHealthBelowZero() {
        adventurer.setHealth(5);
        enemy.counterAttack(adventurer);
        assertEquals(0, adventurer.getHealth());
    }
}