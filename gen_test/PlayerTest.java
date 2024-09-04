package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 100, new Position(0, 0));
    }

    @Test
    public void testGetName() {
        assertEquals("Hero", player.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testSetHealth() {
        player.setHealth(90);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testGetScore() {
        assertEquals(0, player.getScore());
    }

    @Test
    public void testSetScore() {
        player.setScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testGetPosition() {
        assertEquals(new Position(0, 0).toString(), player.getPosition().toString());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(1, player.getPosition().getY());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(-1, player.getPosition().getY());
    }

    @Test
    public void testMoveLeft() {
        player.moveLeft();
        assertEquals(-1, player.getPosition().getX());
    }

    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getPosition().getX());
    }

    @Test
    public void testToString() {
        assertEquals("Player: Hero at (0, 0) with health 100 and score 0", player.toString());
    }
}
```

EnemyTest.java
```java
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public 