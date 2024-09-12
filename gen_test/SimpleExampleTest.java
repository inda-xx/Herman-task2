package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class SimpleExampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testShowNumber() {
        new SimpleExample().showNumber();
        assertEquals("42\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}

public 