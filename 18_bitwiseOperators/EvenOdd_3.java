// Java program to check for even or odd
// using Bitwise OR operator

public class EvenOdd_3 {

	// Returns true if n is even, else odd
	static boolean isEven(int n) {

		// n|1 is greater than n, then even, else odd
		if ((n | 1) > n)
			return true;
		else
			return false;
	}

	// Driver code
	public static void main(String[] args) {
		int n = 100;
		System.out.print(isEven(n) == true ? "Even" : "Odd");
	}
}
