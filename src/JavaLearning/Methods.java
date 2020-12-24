package JavaLearning;

public class Methods {
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		
		m.sayHelloWorld();
		System.out.println("-------------");
		
		m.sayHelloWorldThrice();
		System.out.println("--------------");
		
		m.sayHello(5);
		
		sayHelloTime();
		System.out.println("---------------");
		
		m.printNumbers(5);
		
		System.out.println("----------------");
		
		m.printSquaresOfNumbers(6);
		
		System.out.println("=======================");
		
		m.printMultiplicationTable(7);
		System.out.println("-----------");
		m.printMultiplicationTable(5);
		System.out.println("*****************");
		
		m.sum(10, 20);
		m.sum(40, 50);
		m.sum(10, 20, 30);
		
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(99, -99));
		System.out.println(Math.min(50, 25));
		
		System.out.println("-------------");
		
		int sum = m.sumOfTwoNumbers(10, 20);
		System.out.println(sum);
		
		int sums = m.sumOfThreeNumbers(10, 20, 30);
		System.out.println(sums);
		
		int thirdAngle = m.triangle(50, 60);
		System.out.println(thirdAngle);
			
		
		
	}
	
	int triangle(int x, int y) {
		int c = 180 - x - y;
		return c;
	}
	
	int sumOfTwoNumbers(int a, int b) {
		int sum = a +b;
		return sum;
	}
	
	int sumOfThreeNumbers(int a1, int b1, int c1) {
		int sums = a1 + b1 + c1;
		return sums;
	}
	
	void sum(int a, int b) {
		System.out.println("The sum of the numbers = " + (a + b));
	}
	
	void sum(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("Sum = " +sum);
	}
	
	void printMultiplicationTable(int table) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
	
	void sayHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	
	void sayHelloWorldThrice() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
	
	void sayHello(int noOfTimes) {
		for(int i=1; i<=noOfTimes; i++) {
			System.out.println("Hello Worlds");
		}
	}

	
	static void sayHelloTime() {
		System.out.println("Hello Times");
	}
	
	void printNumbers(int i) {
		for(int k=1; k<=i; k++) {
			System.out.println("The value of k is = " + k);
		}
	}
	
	void printSquaresOfNumbers(int m) {
		for(int p=1; p<=m; p++) {
			System.out.println("Sqaures of = " + p*p);
		}
	}
}
