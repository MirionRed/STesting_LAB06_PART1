package exercise.stub;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewRandomFindLargestTest {
	@Test
	public void testFindLargestNumberInRandomArray(){
		System.out.println("doing test using original random functionality");
		NewRandomFindLargest nrfl1 = new NewRandomFindLargest();
		
		int result = nrfl1.findLargestNumberInRandomArray(8,  20);
		assertEquals(19, result);	
	}
	
	@Test
	public void testFindLargestNumberInRandomArrayV2(){
		System.out.println("doing test using original random functionality");
		StubRandomGeneratorClass srgc = new StubRandomGeneratorClass(new int[]{1,2,3,4,5,6,7});
		NewRandomFindLargest nrfl2 = new NewRandomFindLargest(srgc);
		srgc.resetCount();
		int result = nrfl2.findLargestNumberInRandomArray(7, 20);
		assertEquals(7, result);
	}
}
