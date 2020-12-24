package OOPConceptPart1;

public class LocalVsGlobalVariable {
	
	//Global Variable
	String name = "Raj";
	int age = 25;
	
	static String role = "QA";
	
	public static void main(String[] args) {
		
		System.out.println(role);
		
		//Local Variable
		int i = 10;
		System.out.println(i);
		min();
		//test();
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		obj.test();
		
		
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public static void min() {
		System.out.println("min method");
	}
	
	

}
