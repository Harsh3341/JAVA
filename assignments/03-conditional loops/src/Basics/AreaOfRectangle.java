package Basics;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int l = input.nextInt();
        System.out.print("Enter breath of rectangle: ");
        int b = input.nextInt();

        double area = (l * b);
        System.out.println("Area of rectangle is: " + area);
    }
}
