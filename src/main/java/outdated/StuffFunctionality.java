package outdated;
import java.util.ArrayList;
public interface StuffFunctionality {
	public void doOtherStuff(String message);
}

class NewSomeOtherWork implements StuffFunctionality {

	public void doOtherStuff(String message) {
		// lots of other complex code
	}
}

class DummyWork implements StuffFunctionality {
	ArrayList<String> strList = new ArrayList<String>();
	public void doOtherStuff(String message) {
		strList.add(message);
	}
		
	// convert ArrayList of strings to an array of Strings and return it
	public String[] getStrList() {
		String[] strArrayToReturn = new String[strList.size()];
		strArrayToReturn = strList.toArray(strArrayToReturn);
		return strArrayToReturn;
	}
}

