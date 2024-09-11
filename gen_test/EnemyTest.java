package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() {
        enemy = new Enemy("Goblin", 5, 5);
    }

    @Test
    public void testGetName() {
        assertEquals("Goblin", enemy.getName());
    }

    @Test
    public void testGetPositionX() {
        assertEquals(5, enemy.getPositionX());
    }

    @Test
    public void testGetPositionY() {
        assertEquals(5, enemy.getPositionY());
    }

    @Test
    public void testSetPositionX() {
        enemy.setPositionX(10);
        assertEquals(10, enemy.getPositionX());
    }

    @Test
    public void testSetPositionY() {
        enemy.setPositionY(10);
        assertEquals(10, enemy.getPositionY());
    }
}
```

**PlayerTest.java**

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 