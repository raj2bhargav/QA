package corejava;

public class ConstructorDemo {

	public static void main(String[] args) {
		
			
		ConstructorDemo cd = new ConstructorDemo();
		
		cd.getData();
		
		ConstructorDemo cd1 = new ConstructorDemo(10,20);
		

	}
	
	//Default Constructor
	public ConstructorDemo() {
		System.out.println("Constructor Demo");
	}
	
	
	//Parameterized Constructor
	public ConstructorDemo(int a, int b) {
		System.out.println("Sum = " + (a+b));
		//System.out.println("Consructor Demo");
	}
	
	
	
	
	public void getData() {
		System.out.println("Get Data Method");
	}

}
