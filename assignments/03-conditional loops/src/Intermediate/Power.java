package Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        power(in.nextInt(), in.nextInt());
    }

    static void power(int num, int n) {
        int temp = 1;

        while (n > 0) {
            temp = temp * num;
            n--;
        }

        System.out.println(temp);
    }
}
