package practical;

public class ThisDemo {

	public static void main(String[] args) {
		
		Boxe box1 = new Boxe(10, 10, 10);
		Boxe box2 = new Boxe(20, 20, 20);
		
		
		System.out.println(box1.volume());
		System.out.println(box2.volume());
		

	}

}
