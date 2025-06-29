package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest {
    private App app;
    @BeforeEach
    public void setUP(){
        app = new App();
        System.out.println("Setting up the test environment...");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("Tearing down the test environment...");
        app = null;
    }
    @Test
    public void testPositive(){
        int result = App.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }
    @Test
    public void testNegative(){
        int result = App.add(-2, -3);
        assertEquals(-5, result, "-2 + -3 should equal -5");
    }
    @Test
    public void mixed(){
        int result = App.add(7, -6);
        assertEquals(1, result, "7 + (-6) should equal 1");
    }

}