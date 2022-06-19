import java.util.Scanner;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        max(num1, num2, num3);
        min(num1, num2, num3);

    }

    static void max(int a, int b, int c) {

        if (b > a && b > c) {
            System.out.println(b + " is maximum among the three");
        } else if (c > a) {
            System.out.println(c + " is maximum among the three");
        } else {
            System.out.println(a + " is maximum among the three");
        }
    }

    static void min(int a, int b, int c) {

        if (b < a && b < c) {
            System.out.println(b + " is minimum among the three");
        } else if (c < a) {
            System.out.println(c + " is minimum among the three");
        } else {
            System.out.println(a + " is minimum among the three");
        }
    }
}
