package example.stub;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NewRandomAddNumbersTest {
	@Test
	public void testAddTwoNumbersOriginal(){
		RandomGeneratorClassFunction original = new OriginalRandomGeneratorClass();
		NewRandomAddNumbers nrl = new NewRandomAddNumbers(original);
		int result = nrl.addTwoNumbers(3);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddTwoNumbersStub(){
		RandomGeneratorClassFunction stub = new StubRandomGeneratorClass(3);
		NewRandomAddNumbers nrl = new NewRandomAddNumbers(stub);
		int result = nrl.addTwoNumbers(4);
		assertEquals(7, result);
	}
}
