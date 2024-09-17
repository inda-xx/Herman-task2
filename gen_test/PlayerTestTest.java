package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0, 0);
        enemy = new Enemy("Orc", 5, 5);
    }

    @Test
    public void testInitialValues() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }

    @Test
    public void testSetName() {
        player.setName("Warrior");
        assertEquals("Warrior", player.getName());
    }

    @Test
    public void testSetScore() {
        player.setScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testSetXPosition() {
        player.setXPosition(10);
        assertEquals(10, player.getXPosition());
    }

    @Test
    public void testSetYPosition() {
        player.setYPosition(15);
        assertEquals(15, player.getYPosition());
    }

    @Test
    public void testMove() {
        player.move(3, 4);
        assertEquals(3, player.getXPosition());
        assertEquals(4, player.getYPosition());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interactWithEnemy(enemy);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testNullEnemyInteraction() {
        try {
            player.interactWithEnemy(null);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}
```

EnemyTest.java:
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

