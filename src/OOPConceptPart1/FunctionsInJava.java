package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int prq = obj.pqr();
		System.out.println(prq);
		
		String qa = obj.qa();
		System.out.println(qa);
		
		int div = obj.div(20, 10);
		System.out.println(div);
		
		
		

	}
	
	//Function and Method are same.
	//Non Static Methods.
	
	public void test() {//no input, no output
		System.out.println("test method");
	}
	
	
	public int pqr() { //no input and some output
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
	
	
	public String qa() { //no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	public int div(int x, int y) {
		System.out.println("div method");
		int div = x/y;
		
		return div;
	}

}
