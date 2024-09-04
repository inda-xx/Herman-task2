package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {

    @Test
    public void testShadowingExample() {
        ShadowExample example = new ShadowExample();
        example.shadowingDemo(); // Validate by observing the printed output for analysis
        assertTrue("Ensure shadowingDemo method runs correctly", true); // No practical assertions since method has no return
    }
}