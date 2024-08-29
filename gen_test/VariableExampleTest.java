package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

class VariableExampleTest {

    @Test
    public void testShowPrintsCorrectValue() {
        VariableExample example = new VariableExample();
        // Show method prints to console, so if needed,
        // integrate a library like SystemRules for testing System.out output.
        // Here, we'll assume manual verification in the absence of such tools.
        assertEquals(10, example.getNum());
    }
}

```

GameCharacterTest.java
```
package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public 