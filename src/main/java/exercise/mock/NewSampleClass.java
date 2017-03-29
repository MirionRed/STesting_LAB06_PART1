package exercise.mock;

public class NewSampleClass {
	FileReaderClassProxy frcp;
	FileWriterClassProxy fwcp;
	
	public NewSampleClass(FileReaderClassProxy frcp, FileWriterClassProxy fwcp){
		this.frcp = frcp;
		this.fwcp = fwcp;
	}
	
	public void sampleMethod(){
		int[]numsFromFile = new int [5];
		for(int i = 0; i<5; i++){
			numsFromFile[i] = frcp.getNumberFromFile();
		}
			
		for(int i = 0; i<5; i++){
			fwcp.writeDataToFile(numsFromFile[i]);
		}
	}
}
