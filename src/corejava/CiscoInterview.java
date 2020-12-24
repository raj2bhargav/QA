package corejava;

public class CiscoInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 5
		// 3 4 7
		// 1 2 9

		int a[][] = { { 2, 4, 5 }, { 3, 99, 7 }, { 1, 0, -6 } };
		int min = a[0][0];
		int minColumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");

				if (a[i][j] < min) {
					min = a[i][j];
					minColumn = j;
					// System.out.println(minColumn);
				}
			}
			System.out.println();

		}
		System.out.println("Min Value = " + min);

		int max = a[0][minColumn];
		int k = 0;

		while (k < 3) {

			if (a[k][minColumn] > max) {
				max = a[k][minColumn];

			}

			k++;

		}
		System.out.println("Max Value = " + max);

 }

}
