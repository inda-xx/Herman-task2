package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Alice", 0, 0);
    }

    @Test
    public void testGetName() {
        assertEquals("Alice", player.getName());
    }

    @Test
    public void testInitialScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(0, player.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testMoveLeft() {
        player.moveLeft();
        assertEquals(-1, player.getPositionX());
    }

    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getPositionX());
    }

    @Test
    public void testSetScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }
}
```

ShadowExampleTest.java:
```java
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public 