import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = input.nextFloat();

        if (num1 > num2) {
            System.out.println(num1 + " is greater then " + num2);
        } else {
            System.out.println(num2 + " is greater then " + num1);
        }
    }
}
