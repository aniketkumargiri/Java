public class PowerOfNumber {

	static int steps = 0;

//	public static int power(int a, int b) {
//
//		steps++;
//		if (b == 0) {
//			return 1;
//		}
//
//		return a * power(a, b - 1);
//	}

	public static int fastPow(int a, int b) {

//		System.out.println(b);

		steps++;

		if (b == 0) {
			return 1;
		}
		if (b % 2 == 0) {
			return fastPow(a * a, b / 2);
		}

		return a * fastPow(a, b - 1);

	}

	public static void main(String[] args) {

//		System.out.println(power(4, 3));

		System.out.println(fastPow(3, 18));

		System.out.println(steps);

	}

}
