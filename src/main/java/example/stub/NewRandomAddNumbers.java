package example.stub;

public class NewRandomAddNumbers {
	RandomGeneratorClassFunction rgcf;
	
	public NewRandomAddNumbers(RandomGeneratorClassFunction rgcf){
		this.rgcf = rgcf;
	}
	
	public int addTwoNumbers(int num1){
		int num2 = rgcf.getRandomInteger(4);
		System.out.print("Adding " + num1 + " and " +num2);
		return num1 + num2;
	}
	
	public static void main(String args[]){
		RandomGeneratorClassFunction original = new OriginalRandomGeneratorClass();
		RandomGeneratorClassFunction stub = new StubRandomGeneratorClass(5);
		System.out.println("original");
		NewRandomAddNumbers nr1 = new NewRandomAddNumbers(original);
		System.out.println(" " + nr1.addTwoNumbers(7));
		System.out.println(" " + nr1.addTwoNumbers(8));
		System.out.println(" " + nr1.addTwoNumbers(9));
		System.out.println("stub");
		NewRandomAddNumbers nr2 = new NewRandomAddNumbers(stub);
		System.out.println(" " + nr2.addTwoNumbers(7));
		System.out.println(" " + nr2.addTwoNumbers(8));
		System.out.println(" " + nr2.addTwoNumbers(9));
	}
}
