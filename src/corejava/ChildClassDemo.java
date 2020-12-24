package corejava;

public class ChildClassDemo extends ParentClassDemo {
	
	
	public static void main(String[] args) {
		
		
		ParentClassDemo pc = new ParentClassDemo();
		
		pc.gear();
		pc.brakes();
		pc.audioSystem();
		System.out.println(pc.color);
		System.out.println("------------------");
		ChildClassDemo cc = new ChildClassDemo();
		cc.color();
		cc.gear();
		
	
		
	}
	
	
	public void engine() {
		System.out.println("New Engine");
	}
	
	public void color() {
		System.out.println(color);
	}

}
