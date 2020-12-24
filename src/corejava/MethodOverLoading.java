package corejava;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading ml = new MethodOverLoading();
		
		ml.sum();
		
		ml.sum(10, 25);
		

	}
	
	public void sum() {
		int a = 10;
		int b = 20;
		System.out.println("Sum = " + (a+b));
	}
	
	public void sum(int x, int y) {
		System.out.println("Sum = " + (x+y));
	}

}
