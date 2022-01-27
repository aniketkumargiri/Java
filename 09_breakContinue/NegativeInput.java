import java.util.Scanner;

public class NegativeInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n > 0) {
				continue;
			} else {
				break;
			}
		}
	}

}
