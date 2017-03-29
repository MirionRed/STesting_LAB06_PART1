package exercise.mock;

public interface FileReaderClassProxy {
	public int getNumberFromFile();
}

class FileReaderClassOriginal implements FileReaderClassProxy{
	public int getNumberFromFile(){
		int numberToReturn = 10;
		return numberToReturn;
	}
}

class FileReaderClassStub implements FileReaderClassProxy{
	int [] arrayReader;
	int readerCall = 0;
	
	public FileReaderClassStub(int [] arrayReader){
		this.arrayReader = arrayReader;
	}
	
	public void resetCount(){
		readerCall = 0;
	}
	
	public int getNumberFromFile(){
		int numToReturn = arrayReader[readerCall];
		readerCall++;
		return numToReturn;
	}
}
