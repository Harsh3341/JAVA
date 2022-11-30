package Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value to n: ");
        fibo(in.nextInt());
    }

    static void fibo(int num) {

        int a = 0, b = 1, c;

        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                System.out.print(i + " ");
            } else {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
