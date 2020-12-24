package practical;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the width : ");
		double b = s.nextDouble();
		
		System.out.println("Enter the heigth : ");
		double h = s.nextDouble();
		
		double area = AOT(b,h);
		
		System.out.println("Area of the triangle = " + area);

	}
	
	
	static double AOT(double b, double h) {
		return ((b * h) / 2);
	}

}
