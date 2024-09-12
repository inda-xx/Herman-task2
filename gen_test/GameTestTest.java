package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class public class GameTest {
    private Enemy goblin;
    private Player archer;

    @Before
    public void setUp() {
        goblin = new Enemy("Goblin", 5, 5, 10);
        archer = new Player("Archer", 0, 0, 0, true);
    }

    // Tests for Enemy 