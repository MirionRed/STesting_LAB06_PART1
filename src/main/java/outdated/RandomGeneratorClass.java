package outdated;

import java.util.Random;

class RandomGeneratorClass {
	Random randomGenerator = new Random();
	
	public int getRandomInteger(int numLimit) {
		int randomInt = randomGenerator.nextInt(numLimit);
		return randomInt;
	}
}

