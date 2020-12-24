package com.practise;

public class SumMultipliesThreeAndFive {

	public static void main(String[] args) {
		
		int sum = sum(5);
		System.out.println(sum);
	}

	public static int sum(int n) {

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}

		return sum;

	}

}
