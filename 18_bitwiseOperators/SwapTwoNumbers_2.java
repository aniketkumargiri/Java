// Java program to swap two numbers
//import java.io.*;

public class SwapTwoNumbers_2 {

	public static void swap(int a, int b) {
		// same as a = a + b
		a = (a & b) + (a | b);

		// same as b = a - b
		b = a + (~b) + 1;

		// same as a = a - b
		a = a + (~b) + 1;

		System.out.print("After swapping: a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		int a = 5, b = 10;

		// Function Call
		swap(a, b);
	}
}
