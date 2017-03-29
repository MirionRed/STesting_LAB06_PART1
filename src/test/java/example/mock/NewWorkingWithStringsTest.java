package example.mock;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import example.mock.*;
import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class NewWorkingWithStringsTest {
	@Test
	public void testCheckStringLength(){
		String[]strArray = {"cat", "houses", "dog", "elephant", "rat"};
		
		SomeOtherWorkMock sowm = new SomeOtherWorkMock();
		NewWorkingWithStrings nww2 = new NewWorkingWithStrings(sowm);
		nww2.checkStringLength(strArray, 4);
		
		String[]results = sowm.getStrList();
		String[]expectedResults = {"houses", "elephant"};
		assertArrayEquals(expectedResults, results);
	}
	
	private Object[] getParamsForTestCheckStringLengthV2(){
		return new Object[]{
			new Object[] {new String[]{"cat", "houses", "dog", "elephant","rat"}, 4, new String[]{"houses", "elephant"}},
			new Object[] {new String[]{"11", "Peter", "22"}, 3, new String[]{"Peter"}},
			new Object[] {new String[]{"11", "22"}, 10, new String[] {}}
			};
	}
	
	@Test
	@Parameters(method = "getParamsForTestCheckStringLengthV2")
	public void testCheckStringLengthV2(String[] strArray, int strLimit, String[] expectedResults){
		SomeOtherWorkMock sowm = new SomeOtherWorkMock();
		NewWorkingWithStrings nww2 = new NewWorkingWithStrings(sowm);
		nww2.checkStringLength(strArray, strLimit);
		
		String[]results = sowm.getStrList();
		assertArrayEquals(expectedResults, results);
	}
}



