package example.mock;

public class NewWorkingWithStrings {
	SomeOtherWorkProxy sowp;
	public NewWorkingWithStrings(){
		sowp = new SomeOtherWorkOriginal();
	}
	
	public NewWorkingWithStrings(SomeOtherWorkProxy sowp){
		this.sowp = sowp;
	}
	
	public void checkStringLength(String[]strArray, int strLimit){
		for(int i=0; i<strArray.length; i++){
			if(strArray[i].length()>strLimit)
				sowp.doOtherStuff(strArray[i]);
		}
	}
	
	public static void main(String[]args){
		String [] strArray = {"cat", "houses", "dog", "elephant", "rat"};
		
		NewWorkingWithStrings nww1 = new NewWorkingWithStrings();
		nww1.checkStringLength(strArray, 4);
		
		SomeOtherWorkMock sowm = new SomeOtherWorkMock();
		NewWorkingWithStrings nww2 = new NewWorkingWithStrings(sowm);
		
		nww2.checkStringLength(strArray, 4);
		
		String[]results = sowm.getStrList();
		System.out.println("Results are: ");
		for (int i = 0; i < results.length; i++)
			System.out.println(results[i]);
	}
}
