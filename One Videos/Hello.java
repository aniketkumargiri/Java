// import java.util.Scanner;
// import java.util.Arrays;

// public class Hello {

//     public static void main(String[] args) {
    
        // System.out.println("Hello World");
        // System.out.print("Hello Java");

        // Varibles

        // String name = "Aniket";
        // int age = 30;
        // String neighbour = "Adarsh";
        // String friend = neighbour;

        // byte - 1
        // short - 2
        // int - 4 1,2
        // long - 8
        // float - 4 3.14
        // double - 8
        // char - 2 a,b,c
        // boolean - 1 true/false

        // byte age = 17;
        // int phone = 1234567890;
        // long phone2 = 12345678900L;
        // float pi= 3.14F;
        // char letter = '@';
        // boolean isAdule = false;

        // Non-primitive types
        // String name = new String("Aniket");
        // String friend = new String("Adarsh");
        // System.out.println(name.length());

        // String

        // concatenate
        // String name1 = "Aniket";
        // String name2 = "Adarsh";
        // String name3 = name1 + " and " + name2;

        // length
        // System.out.println(name3);

        // charAt
        // String name = "Aniket";
        // System.out.println(name.charAt(0));

        // replace
        // String name = "Aniket";// immutable
        // String replacement = name.replace('A', '@');
        // System.out.println(name);
        // System.out.println(replacement);

        // substring
        // String name = "Aniket and Adarsh";
        // System.out.println(name.substring(0, 6));
        // System.out.println(name.substring(11));

        // Arrays
        // int age = 17;
        // int physics = 97;
        // int maths = 93;
        // int chemistry=95;

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 93;
        // marks[2] = 95;
        // int[] marks = { 97, 93, 95 };

        // for (int i = 0; i < 3; ++i) {
        // System.out.println(marks[i]);
        // }
        // System.out.println(marks.length);

        // sort
        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);

        // int[][] finalmarks = { { 97, 98, 95 }, { 95, 95, 96 } };

        // for (int i = 0; i < 2; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.println(finalmarks[i][j]);
        // }
        // }

        // casting
        // double price = 100.00;
        // double finalprice = price + 10;
        // System.out.println(finalprice);

        // int p = 100;
        // int fp = p + (int) 18.0;
        // System.out.println(fp);

        // constants

        // int age = 17;
        // age = 18;
        // age = 19;

        // final float PI = 3.14;
        // PI = 3.12345678900F;// immutable

        // operators
        // int a = 1;
        // int b = 2;
        // int sum = a + b;
        // int sub = a - b;
        // int mul = a * b;
        // int div = a / b;
        // int mod = a % b;
        // System.out.println(sum);
        // System.out.println(sub);
        // System.out.println(mul);
        // System.out.println(div);
        // System.out.println(mod);

        // int num = 1;
        // System.out.println(num++);
        // System.out.println(++num);
        // System.out.println(--num);
        // System.out.println(num--);
        // System.out.println(num);

        // maths
        // System.out.println(Math.max(4, 8));
        // System.out.println(Math.min(4, 8));

        // random
        // System.out.println((int) (Math.random() * 100));

        // input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input Your age");
        // int age = sc.nextInt();
        // float age=sc.nextFloat();
        // System.out.println(age);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name");
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println(name);

        // comparison operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a >= b
        // a <= b

        // boolean isSunUp = true;
        // if (isSunUp == true) {
        // System.out.println("day");
        // } else {
        // System.out.println("night");
        // }

        // int age = 17;
        // if (age >= 18) {
        // System.out.println("can vote");
        // } else {
        // System.out.println("can't vote");
        // }

        // logical operators
        // &&
        // int a = 30;
        // int b = 40;
        // if (a < 50 && b < 50) {
        // System.out.println("both less than 50");
        // }

        // ||
        // int a = 30;
        // int b = 40;
        // if (a < 50 && b < 50) {
        // System.out.println("at least one less than 50");
        // }

        // boolean isAdult = true;
        // if (isAdult) {
        // System.out.println("is adult");
        // } else {
        // System.out.println("is not adult");
        // }

        // conditional statement
        // Scanner sc = new Scanner(System.in);
        // int cash = sc.nextInt();
        // if (cash < 10) {
        // System.out.println("can't but anything");
        // } else if (cash > 10 && cash < 50) {
        // System.out.println("can get a thing");
        // } else {
        // System.out.println("can get both");
        // }

        // int day = 2;
        // switch (day) {
        // case 1:
        // System.out.println("monday");
        // break;
        // case 2:
        // System.out.println("tuesday");
        // break;
        // case 3:
        // System.out.println("wednesday");
        // break;
        // default:
        // System.out.println("thursday to Sunday");
        // break;
        // }

        // loops
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");

        // for
        // for (int i = 0; i <= 5; i++) {
        // System.out.print(i + " ");
        // }

        // while
        // int i = 0;
        // while (i <= 10) {
        // System.out.print(i + " ");
        // i++;
        // }

        // int i = 1;
        // do {
        // System.out.print(i + " ");
        // i++;
        // } while (i < 10);

        // Scanner sc = new Scanner(System.in);
        // int num = 0;
        // do {
        // System.out.println("input a number");
        // num = sc.nextInt();
        // System.out.println("here num is:");
        // System.out.println(num);

        // } while (num >= 0);

        // System.out.println("THE END");

        // break and continue
        // int i = 0;
        // while (true) {
        // if (i == 3) {
        // i++;
        // continue;
        // }
        // System.out.print(i + " ");
        // i++;
        // if (i >= 5) {
        // break;
        // }
        // }

        // try-catch in exception handling
        // int[] marks = { 1, 2, 3, 4, 5 };
        // try {
        // System.out.println(marks[5]);
        // } catch (Exception ex) {

        // }
        // System.out.println("the student name is aniket");

        // methods
        // System.out.println("Hello Java");
        // System.out.println("Hello Java");
        // System.out.println("Hello Java");

        // printJava();

        // printName("Aniket");

        // sum(3, 4);

    // }

    // public static void printJava() {
    // System.out.println("Hello Java");
    // }

    // public static void printName(String name) {
    // System.out.println(name);
    // }

    // public static void sum(int a, int b) {
    //     System.out.println(a + b);
    // }
// }

import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {

        int myNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Guess my number: ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Correct Number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Too Large Number");
            } else {
                System.out.println("Smaller Number");
            }
        } while (userNumber >= 0);

        System.out.println("My number is " + myNumber);
    }
}
