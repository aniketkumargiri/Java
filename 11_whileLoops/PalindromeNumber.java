import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int t = n;
		int p = 0;

		while (t > 0) {
			int r = t % 10;
			t = t / 10;
			p = 10 * p + r;
		}
		if (p == n) {
			System.out.println(n + " Number is palindrome");
		} else {
			System.out.println(n + " Number is not palindrome");
		}
	}

}
