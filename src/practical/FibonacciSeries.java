package practical;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Of Terms : ");

		int n = sc.nextInt();

		int i = 0, j = 1, nextTerm;

		for (int c = 0; c < n; c++) {

			if (c <= 1) {
				nextTerm = c;
			} else {
				nextTerm = i + j;
				i = j;
				j = nextTerm;
			}
			System.out.println(nextTerm);
		}

	}

}
