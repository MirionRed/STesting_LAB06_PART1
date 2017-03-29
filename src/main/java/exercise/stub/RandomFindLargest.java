package exercise.stub;
import example.stub.*;

public class RandomFindLargest {
	RandomGeneratorClass rgc = new RandomGeneratorClass();
	
	public int findLargestNumberInRandomArray(int arrLength, int numLimit){
		int[] numArray = new int[arrLength];
		System.out.println();
		System.out.println();
		for(int i = 0; i<numArray.length; i++){
			numArray[i] = rgc.getRandomInteger(numLimit);
			System.out.println("numArray[ "+i+"] = "+numArray[i]);
		}
		
		int bigNum = numArray[0];
		for (int i = 0; i < numArray[i];i++)
			if(bigNum < numArray[i])
				bigNum = numArray[i];
		return bigNum;
	}
	
	public static void main (String args[]){
		RandomFindLargest rf1 = new RandomFindLargest();
		
		int result = rf1.findLargestNumberInRandomArray(8,  20);
		System.out.println("The largest number is :"+result);
	}
	
	
}
