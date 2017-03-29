package example.mock;

public class WorkingWithStrings {
	SomeOtherWork sow = new SomeOtherWork();
	
	public void checkStringLength(String[]strArray, int strLimit){
		for (int i = 0; i<strArray.length; i++){
			if(strArray[i].length() > strLimit)
				sow.doOtherStuff(strArray[i]);
		}
	}
}

