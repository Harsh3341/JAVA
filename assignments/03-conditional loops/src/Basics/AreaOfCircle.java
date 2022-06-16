package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        int r = input.nextInt();

        double area = (r * r) * 3.14;
        System.out.println("Area of circle is: " + area);
    }
}
