package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;

    @Before
    public void setUp() {
        player = new Player("Hero", 0, 0);
    }
    
    @Test
    public void testConstructorAndInitialValues() {
        assertEquals("Hero", player.getName());
        assertEquals(0, player.getScore());
        assertEquals(0, player.getXPosition());
        assertEquals(0, player.getYPosition());
    }
    
    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(1, player.getYPosition());
    }
    
    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(-1, player.getYPosition());
    }
    
    @Test
    public void testMoveLeft() {
        player.moveLeft();
        assertEquals(-1, player.getXPosition());
    }
    
    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getXPosition());
    }
    
    @Test
    public void testInteractWithEnemy() {
        player.interactWithEnemy();
        assertEquals(-10, player.getScore());
    }
    
    @Test
    public void testSettingScore() {
        player.setScore(20);
        assertEquals(20, player.getScore());
    }
    
    @Test
    public void testSettingXPosition() {
        player.setXPosition(5);
        assertEquals(5, player.getXPosition());
    }
    
    @Test
    public void testSettingYPosition() {
        player.setYPosition(5);
        assertEquals(5, player.getYPosition());
    }

    @Test
    public void testBoundaryMovement() {
        Player playerBoundary = new Player("BoundaryTester", Integer.MAX_VALUE, Integer.MAX_VALUE);
        playerBoundary.moveRight();
        assertEquals(Integer.MAX_VALUE + 1, playerBoundary.getXPosition());
        playerBoundary.moveRight();
        assertEquals(Integer.MAX_VALUE + 2, playerBoundary.getXPosition());
        
        playerBoundary = new Player("BoundaryTester", Integer.MIN_VALUE, Integer.MIN_VALUE);
        playerBoundary.moveLeft();
        assertEquals(Integer.MIN_VALUE - 1, playerBoundary.getXPosition());
        playerBoundary.moveLeft();
        assertEquals(Integer.MIN_VALUE - 2, playerBoundary.getXPosition());
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullName() {
        Player nullNamePlayer = new Player(null, 0, 0);
        assertNull(nullNamePlayer.getName());
    }
    
    @Test
    public void testPerformanceLargeMoves() {
        for (int i = 0; i < 1000000; i++) {
            player.moveUp();
        }
        assertEquals(1000000, player.getYPosition());
        
        for (int i = 0; i < 1000000; i++) {
            player.moveDown();
        }
        assertEquals(0, player.getYPosition());
    }
}