package com.practise;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int x = 30;
		int y = 20;
		
		if(x > y) {
			System.out.println("x is greater than y");
		} else {
			System.out.println("y is greater than x");
		}
		
		
		int a = 40;
		int b = 20;
		int c = 30;
		
		if(a > b && a > c) {
			System.out.println("a is greatest");
		}
		else if (b > c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}

	}

}
