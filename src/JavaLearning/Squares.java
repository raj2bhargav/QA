package JavaLearning;

public class Squares {
	
	public static void main(String[] args) {
		
		
		//Square for first 10 even numbers
		for(int i=1; i<=10; i++) {
			System.out.println((2*i) * (2*i));
		}
		
		System.out.println("-----------------");
		
		//Square of first 10 odd numbers
		for(int j=1; j<=20; j=j+2) {
			System.out.println(j*j);
		}
		
		System.out.println("--------------");
		
		for(int p=1; p<=10; p++) {
			System.out.printf("%d * %d = %d", 5, p, 5*p).println();
		}
		
		
	}

}
