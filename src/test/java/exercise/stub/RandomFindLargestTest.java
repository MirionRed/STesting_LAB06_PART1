package exercise.stub;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class RandomFindLargestTest {
	@Test
	public void testFindLargestNumberInRandomArray(){
		RandomFindLargest rf1 = new RandomFindLargest();
		int result = rf1.findLargestNumberInRandomArray(5, 8);
		assertEquals(7,result);
	}
}
