package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0, 10);
        enemy = new Enemy("Orc", 1, 1);
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testInitialPosition() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testScore() {
        assertEquals(10, player.getScore());
    }

    @Test
    public void testSetPositionX() {
        player.setPositionX(2);
        assertEquals(2, player.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        player.setPositionY(2);
        assertEquals(2, player.getPositionY());
    }

    @Test
    public void testSetScore() {
        player.setScore(20);
        assertEquals(20, player.getScore());
    }

    @Test
    public void testMoveRandomly() {
        player.moveRandomly();
        int xPos = player.getPositionX();
        int yPos = player.getPositionY();
        assertTrue(xPos >= 0 && xPos < 5);
        assertTrue(yPos >= 0 && yPos < 5);
    }

    @Test
    public void testCollideWithEnemy() {
        player.collideWithEnemy(enemy);
        assertEquals(5, player.getScore()); // score should decrease by 5
    }

    @Test
    public void testPrintInfo() {
        player.printInfo();
        // Similar to other print methods, manual verification needed via logs.
    }
}
```

**GameTest.java**

```java
import org.junit.Test;

public 