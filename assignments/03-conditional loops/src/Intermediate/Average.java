package Intermediate;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find average of: ");
        int n = input.nextInt();

        int numLength = String.valueOf(n).length();
        float avg = 0;
        while (0 < n) {
            int temp = n % 10;
            n = n / 10;
            avg = avg + temp;
        }
        System.out.println("Average: " + (avg / numLength));
    }
}
