package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5, 5);
        player = new Player("Hero", 0, 0);
        player.setScore(50); // Initial player score
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(5, enemy.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testInteractionWithPlayer() {
        enemy.interact(player);
        assertEquals(40, player.getScore()); // Score should decrease by 10
    }
}
```

PlayerTest.java:
```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 