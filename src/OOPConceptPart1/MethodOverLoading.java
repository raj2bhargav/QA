package OOPConceptPart1;

public class MethodOverLoading {
	
	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
	}
	
	public void sum() { //no input, no output
		System.out.println("sum method -- zero parameter");
	}
	
	public void sum(int i) { 
		System.out.println("sum method -- one parameter");
	}
	
	public void sum(int k, int m) {
		System.out.println("sum method -- two parameter");
	}

}
