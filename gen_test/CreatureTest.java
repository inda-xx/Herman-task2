package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class CreatureTest {

    private Creature creature;

    @Before
    public void setUp() {
        creature = new Creature("Dragon");
    }

    @Test
    public void testIdentity() {
        assertEquals("Dragon", creature.toString()); // Assuming toString() is overridden
    }
}

package original;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 