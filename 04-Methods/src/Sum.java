import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2(20, 30);
        System.out.println(ans);
    }

    // static int sum() {
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int num = input.nextInt();
    // System.out.print("Enter another number: ");
    // int num2 = input.nextInt();
    // int sum = num + num2;
    // return sum;
    // }

    static int sum2(int a, int b) {
        int sum = a + b;
        return sum;

    }
}
