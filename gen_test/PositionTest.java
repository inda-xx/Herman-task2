package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class PositionTest {

    private Position position;

    @Before
    public void setUp() {
        position = new Position(0, 0);
    }

    @Test
    public void testGetX() {
        assertEquals(0, position.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(0, position.getY());
    }

    @Test
    public void testSetX() {
        position.setX(5);
        assertEquals(5, position.getX());
    }

    @Test
    public void testSetY() {
        position.setY(5);
        assertEquals(5, position.getY());
    }

    @Test
    public void testToString() {
        assertEquals("(0, 0)", position.toString());
        position.setX(3);
        position.setY(4);
        assertEquals("(3, 4)", position.toString());
    }
}
```

PlayerTest.java
```java
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public 