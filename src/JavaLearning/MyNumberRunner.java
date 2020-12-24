package JavaLearning;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyNumber number = new MyNumber(5);
		
		boolean isPrime = number.isPrime();
		System.out.println("isPrime = " + isPrime);
		
		int sum = number.sumUptoN();
		System.out.println("Sum = " + sum);
		
		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors = " + sumOfDivisors);
		
		number.printANumberInTriangle();
		
		

	}

}
