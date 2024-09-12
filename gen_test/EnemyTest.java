package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 50, new int[]{1, 1});
    }

    @Test
    public void testInitialAttributes() {
        assertEquals("Goblin", enemy.getName());
        assertEquals(50, enemy.getStrength());
        assertArrayEquals(new int[]{1, 1}, enemy.getPosition());
    }

    @Test
    public void testSetName() {
        enemy.setName("Orc");
        assertEquals("Orc", enemy.getName());
    }

    @Test
    public void testSetStrength() {
        enemy.setStrength(30);
        assertEquals(30, enemy.getStrength());
    }

    @Test
    public void testSetPosition() {
        enemy.setPosition(new int[]{2, 2});
        assertArrayEquals(new int[]{2, 2}, enemy.getPosition());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidPositionException() {
        enemy.setPosition(new int[]{1}); // This should throw an exception due to invalid array length
    }
}
```

These tests cover initialization, setting values, moving the player, collecting points, interacting with enemies, and edge cases such as invalid position arrays. It is assumed the methods `setPosition` in both `Player` and `Enemy` require an array of exactly two integers; otherwise, an exception (ArrayIndexOutOfBoundsException) should occur, as demonstrated in the cases handling invalid input length. Adjust the position exception tests based on your actual logic and error handling requirements within the game's code.