package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy goblin;
    private Player player;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 50, new Position(5, 5));
        player = new Player("Hero", 100, new Position(0, 0));
    }

    @Test
    public void testGetType() {
        assertEquals("Goblin", goblin.getType());
    }

    @Test
    public void testGetPosition() {
        assertEquals(new Position(5, 5).toString(), goblin.getPosition().toString());
    }

    @Test
    public void testAttack() {
        goblin.attack(player);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testToString() {
        assertEquals("Enemy: Goblin at (5, 5)", goblin.toString());
    }
}
```

GameWorldTest.java
```java
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public 