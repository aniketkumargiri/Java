import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dimensions: ");
		int ro = sc.nextInt();
		int co = sc.nextInt();

		int a[][] = new int[ro][co];
		int b[][] = new int[ro][co];
		
		System.out.println("Enter array - 1: ");
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter array - 2: ");
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		int c[][] = new int[ro][co];
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Sum of both arrays is: ");
		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < co; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
	}

}
