package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array --> Store similar data types variable.
		//Below are One Dimensional Array
		//Dis-Advantage of 1D Array:
		//1. Size is fixed
		//2. Store Only similar data types
		
		//1. Integer Array
		int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//arr[4] = 50;
		//System.out.println(arr[4]);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*************************");
		
		//2. Double Array
		double a[] = new double[3];
		a[0] = 10.5;
		a[1] = 11.11;
		a[2] = 12.12;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=======================");
		
		
		//3. Char Array
		char c[] = new char[4];
		c[0] = 'A';
		c[1] = '$';
		c[2] = '@';
		c[3] = '9';
		for (int k = 0; k < c.length; k++) {
			System.out.println(c[k]);
		}
		System.out.println("---------------------------");
		
		//4. Boolean Array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b.length);
		System.out.println("----------------------");
		
		//5. String Array
		String s[] = new String[5];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "Selenium";
		s[3] = "QA";
		s[4] = "Test";
		for (int p = 0; p < s.length; p++) {
			System.out.println(s[p]);
		}
		System.out.println("============================");
		
		
		//6. Object Array
		Object obj[] = new Object[3];
		obj[0] = "QQQQ";
		obj[1] = 10;
		obj[2] = 12.55;
		for (int m = 0; m < obj.length; m++) {
			System.out.println(obj[m]);
		}

	}

}
