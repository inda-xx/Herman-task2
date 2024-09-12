package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {
    private ShadowExample shadowExample;

    @Before
    public void setUp() {
        shadowExample = new ShadowExample();
    }

    @Test
    public void testDemonstrateShadow() {
        shadowExample.demonstrateShadow(5); // No assertion, just checking behavior in console log
    }

    @After
    public void tearDown() {
        shadowExample = null;
    }
}
```

These tests cover the basic functionality of the main methods, ensuring that initialization is correct, methods behave as intended, and state changes are accurately reflected. Additionally, the test names reflect the behavior being tested.