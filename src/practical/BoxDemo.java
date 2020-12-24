package practical;

public class BoxDemo {

	public static void main(String[] args) {

		double myvol;

		Box mybox = new Box();

		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 15;

		myvol = mybox.width * mybox.height * mybox.depth;

		System.out.println("Volume = " + myvol);
		
		Square s1 = new Square();
		
		int k;
		
		k = s1.square(5);
		System.out.println(k);

	}

}

