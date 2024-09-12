package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {

    @Test
    public void testDisplayScore() {
        // Capture the output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShadowExample example = new ShadowExample();
        example.displayScore();

        assertEquals("50\n", outContent.toString());
    }
}

