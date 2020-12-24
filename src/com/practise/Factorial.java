package com.practise;

public class Factorial {

	public static void main(String[] args) {
		
		int fact = factorial(5);
		System.out.println(fact);
		
	}
	
	
	public static int factorial(int n) {
		
		int factorial = n;
		
		for (int j = n - 1; j > 0; j--) {
			factorial = factorial * j;
		}
		
		return factorial;
		
	}

}
