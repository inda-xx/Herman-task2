package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 100, new int[]{0, 0});
        enemy = new Enemy("Goblin", 50, new int[]{1, 1});
    }

    @Test
    public void testInitialAttributes() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(100, player.getHealth());
        assertArrayEquals(new int[]{0, 0}, player.getPosition());
    }

    @Test
    public void testSetName() {
        player.setName("NewHero");
        assertEquals("NewHero", player.getName());
    }

    @Test
    public void testSetScore() {
        player.setScore(25);
        assertEquals(25, player.getScore());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(75);
        assertEquals(75, player.getHealth());
    }

    @Test
    public void testSetPosition() {
        player.setPosition(new int[]{2, 3});
        assertArrayEquals(new int[]{2, 3}, player.getPosition());
    }

    @Test
    public void testMove() {
        player.move(3, 3);
        assertArrayEquals(new int[]{3, 3}, player.getPosition());
    }

    @Test
    public void testCollectPoints() {
        player.collectPoints(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testEncounterEnemySurvive() {
        player.encounterEnemy(enemy);
        assertEquals(50, player.getHealth());
    }

    @Test
    public void testEncounterEnemyDefeat() {
        player.setHealth(45);
        player.encounterEnemy(enemy);
        assertEquals(-5, player.getHealth());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidPositionException() {
        player.setPosition(new int[]{1}); // This should throw an exception due to invalid array length
    }
}
```

EnemyTest.java:
```java
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public 