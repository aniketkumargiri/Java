import java.util.Scanner;

public class FirstJavaClass {

	public static void main(String[] args) {

//		System.out.println("Hello World");

//      int, float, char, string, long, double, boolean:

//		int age = 18;
//		float average = 19.345f;
//		char grade = 'A';
//		String name = "Aniket";
//		boolean isValid = false;
//		long bigNumber = 928272958l;
//		
//		System.out.println(age);
//		System.out.println(average);
//		System.out.println(grade);
//		System.out.println(name);
//		System.out.println(isValid);
//		System.out.println(bigNumber);

		
//		+, -, *, %, ++, --:

//		int firstNumber = 678;
//		int secondNumber = 234;
//		
//		double sumOf = (double) firstNumber + (double) secondNumber;
//		System.out.println(sumOf);
//		
//		int sum = firstNumber + secondNumber;
//		int sub = firstNumber - secondNumber;
//		int mul = firstNumber * secondNumber;
//		int div = firstNumber / secondNumber;
//		int mod = firstNumber % secondNumber;
//		
//		System.out.println(sum);
//		System.out.println(sub);
//		System.out.println(mul);
//		System.out.println(div);
//		System.out.println(mod);

//		System.out.println(firstNumber++);
//		System.out.println(++firstNumber);
//		System.out.println(secondNumber--);
//		System.out.println(--secondNumber);

		
//		Input:

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your age");
//		int age = sc.nextInt();
//		System.out.println(3 + age);
//		float age = sc.nextFloat();
//		System.out.println(2.5 * age);
//
//		String name = sc.nextLine();
//		System.out.print(name);

		
//		>, <, >=, <=, ==, !=:

//		int age = 17;
//		if(age > 18) {
//			System.out.println("You can vote");
//		}else {
//			System.out.println("You cannot vote");
//		}

		
//		&&, ||, !:

//		int age = 19;
//		if(age > 18 && age < 50) {
//			System.out.println("You can vote");
//     	}else {
//     		System.out.println("You cannot vote");
//     	}
//		
//		int age = 21;
//		int car = 1;
//		if(age > 18 || car > 1) {
//			System.out.println("You can drink");
//     	}else {
//     		System.out.println("You cannot drink");
//     	}
//		
//		int age = 17;
//		if(!(age > 18)) {
//			System.out.println("You can drink");
//     	}else {
//     		System.out.println("You cannot drink");
//     	}

//		boolean isEqual = 18 ==18;
//		System.out.println(19 > 18);
//		
//		char grade = 'A';
//		if(grade =='A') {
//			System.out.println("Your grade is A very good");
//		}else if(grade == 'B'){
//			System.out.println("Your grade is good");
//		}else if(grade == 'C'){
//			System.out.println("Your grade is satisfactory");
//		}else {
//			System.out.println("Your grade is poor, improve it");
//		}

		
//		switch case:

//		char grade = 'E';
//		switch(grade) {
//		case 'A':
//			System.out.println("Your grade is A very good");
//			break;
//		case 'B':
//			System.out.println("Your grade is good");
//			break;
//		case 'C':
//			System.out.println("Your grade is satisfactory");
//			break;
//		default:
//			System.out.println("Your grade is poor, improve it");
//			break;
//		}

		
//		for, while, do-while

//		for(int i=0;i<5;i++) {
//			System.out.println("Aniket"+i);
//		}
//		
//		int a = 89;
//		while(a<100) {
//			a++;
//			if(a==95)
//				continue;
//			System.out.println(a);
//		}
//		
//		int a = 23;
//		do {
//			System.out.println(a);
//			a++;
//		}while(a<=50);

		
//		arrays: 

//		int marks[] = new int[5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
//		
//		int marks[] = {23, 12, 56, 34, 99, 17, 917};
//		
//		for(int i=0;i<marks.length;i++) {
//			System.out.println(marks[i]);
//		}

//		int a[][] = new int[2][3];
//		int a[][] = {{1,2,3},{3,4,5}};
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
//		System.out.println(a[0][2]);
//		System.out.println(a[1][0]);
//		System.out.println(a[1][1]);
//		System.out.println(a[1][2]);

		
//		Exception Handling:
//		
//		int a[] = new int[3];
//		try {
//			System.out.println(a[4]);
//			System.out.println(5/0);
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Error aaya tha");
//			System.out.println(e.getLocalizedMessage());
//		}catch(ArithmeticException e){
//			System.out.println(e.getLocalizedMessage());
//		}
//		
//		try {
//			System.out.println(2/0);
//		}catch(Exception e) {
//			System.out.println(e.getLocalizedMessage());
//		}
//		System.out.println("Niche ki line");
//		

//		methods:

//		System.out.println(average(42, 12));
		System.out.println(average(2, 4));

	}

//		returnType functionName(arguments) {}

	static int average(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum / 2;

	}

}