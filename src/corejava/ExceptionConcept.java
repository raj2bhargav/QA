package corejava;

public class ExceptionConcept {
	
	//int a = 4;

	public static void main(String[] args) throws IndexOutOfBoundsException {

		int x = 10;
		int y = 2;
		
		try {
			int k = x / y;
		} catch (Exception e) {
			System.out.println("I catched the error");
		} finally {
			System.out.println("Always Executed");
		}
		
		
		

	}

}
