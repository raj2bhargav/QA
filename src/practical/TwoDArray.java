package practical;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][] = new int[2][3];

		int k = 0;

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {

				a[i][j] = k;
				System.out.print(a[i][j] + " ");
				k++;
			}
			System.out.println();
		}

	}

}
