package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class EnemyTest {
    private Enemy goblin;
    private Player knight;

    @Before
    public void setUp() {
        knight = new Player("Knight", 10, 5, 100);
        goblin = new Enemy("Goblin", 10, 5, 25);
    }

    @Test
    public void testInteract() {
        goblin.interact(knight);
        assertEquals(75, knight.getScore());
    }

    @Test
    public void testNegativeDamageInteraction() {
        Enemy healer = new Enemy("Healer", 10, 5, -10);
        healer.interact(knight);
        assertEquals(110, knight.getScore());
    }

    @Test
    public void testZeroDamageInteraction() {
        Enemy weakling = new Enemy("Weakling", 10, 5, 0);
        weakling.interact(knight);
        assertEquals(100, knight.getScore());
    }
}

package test;

import original.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

