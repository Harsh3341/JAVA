package Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find factorial of: ");
        int n = input.nextInt();
        int ans = 1;
        while (1 < n) {
            int temp = n * (n - 1);
            n = n - 2;
            ans = ans * temp;
        }
        System.out.println(ans);
    }
}
