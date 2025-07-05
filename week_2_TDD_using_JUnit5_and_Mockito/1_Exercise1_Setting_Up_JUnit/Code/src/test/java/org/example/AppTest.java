package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testAdd(){
        int result = App.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testAddNegativeNumbers(){
        int result = App.add(-21, -31);
        assertEquals(-52, result);
    }
}
