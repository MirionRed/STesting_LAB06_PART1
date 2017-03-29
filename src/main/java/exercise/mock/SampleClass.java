package exercise.mock;

class FileReaderClass{
	public int getNumberFromFile(){
		int numberToReturn = 10;
		return numberToReturn;
	}
}

class FileWriterClass{
	public void writeDataToFile(int dataToWrite){
		
	}
}

public class SampleClass {
	FileReaderClass frc = new FileReaderClass();
	FileWriterClass fwc = new FileWriterClass();
	
	public void sampleMethod(){
		int[]numsFromFile = new int [5];
		for(int i = 0; i<5; i++)
			numsFromFile[i] = frc.getNumberFromFile();
		
		for(int i = 0; i<5; i++)
			fwc.writeDataToFile(numsFromFile[i]);
	}
}
