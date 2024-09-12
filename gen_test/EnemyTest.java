package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 100);
        enemy = new Enemy("Goblin", 50);
    }

    @Test
    public void testAttack() {
        enemy.attack(player);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testEnemyInheritance() {
        assertTrue(enemy instanceof GameElement);
    }
}

package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 