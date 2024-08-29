package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class Example1Test {

    @Test
    public void testDemonstrateShadowing() {
        Example1 example = new Example1();
        // Directly testing demonstrateShadowing which prints 20
        // No assertion here because the method only prints, with no return value
    }

    @Test
    public void testPrintInstanceValue() {
        Example1 example = new Example1();
        assertEquals(10, example.getInstanceValue()); // Assuming there's a method to get value
    }
}

// Assuming the `Example` class' main behavior does not require direct testing
// as Java `main` method is not typically tested.

// EnemyTest.java
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 