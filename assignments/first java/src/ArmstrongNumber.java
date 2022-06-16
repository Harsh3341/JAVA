import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int sum = 0;
        int check = a;

        int numLength = String.valueOf(a).length();

        for (int i = 0; i <= numLength; i++) {
            int digit = check % 10;
            sum = sum + (digit * digit * digit);
            check = check / 10;
        }
        if (a == sum) {
            System.out.println(a + " is a Armstrong Number");
        } else {
            System.out.println(a + " is not a Armstrong Number");
        }

    }
}
