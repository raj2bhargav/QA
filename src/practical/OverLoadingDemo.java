package practical;

public class OverLoadingDemo {
	
	public void test() {
		System.out.println("Test Method without Parameters");
	}
	
	public void test(int a) {
		System.out.println("Test Method with 1 Parameter = " + a);
	}
	
	public void test(double d) {
		System.out.println("Test Method with double parameter = " + d);
	}
	
	public void test(int x, int y) {
		System.out.println("Test Method with 2 Parameter = " + (x + y));
	}
	
	

}
