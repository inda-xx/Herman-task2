package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {

    private ShadowExample shadowExample;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        shadowExample = new ShadowExample();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    public void testPrintShadow_ShouldPrintLocalVariableValue() {
        shadowExample.printShadow();
        assertEquals("5\n", outContent.toString());
    }

    // Additional test for understanding purposes
    @Test
    public void testPrintShadow_ShouldNotPrintMemberVariableValue() {
        shadowExample.printShadow();
        assertNotEquals("42\n", outContent.toString());
    }

    // Performance consideration: Ensure printShadow runs within a reasonable time
    @Test(timeout = 1000) // Timeout set to 1 second for demonstration
    public void testPrintShadow_Performance() {
        shadowExample.printShadow();
    }

    // As the ShadowExample 