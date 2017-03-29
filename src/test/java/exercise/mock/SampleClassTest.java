package exercise.mock;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleClassTest {
	@Test
	public void testSampleMethodStubMock(){
		int[] numbers = {1,2,3,4,5};
		FileReaderClassStub frcs = new FileReaderClassStub(numbers);
		FileWriterClassMock fwcm = new FileWriterClassMock();
		
		NewSampleClass nsc = new NewSampleClass(frcs, fwcm);
		frcs.resetCount();
		nsc.sampleMethod();
		
		int[]result = fwcm.getIntList();
		
		assertArrayEquals(numbers, result);
	}
}
