package my.edu.utar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NewRandomFindLargestTest {
	@Test
	public void testFindLargestNumberInRandomArrayOriginal(){
		RandomNumberFunctionality original = new NewRandomGeneratorClass();
		NewRandomFindLargest rn1 = new NewRandomFindLargest(original);
		
		int result = rn1.findLargestNumberInRandomArray(3, 4);
		assertEquals(3, result);
	}
	
	@Test
	public void testFindLargestNumberInRandomArrayDummy(){
		RandomNumberFunctionality dummy = new DummyRandomNumber(3);
		NewRandomFindLargest rn1 = new NewRandomFindLargest(dummy);
		
		int result = rn1.findLargestNumberInRandomArray(3, 4);
		assertEquals(3, result);
	}
}
