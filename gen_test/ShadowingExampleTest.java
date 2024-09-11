package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class ShadowingExampleTest {
    @Test
    public void testPrintValue() {
        ShadowingExample example = new ShadowingExample();
        example.printValue();
    }
}

// EnemyTest.java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 