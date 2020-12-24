package practical;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Raj Kumar Bhargav";

		int i = s.length();

		while (i > 0) {
			System.out.print(s.charAt(i - 1));
			i--;
		}

		System.out.println();

		for (int j = s.length(); j > 0; j--) {
			System.out.print(s.charAt(j - 1));
		}

	}

}
