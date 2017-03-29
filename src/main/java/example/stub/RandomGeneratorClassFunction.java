package example.stub;

import java.util.Random;

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
	int stubNumber;
	
	public StubRandomGeneratorClass(int stubNumber){
		this.stubNumber = stubNumber;
	}
	
	public int getRandomInteger(int numLimit){
		return stubNumber;
	}
}
