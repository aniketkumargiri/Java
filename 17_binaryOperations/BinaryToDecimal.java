//Java code for above approach
//import java.io.*;

public class BinaryToDecimal {

	// Java program to convert
	// binary to decimal

	// Function to convert
	// binary to decimal

	static int binaryToDecimal(int n) {
		int num = n;
		int dec_value = 0;

		// Initializing base
		// value to 1, i.e 2^0
		int base = 1;

		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;

			dec_value += last_digit * base;

			base = base * 2;
		}

		return dec_value;
	}

	// Driver Code
	public static void main(String[] args) {

		int num = 10101001;
		System.out.println(binaryToDecimal(num));
	}
}
