package JavaLearning;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.println("Cube = " + (number*number*number));
			System.out.print("Enter a number : ");
			number = scanner.nextInt();
			
		} while (number >= 0 );	
		System.out.println("Thank You! Have Fun!");
	
	}

}
