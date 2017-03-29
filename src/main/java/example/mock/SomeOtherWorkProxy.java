package example.mock;

import java.util.ArrayList;

public interface SomeOtherWorkProxy {
	public void doOtherStuff(String message);
}

class SomeOtherWorkOriginal implements SomeOtherWorkProxy{
	public void doOtherStuff(String message){
		
	}
}

class SomeOtherWorkMock implements SomeOtherWorkProxy{
	ArrayList<String>strList = new ArrayList<String>();
	
	public void doOtherStuff(String message){
		strList.add(message);
	}
	
	public String[] getStrList(){
		String[] strArrayToReturn = new String[strList.size()];
		strArrayToReturn = strList.toArray(strArrayToReturn);
		return strArrayToReturn;
	}
}
