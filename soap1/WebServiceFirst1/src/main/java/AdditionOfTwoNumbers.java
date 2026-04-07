
public class AdditionOfTwoNumbers {
	
	public int addTwoNumbers(int a , int b) {
		System.out.println("Addition of two numbers : " + (a + b));
		return a + b;
	}
	
	public int substractTwoNumbers(int a, int b) {
		System.out.println("Substraction of two numbers : " + (a - b));
		return a - b;
	}
	
	public int multiplyTwoNumbers(int a, int b) {
		System.out.println("Multiplication of two numbers : " + (a * b));
		return a * b;
	}
	
	public int divisionTwoNumbers(int a , int b) throws ArithmeticException{
		if(b == 0) {
			throw new ArithmeticException("Division by zero is not allowed");
		}
		System.out.println("Division of two numbers : " + (a / b));
		return a / b;
	}
}
