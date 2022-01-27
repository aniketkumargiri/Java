// Java program to check for even or odd
// using Bitwise XOR operator
public class EvenOdd_1 {

	// Returns true if n is even, else odd
	static boolean isEven(int n) {

		// n^1 is n+1, then even, else odd
		if ((n ^ 1) == n + 1)
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
