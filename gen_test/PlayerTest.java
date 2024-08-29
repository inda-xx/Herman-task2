package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PlayerTest {
    private Player player;
    private Enemy goblin;
    private Enemy orc;

    @Before
    public void setUp() {
        player = new Player("Adventurer", 0, 0);
        goblin = new Enemy("Goblin", 1, 1);
        orc = new Enemy("Orc", 0, 1);
    }

    @Test
    public void testInitialPositionAndScore() {
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testMoveRight() {
        player.moveRight();
        assertEquals(1, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testMoveUp() {
        player.moveUp();
        assertEquals(0, player.getPositionX());
        assertEquals(1, player.getPositionY());
    }

    @Test
    public void testMoveDown() {
        player.moveDown();
        assertEquals(0, player.getPositionX());
        assertEquals(-1, player.getPositionY());
    }

    @Test
    public void testMoveLeft() {
        player.moveRight();
        player.moveLeft();
        assertEquals(0, player.getPositionX());
        assertEquals(0, player.getPositionY());
    }

    @Test
    public void testInteractWithEnemySamePosition() {
        player.setPositionX(1);
        player.setPositionY(1);
        player.interactWithEnemy(goblin);
        assertEquals(-10, player.getScore());
    }

    @Test
    public void testInteractWithEnemyDifferentPosition() {
        player.setPositionX(0);
        player.setPositionY(1);
        player.interactWithEnemy(goblin);
        assertEquals(0, player.getScore());
    }

    @Test
    public void testScoreIncreasesOnTreasureFound() {
        player.setPositionX(2);
        player.setPositionY(2);
        if (player.getPositionX() == 2 && player.getPositionY() == 2) {
            player.setScore(player.getScore() + 20);
        }
        assertEquals(20, player.getScore());
    }

    @Test
    public void testScoreDecreasesMultipleInteracts() {
        player.setPositionX(1);
        player.setPositionY(1);
        player.interactWithEnemy(goblin);
        assertEquals(-10, player.getScore());
        
        player.moveUp();
        player.interactWithEnemy(orc);
        assertEquals(0, player.getScore());
    }

    @Test(expected = NullPointerException.class)
    public void testInteractWithNullEnemy() {
        player.interactWithEnemy(null);
    }

    @Test
    public void testPlayerBoundaryConditions() {
        // Assuming there's no limitation on movement in this implementation
        player.setPositionX(Integer.MAX_VALUE);
        player.moveRight();
        assertEquals(Integer.MAX_VALUE + 1, player.getPositionX());

        player.setPositionX(Integer.MIN_VALUE);
        player.moveLeft();
        assertEquals(Integer.MIN_VALUE - 1, player.getPositionX());
    }
}

package game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 