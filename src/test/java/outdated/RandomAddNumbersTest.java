package outdated;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RandomAddNumbersTest {
	@Test
	public void testAddTwoNumbers() {
		RandomAddNumbers ran = new RandomAddNumbers();
		int result = ran.addTwoNumbers(3);
		assertEquals(5, result);
	}
}