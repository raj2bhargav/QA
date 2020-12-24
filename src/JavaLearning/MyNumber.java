package JavaLearning;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		//2 to check-1
		//How can we check if the number is divisible by 2
		
		if(number < 2) {
			return false;
		}
		
		for(int i = 2; i <= number-1; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for(int i = 1; i <= number ; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	
	public int sumOfDivisors() {
		
		int sum = 0;
		
		for(int i = 2; i <= number - 1 ; i++) {
			
			if(number % i == 0) {
				sum = sum + i;
			}
			
		}
		
		return sum;
	}

	
	
	public void printANumberInTriangle() {
		
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		//1 2 3 4 5
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
	}

}
