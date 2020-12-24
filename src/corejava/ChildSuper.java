package corejava;

public class ChildSuper extends ParentSuper{
	
	String name = "Bhargav";
	
	public void getString() {
		System.out.println(name);
		System.out.println("---------------");
		System.out.println(super.name);
	}
	
	
	public void firsTest() {
		super.firstTest();
		System.out.println("Child First Test");
	}
	
	
	public ChildSuper() {
		//super();
		System.out.println("Child Constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildSuper cs = new ChildSuper();
		//System.out.println(cs.name);
		
		cs.getString();
		
		cs.firsTest();
		
		
		
	}

}
