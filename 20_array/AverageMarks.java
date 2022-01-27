import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter the marks");
		int marks[] = new int[n];
		for (int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + marks[i];
		}
		int avg = (sum) / n;

		System.out.println("The average is: " + avg);

	}

}
