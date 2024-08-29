package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowExampleTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testShadowTest() {
        ShadowExample shadowExample = new ShadowExample();
        shadowExample.shadowTest();
        assertEquals("1\n", outContent.toString());
    }
}

// EnemyTest.java

package test;
import main.Enemy;
import main.Player;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 