package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameObjectTest {
    private GameObject gameObject;
    private Player player;
    private Enemy enemy;

    @Before
    public void setUp() {
        gameObject = new GameObject("Object", 0, 0);
        player = new Player("Hero", 0, 0);
        enemy = new Enemy("Villain", 10, 10);
    }

    // GameObject Tests
    @Test
    public void testGameObjectInitialization() {
        assertEquals("Object", gameObject.getName());
        assertEquals(0, gameObject.getX());
        assertEquals(0, gameObject.getY());
    }

    @Test
    public void testGameObjectSetters() {
        gameObject.setName("NewObject");
        gameObject.setX(5);
        gameObject.setY(5);
        assertEquals("NewObject", gameObject.getName());
        assertEquals(5, gameObject.getX());
        assertEquals(5, gameObject.getY());
    }

    // Player Tests
    @Test
    public void testPlayerInitialization() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getX());
        assertEquals(0, player.getY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerMovement() {
        player.move(10, 15);
        assertEquals(10, player.getX());
        assertEquals(15, player.getY());
    }

    @Test
    public void testPlayerScore() {
        player.setScore(100);
        assertEquals(100, player.getScore());
    }

    // Enemy Tests
    @Test
    public void testEnemyInitialization() {
        assertEquals("Villain", enemy.getName());
        assertEquals(10, enemy.getX());
        assertEquals(10, enemy.getY());
    }

    @Test
    public void testEnemyInteraction() {
        enemy.interact(player); // The test should print interaction in console
    }
    
    // Edge Cases and Robustness
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPlayerMovement() {
        player.move(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEnemyInitialization() {
        new Enemy(null, -1, -1);
    }

    @Test
    public void testVariableShadowing() {
        VariableShadowing vs = new VariableShadowing();
        vs.displayHealth(); // Here should print "Health: 50"
    }
    
    // Performance Considerations can be tested using a separate environment for load testing
}