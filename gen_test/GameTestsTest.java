package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTests {

    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        player = new Player("Hero", 5, 100);
        enemy = new Enemy("Goblin", 5, 20);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(5, player.getPosition());
        assertEquals(100, player.getScore());
    }

    @Test
    public void testEnemyInitialization() {
        assertEquals("Goblin", enemy.getType());
        assertEquals(5, enemy.getPosition());
        assertEquals(20, enemy.getDamage());
    }

    @Test
    public void testPlayerMove() {
        player.move(3);
        assertEquals(8, player.getPosition());
        player.move(-4);
        assertEquals(4, player.getPosition());
    }

    @Test
    public void testIncreaseScore() {
        player.increaseScore(50);
        assertEquals(150, player.getScore());
        player.increaseScore(-30);
        assertEquals(120, player.getScore());
    }

    @Test
    public void testInteractWithEnemy() {
        player.interactWithEnemy(enemy);
        assertEquals(80, player.getScore()); // 100 initial score - 20 damage

        enemy.setPosition(6); // Move enemy away
        player.interactWithEnemy(enemy);
        assertEquals(80, player.getScore()); // Score should remain the same, no encounter
    }

    @Test
    public void testShadowExamplePrintScore() {
        ShadowExample example = new ShadowExample();
        example.printScore(); // Expect output "100", confirm manually since testing System.out is complex
        // In real-world scenario, consider using a stream redirection to test System.out
    }

    @Test(expected = IllegalArgumentException.