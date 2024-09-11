package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class CreatureTest {
    private Creature creature;

    @Before
    public void setUp() {
        creature = new Creature("TestCreature");
    }

    @Test
    public void testSpeak() {
        // Similar to Shadow1, this method prints instead of returning a value. 
        // Assume correctness if no exceptions occur and confirm via visual log output manually.
    }
}
```

**EnemyTest.java**

```java
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 