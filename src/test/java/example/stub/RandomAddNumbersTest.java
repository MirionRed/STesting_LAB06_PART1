package example.stub;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import example.stub.RandomAddNumbers;

public class RandomAddNumbersTest {
	@Test 
	public void testAddTwoNumbers(){
		RandomAddNumbers ran = new RandomAddNumbers();
		int result = ran.addTwoNumbers(3);
		assertEquals(5, result);
	}
}
