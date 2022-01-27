// Java code for above approach
//import java.io.*;

public class SubtractBinaryNumbers {

	// Program to subtract
	static void Subtract(int n, int a[], int b[]) {

		// 1's Complement
		for (int i = 0; i < n; i++) {

			// Replace 1 by 0
			if (b[i] == 1) {
				b[i] = 0;
			}

			// Replace 0 by 1
			else {
				b[i] = 1;
			}
		}

		// Add 1 at end to get 2's Complement
		for (int i = n - 1; i >= 0; i--) {
			if (b[i] == 0) {
				b[i] = 1;
				break;
			} else {
				b[i] = 0;
			}
		}

		// Represents carry
		int t = 0;
		for (int i = n - 1; i >= 0; i--) {

			// Add a, b and carry
			a[i] = a[i] + b[i] + t;

			// If a[i] is 2
			if (a[i] == 2) {
				a[i] = 0;
				t = 1;
			}

			// If a[i] is 3
			else if (a[i] == 3) {
				a[i] = 1;
				t = 1;
			} else
				t = 0;
		}

		System.out.println();

		// If carry is generated
		// discard the carry
		if (t == 1) {

			// Print the result
			for (int i = 0; i < n; i++) {

				// Print the result
				System.out.print(a[i]);
			}
		}

		// If carry is not generated
		else {

			// Calculate 2's Complement
			// of the obtained result
			for (int i = 0; i < n; i++) {
				if (a[i] == 1)
					a[i] = 0;
				else
					a[i] = 1;
			}
			for (int i = n - 1; i >= 0; i--) {
				if (a[i] == 0) {
					a[i] = 1;
					break;
				} else
					a[i] = 0;
			}

			// Add -ve sign to represent
			System.out.print("-");

			// -ve result
			// Print the resultant array
			for (int i = 0; i < n; i++) {
				System.out.print(a[i]);
			}
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int n;
		n = 5;
		int a[] = { 1, 0, 1, 0, 1 };
		int b[] = { 1, 1, 0, 1, 0 };

		Subtract(n, a, b);
	}
}
