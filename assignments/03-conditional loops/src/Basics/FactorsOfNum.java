package Basics;

import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value to n: ");
        factors(in.nextInt());
    }

    static void factors(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= 1; j--) {
                if (i * j == num) {
                    System.out.println(i + "x" + j);
                    break;
                }
            }
        }
    }
}
