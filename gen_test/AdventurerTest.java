package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class AdventurerTest {
    private Adventurer adventurer;
    private Enemy enemy;

    @Before
    public void setUp() {
        adventurer = new Adventurer("Aragorn", 100, 0, 50);
        enemy = new Enemy("Orc", 30, 10);
    }

    @Test
    public void testGetName() {
        assertEquals("Aragorn", adventurer.getName());
    }

    @Test
    public void testSetName() {
        adventurer.setName("Legolas");
        assertEquals("Legolas", adventurer.getName());
    }

    @Test
    public void testGetAndSetHealth() {
        assertEquals(100, adventurer.getHealth());
        adventurer.setHealth(80);
        assertEquals(80, adventurer.getHealth());
    }

    @Test
    public void testGetAndSetScore() {
        assertEquals(0, adventurer.getScore());
        adventurer.setScore(50);
        assertEquals(50, adventurer.getScore());
    }

    @Test
    public void testGetAndSetEnergy() {
        assertEquals(50, adventurer.getEnergy());
        adventurer.setEnergy(40);
        assertEquals(40, adventurer.getEnergy());
    }

    @Test
    public void testAttackWithSufficientEnergy() {
        adventurer.attack(enemy);
        assertEquals(20, enemy.getHealth());
        assertEquals(40, adventurer.getEnergy());
        assertEquals(10, adventurer.getScore());
    }

    @Test
    public void testAttackWithInsufficientEnergy() {
        adventurer.setEnergy(0);
        adventurer.attack(enemy);
        assertEquals(30, enemy.getHealth()); // No change since attack should fail
        assertEquals(0, adventurer.getEnergy());
        assertEquals(0, adventurer.getScore());
    }

    @Test
    public void testAttackWithExactEnergy() {
        adventurer.setEnergy(30);
        adventurer.attack(enemy);
        assertEquals(0, enemy.getHealth());
        assertEquals(20, adventurer.getEnergy());
        assertEquals(30, adventurer.getScore());
    }

    @Test
    public void testPerformanceUnderHeavyLoad() {
        Enemy manyEnemies[] = new Enemy[1000];
        for (int i = 0; i < 1000; i++) {
            manyEnemies[i] = new Enemy("Goblin " + i, 1, 1);
        }
        
        adventurer.setEnergy(1000);
        for (int i = 0; i < 1000; i++) {
            adventurer.attack(manyEnemies[i]);
        }

        for (int i = 0; i < 1000; i++) {
            assertEquals(0, manyEnemies[i].getHealth());
        }
    }
}

// EnemyTest.java

package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.Enemy;
import main.Adventurer;

public 