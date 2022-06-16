package Basics;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height of triangle: ");
        int h = input.nextInt();
        System.out.print("Enter base of triangle: ");
        int b = input.nextInt();

        double area = 0.5 * h * b;
        System.out.println("Area of triangle is: " + area);
    }
}
