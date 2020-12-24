package com.practise;

public class ArrayConcepts {

	public static void main(String[] args) {

		// Array --> Store similar data types variable.
		// Below are One Dimensional Array
		// Dis-Advantage of 1D Array:
		// 1. Size is fixed
		// 2. Store Only similar data types
		
		//1. Integer Array
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("-----------------------");
		
		int b[] = {15, 25, 35, 45};
		
		for(int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
		
		System.out.println("-----------------------");
		
		//2. Double Array
		double d[] = {1.5, 2.5, 3.5, 4.5, 5.5, 6.6};
		
		for(int k = 0; k < d.length; k++) {
			System.out.println(d[k]);
		}
		
		System.out.println("-----------------------");
		
		//3. Character Array
		char c[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		for(int l = 0; l < c.length; l++) {
			System.out.println(c[l]);
		}
		
		System.out.println("-----------------------");
		
		//4. Boolean Array
		boolean b1[] = {true, false};

		for(int m = 0; m < b1.length; m++) {
			System.out.println(b1[m]);
		}
		
		System.out.println("-----------------------");
		
		
		//5 String Array
		String s[] = {"Hello", "World", "Raj", "1000", "$$$$", "####"};
		
		for(int r = 0; r < s.length; r++) {
			System.out.println(s[r]);
		}
		
		System.out.println("-----------------------");
		
		
		//6 Object Array
		Object obj[] = {"Bhargav", 5000, 50.50, true, 'A'};
		
		for(int p = 0; p < obj.length; p++) {
			System.out.println(obj[p]);
		}
		
		System.out.println("-----------------------");
		
		
	}

}
