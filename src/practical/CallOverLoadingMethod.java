package practical;

public class CallOverLoadingMethod {

	public static void main(String[] args) {

		OverLoadingDemo old = new OverLoadingDemo();

		old.test();

		old.test(10);

		old.test(20.50);

		old.test(20, 30);

	}

}
