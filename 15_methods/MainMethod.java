public class MainMethod {

	public static void main(String[] args) {

//		sayHi();

		int firstNumber = 23;
		int secondNumber = 34;
		int thirdNumber = 12;

		int result1 = maxOf(firstNumber, secondNumber);
		int result2 = maxOf(firstNumber);
		int result3 = maxOf(firstNumber, secondNumber, thirdNumber);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

	static void sayHi() {

		System.out.println("Hello guys");
	}

	static int maxOf(int a, int b) {

		return a > b ? a : b;
	}

	static int maxOf(int c) {

		return c;
	}

	static int maxOf(int a, int b, int c) {

		return (a + b) > c ? (a + b) : c;
	}
}
