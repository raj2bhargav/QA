package practical;

import java.util.Scanner;

public class AreaOfTheCircle extends AreaCalculation{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Radius : ");
		
		double rad = s.nextDouble();
		
		AreaOfTheCircle a = new AreaOfTheCircle();
		
		a.circle(rad);
		
		System.out.println("Area of the circle = " + a.area);
		
	}

}
