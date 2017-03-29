package example.stub;

import java.util.Random;

public class RandomGeneratorClass {
	Random randomGenerator = new Random();
	public int getRandomInteger(int numLimit){
		int randomInt = randomGenerator.nextInt(numLimit);
		return randomInt;
	}
	
}
