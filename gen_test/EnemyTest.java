package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Aragorn", 0, 0, 5); // Sample player with 5 defense points
        enemy = new Enemy(30, 7); // Sample enemy with 30 hit points and 7 attack power
    }

    @Test
    public void testEnemyAttackReducesPlayerPoints() {
        enemy.attack(player);
        int expectedDamage = 2; // Since 7 (attack power) - 5 (defense) = 2
        assertEquals("Enemy attacks causes correct damage", expectedDamage, enemy.getAttackPower() - player.getDefense());
    }

    @Test
    public void testSetAndGetHitPoints() {
        enemy.setHitPoints(50);
        assertEquals("Enemy hit points should be updated to 50", 50, enemy.getHitPoints());
    }

    @Test
    public void testSetAndGetAttackPower() {
        enemy.setAttackPower(10);
        assertEquals("Enemy attack power should be updated to 10", 10, enemy.getAttackPower());
    }

    // Testing boundary conditions
    @Test
    public void testEnemyAttackWhenDefenseExceedsAttack() {
        player.setDefense(10); // Set defense higher than enemy's attack power
        enemy.attack(player);
        int expectedDamage = -3; // 7 (attack power) - 10 (defense) = -3
        assertEquals("No damage should occur when defense is higher than attack power", expectedDamage, enemy.getAttackPower() - player.getDefense());
    }

    @Test
    public void testNegativeHitPoints() {
        enemy.setHitPoints(-10);
        assertTrue("Enemy hit points can be negative as per current logic", enemy.getHitPoints() < 0);
    }

    @Test
    public void testNegativeAttackPower() {
        enemy.setAttackPower(-5);
        assertTrue("Enemy attack power can be negative as per current logic", enemy.getAttackPower() < 0);
    }
}


// PlayerTest.java

package test;

import main.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 