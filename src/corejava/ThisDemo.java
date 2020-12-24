package corejava;

public class ThisDemo {
	
	int a = 2;
	
	public void getSampleData() {
		int a = 3;
		System.out.println(a);
		
		System.out.println(this.a);
		
		System.out.println("Sum = " + (a + this.a));
		
	}

	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		
		td.getSampleData();
				

	}

}
