package exercise.mock;

import java.util.ArrayList;

public interface FileWriterClassProxy {
	public void writeDataToFile(int dataToWrite); 
}

class FileWriterClassOriginal implements FileWriterClassProxy{
	public void writeDataToFile(int dataToWrite) {
	}
}

class FileWriterClassMock implements FileWriterClassProxy{
	ArrayList<Integer> arrayWriter = new ArrayList<Integer>();
	
	public void writeDataToFile(int dataToWrite) {
		arrayWriter.add(dataToWrite);
	}
	
	public int[] getIntList(){
		int[] intArrayToReturn = new int[arrayWriter.size()];
		
		for(int i = 0; i < arrayWriter.size(); i++){
			intArrayToReturn[i] = arrayWriter.get(i);
		}
		return intArrayToReturn;
	}
}
