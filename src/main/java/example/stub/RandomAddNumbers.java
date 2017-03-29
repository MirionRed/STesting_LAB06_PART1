package example.stub;

public class RandomAddNumbers {
	RandomGeneratorClass rgc = new RandomGeneratorClass();
	
	public int addTwoNumbers(int num1){
		int num2 = rgc.getRandomInteger(4);
		System.out.println("Adding " + num1 + " and " +num2);
		return num1 + num2;
	}
	
	public static void main(String args[]){
		RandomAddNumbers ran = new RandomAddNumbers();
		System.out.print(ran.addTwoNumbers(7));
		System.out.print(ran.addTwoNumbers(8));
		System.out.print(ran.addTwoNumbers(9));
	}
}
