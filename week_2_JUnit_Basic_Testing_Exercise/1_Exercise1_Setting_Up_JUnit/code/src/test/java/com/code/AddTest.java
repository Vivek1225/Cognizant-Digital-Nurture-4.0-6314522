package com.code;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AddTest {
	@Test
	public void testAdd() {
		int result = Add.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void testAddNegativeNumbers() {
		int result = Add.add(-21, -31);
		assertEquals(-52, result);
	}
}
