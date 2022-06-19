import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        marks(n);
    }

    static void marks(int a) {

        if (a > 90 && a <= 100) {
            System.out.println("Grade: AA");
        } else if (a > 80 && a <= 90) {
            System.out.println("Grade: AB");
        } else if (a > 70 && a <= 80) {
            System.out.println("Grade: BB");
        } else if (a > 60 && a <= 70) {
            System.out.println("Grade: BC");
        } else if (a > 50 && a <= 60) {
            System.out.println("Grade: CD");
        } else if (a > 40 && a <= 50) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Fail");
        }
    }
}
