package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {

    @Test
    public void testPrintValue() {
        ShadowExample shadowExample = new ShadowExample();
        assertEquals(42, shadowExample.getValue()); // Assuming getValue() method exists
    }
}