package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Enemy enemy;
    private Player player;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 100, 0, 0);
        player = new Player("Hero", 0, 0);
    }

    @Test
    public void testAttackPlayerWhenInPosition() {
        enemy.attackPlayer(player);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testAttackPlayerWhenOutOfPosition() {
        enemy.setPositionX(1);
        enemy.attackPlayer(player);
        assertEquals(0, player.getScore());
    }

    @Test
    public void testEnemyGetType() {
        assertEquals("Goblin", enemy.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHealth() {
        enemy.setHealth(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionX() {
        enemy.setPositionX(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPositionY() {
        enemy.setPositionY(-1);
    }
}

// PlayerTest.java

package test;
import main.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 