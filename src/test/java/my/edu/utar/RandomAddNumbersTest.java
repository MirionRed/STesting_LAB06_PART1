package my.edu.utar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import my.edu.utar.RandomAddNumbers;

public class RandomAddNumbersTest {
	@Test
	public void testAddTwoNumbers() {
		RandomAddNumbers ran = new RandomAddNumbers();
		int result = ran.addTwoNumbers(3);
		assertEquals(5, result);
	}
}