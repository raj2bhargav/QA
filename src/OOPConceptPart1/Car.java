package OOPConceptPart1;

public class Car {
	
	//Global Variable
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		//new Car --> Object of Car Class
		//a, b and c are Object Reference Variable
		Car a = new Car();
		Car b = new Car();
		//Car c = new Car();
		
		
		a.mod = 2014;
		a.wheel = 4;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println("-------------------");
		
		b.mod = 2020;
		b.wheel = 5;
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println("*************************");
		
		
	}
	
	

}
