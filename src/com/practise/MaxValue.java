package com.practise;

public class MaxValue {

	public static void main(String[] args) {
		
		int maximum = 0;
		
		int max[] = {10, 15, 99, 35, 20, 65};
		
		for (int i = 0 ; i < max.length ; i++) {
			
			if (max[i] > maximum) {
				maximum = max[i];
			}
			
		}
		System.out.println(maximum);

	}

}
