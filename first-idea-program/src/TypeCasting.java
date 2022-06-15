import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat(); // read a float number

        // int num = input.nextFloat(); // left hand should be greater then right hand
        // data type
        // System.out.println(num);

        // type casting
        // int num = (int) (65.56f);
        // System.out.println(num);

        // automatic type promotion in expresions
        // int a = 257;
        // byte b = (byte) (a); // 257 % 256 = 1
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d);

        // byte b = 50;
        // b = b*2; // ERROR

        // int number = 'A';
        // System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.672f;
        double d = 0.12384;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
