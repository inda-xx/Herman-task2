package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameElementTest {
    private GameElement gameElement;

    @Before
    public void setUp() {
        gameElement = new GameElement("TestElement", 100);
    }

    @Test
    public void testGetName() {
        assertEquals("TestElement", gameElement.getName());
    }

    @Test
    public void testSetName() {
        gameElement.setName("NewName");
        assertEquals("NewName", gameElement.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(100, gameElement.getHealth());
    }

    @Test
    public void testSetHealth() {
        gameElement.setHealth(80);
        assertEquals(80, gameElement.getHealth());
    }

    @Test
    public void testGetScoreInitiallyZero() {
        assertEquals(0, gameElement.getScore());
    }

    @Test
    public void testSetScore() {
        gameElement.setScore(50);
        assertEquals(50, gameElement.getScore());
    }
}

package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 