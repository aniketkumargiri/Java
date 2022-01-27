import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextFloat(); // wrong
        // System.out.println(num);

        // typecasting
        int num2 = (int) (67.54);
        System.out.println(num2);
        
        // automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte) (a); // 257 % 256 = 1
        // System.out.println(b);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;
        System.out.println(d);

    }
}