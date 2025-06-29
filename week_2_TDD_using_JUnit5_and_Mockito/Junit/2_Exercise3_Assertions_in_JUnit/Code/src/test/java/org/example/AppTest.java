package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    @Test
    public void testMain() {
        int sum = 2 + 2;
        String nullString = null;
        String notNullString = "Test";
        // Assert equality
        assertEquals(4, sum, "Sum should be 4");
        // Assert inequality
        assertNotEquals(5, sum, "Sum should not be 5");
        // Assert boolean true
        assertTrue(sum == 4, "Sum should be 4");
        // Assert boolean false
        assertFalse(sum == 5, "Sum should not be 5");
        // Assert null
        assertNull(nullString, "Object should be null");
        // Assert not null
        assertNotNull(notNullString, "Object should not be null");
        // Assert exception is thrown
        assertThrows(ArithmeticException.class, () -> {
            int result = 1 / 0;
        }, "Division by zero should throw ArithmeticException");
        // Assert no exception is thrown
        assertDoesNotThrow(() -> {
            int value = 10 / 2;
        }, "Division by non-zero should not throw");
    }
}