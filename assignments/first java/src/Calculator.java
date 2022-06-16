import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = input.nextFloat();
        System.out.print("Operation Wants to perform(+,-,*,/): ");
        char ops = input.next().charAt(0);

        if (ops == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (ops == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (ops == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (ops == '/') {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Invalid");
        }
    }
}
