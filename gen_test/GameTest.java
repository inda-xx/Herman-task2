package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class GameTest {
    @Test
    public void testMain() {
        // Since main method prints to standard output, we can either redirect the output stream for testing
        // or manually verify that the method runs without exceptions and produces the expected result.
        Game.main(null);
    }
}