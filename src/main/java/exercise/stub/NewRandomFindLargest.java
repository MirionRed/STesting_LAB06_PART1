package exercise.stub;

import example.stub.RandomGeneratorClass;

public class NewRandomFindLargest {
	RandomGeneratorClassFunction rgcf;
	
	public NewRandomFindLargest(){
		rgcf = new OriginalRandomGeneratorClass();
	}
	
	public NewRandomFindLargest(RandomGeneratorClassFunction rgcf){
		this.rgcf = rgcf;
	}
	
	public int findLargestNumberInRandomArray(int arrLength, int numLimit){
		int[] numArray = new int[arrLength];
		System.out.println();
		System.out.println();
		for(int i = 0; i<numArray.length; i++){
			numArray[i] = rgcf.getRandomInteger(numLimit);
			System.out.println("numArray[ "+i+"] = "+numArray[i]);
		}
		
		int bigNum = numArray[0];
		for (int i = 0; i < numArray.length;i++)
			if(bigNum < numArray[i])
				bigNum = numArray[i];
		return bigNum;
	}
	
	public static void main(String args[]){
		NewRandomFindLargest nrfl1 = new NewRandomFindLargest();
		
		int result = nrfl1.findLargestNumberInRandomArray(8,  20);
		System.out.println("The largest number is :"+result);
		
		
		StubRandomGeneratorClass srgc = new StubRandomGeneratorClass(new int[]{1,2,3,4,5,6,7});
		NewRandomFindLargest nrfl2 = new NewRandomFindLargest(srgc);
		srgc.resetCount();
		result = nrfl2.findLargestNumberInRandomArray(7, 20);
		System.out.println("The largest number is :"+result);
		
	}
}
