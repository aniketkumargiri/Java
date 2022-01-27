public class BitMasking_1 {

	// Function to get the kth bit of n
	public static boolean getBit(int n, int k) {
		
		return ((n & (1 << k)) != 0);
	}

	// Function to set the kth bit of n
	public static int setBit(int n, int k) {
		return (n | (1 << k));
	}

	// Function to clear the kth bit of n
	public static int clearBit(int n, int k) {
		return (n & (~(1 << k)));
	}

	// Function to toggle the kth bit of n
	public static int toggleBit(int n, int k) {
		return (n ^ (1 << k));
	}

	public static void main(String[] args) {

		int n = 14, k = 0;

		System.out.println(getBit(n, k));
		
		System.out.println(setBit(n, k));

		System.out.println(clearBit(n, k));

		System.out.println(toggleBit(n, k));

	}

}
