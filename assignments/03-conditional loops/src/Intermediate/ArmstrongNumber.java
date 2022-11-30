package Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        armstrong(in.nextInt());
    }

    static void armstrong(int num) {
        int sum = 0;
        int data = num;

        while (num != 0) {
            int temp = num % 10;
            sum = sum + (temp * temp * temp);
            num = num / 10;
        }

        if (sum == data) {
            System.out.println(data + " is a Armstrong number");
        } else {
            System.out.println(data + " is not a Armstrong number");
        }
    }
}
