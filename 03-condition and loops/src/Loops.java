import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
         * Syntax of for loops:
         * for (initialization; condition; increment/decrement) {
         * // code to be executed
         * }
         */

        // Q. Print numbers from 1 to 10
        // for (int i = 1; i <= 10; i += 2) {
        // System.out.println(i);
        // }

        // print number from 1 to input number
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = input.nextInt();
        // for (int i = 1; i <= number; i++) {
        // System.out.print(i + " ");
        // }

        // while loops
        /*
         * Syntax of while loops:
         * while (condition) {
         * // code to be executed
         * }
         */

        // Q. Print numbers from 1 to 10
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // do-while loops

        /*
         * Syntax of do-while loops:
         * do {
         * // code to be executed
         * } while (condition);
         */

        // Q. Print numbers from 1 to 10
        int i = 1;
        do {
            System.out.println("Hello World");
        } while (i <= 10);
    }
}
