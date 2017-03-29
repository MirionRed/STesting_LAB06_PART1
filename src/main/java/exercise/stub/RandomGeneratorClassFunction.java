package exercise.stub;
import java.util.Random;

import example.stub.*;

public interface RandomGeneratorClassFunction {
	public int getRandomInteger(int numLimit);
}

class OriginalRandomGeneratorClass implements RandomGeneratorClassFunction{
	Random randomGenerator = new Random();
	public int getRandomInteger(int numLimit){
		int randomInt = randomGenerator.nextInt(numLimit);
		return randomInt;
	}
}

class StubRandomGeneratorClass implements RandomGeneratorClassFunction{
	int [] stubArray;
	int numCalls = 0;
	
	public StubRandomGeneratorClass(int [] stubArray){
		this.stubArray = stubArray;
	}
	
	public void resetCount(){
		numCalls = 0;
	}
	
	public int getRandomInteger(int numLimit){
		return stubArray[numCalls++];
	}
}
