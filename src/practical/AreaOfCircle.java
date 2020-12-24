package practical;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter The Radius : ");

		double r = scan.nextDouble();

		double area = (22 * r * r) / 7;

		System.out.println("Area of the circle = " + area);

	}

}
