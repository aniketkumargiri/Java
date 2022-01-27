import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

//		int sum = 0;
//		int temp = num;
//
//		while (temp != 0) {
//			int rem = temp % 10;
//			temp = temp / 10;
//			sum = sum + rem;
//			System.out.println(rem + " " + temp + " " + sum);
//
//		}
//		System.out.println("The sum Of digits of " + num + " is " + sum);

		int numberOfDigits=(int)Math.log10(num)+1;
		
		System.out.println(numberOfDigits);
		
	}

}
