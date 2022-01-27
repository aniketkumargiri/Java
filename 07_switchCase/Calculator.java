import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("Enter the choice of your operation");
		sc.nextLine();
		char choice = sc.nextLine().charAt(0);

		switch (choice) {
		case '+':
			System.out.println("Addition of given numbers is : " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction of given numbers is : " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication of given numbers is : " + (a * b));
			break;
		case '/':
			System.out.println("Division of given numbers is : " + (a / b));
			break;
		case '%':
			System.out.println("Modulo of given numbers is : " + (a % b));
			break;
		default:
			System.out.println("Faltu input by user");
		}

	}
}
