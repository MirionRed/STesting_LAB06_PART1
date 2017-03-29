package outdated;

public class NewRandomFindLargest {
	RandomNumberFunctionality rnf;
	
	public NewRandomFindLargest(RandomNumberFunctionality rnf){
		this.rnf=rnf;
	}
	
	public int findLargestNumberInRandomArray(int arrLength, int numLimit){
		int[]numArray = new int[arrLength];
		System.out.println();
		for(int i=0; i<numArray.length; i++){
			numArray[i]=rnf.getRandomInteger(numLimit);
			System.out.println("numArray["+i+"] = " + numArray[i]);
		}
		
		int bigNum = numArray[0];
		for(int i=0;i<numArray.length;i++)
			if(bigNum < numArray[i])
				bigNum = numArray[i];
			return bigNum;
	}
	
	public static void main (String args[]){
		RandomNumberFunctionality original = new NewRandomGeneratorClass();
		RandomNumberFunctionality dummy = new DummyRandomNumber(5);
		NewRandomFindLargest nr1 = new NewRandomFindLargest(original);
		System.out.println ("Working with original random functionality");
		System.out.println(nr1.findLargestNumberInRandomArray(7,4));
		System.out.println(nr1.findLargestNumberInRandomArray(8,7));
		System.out.println(nr1.findLargestNumberInRandomArray(9,8));
		System.out.println ("Working with dummy functionality that returns a fixed number");
		NewRandomFindLargest nr2 = new NewRandomFindLargest(dummy);
		System.out.println(nr2.findLargestNumberInRandomArray(7,4));
		System.out.println(nr2.findLargestNumberInRandomArray(8,7));
		System.out.println(nr2.findLargestNumberInRandomArray(9,8));
	}
}
