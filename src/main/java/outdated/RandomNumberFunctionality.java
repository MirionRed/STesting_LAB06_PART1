package outdated;

import java.util.Random;

interface RandomNumberFunctionality {
	public int getRandomInteger(int numLimit);
}

class NewRandomGeneratorClass implements RandomNumberFunctionality {
	Random randomGenerator = new Random();
	public int getRandomInteger(int numLimit) {
		int randomInt = randomGenerator.nextInt(numLimit);
		return randomInt;
	}
}

class DummyRandomNumber implements RandomNumberFunctionality {
	int valToReturn;
	public DummyRandomNumber(int valToReturn) {
		this.valToReturn = valToReturn;
	}
	public int getRandomInteger(int numLimit) {
		return valToReturn;
	}
}


