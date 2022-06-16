import java.sql.Time;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        float principal = input.nextFloat();
        System.out.print("Enter Rate: ");
        float Rate = input.nextFloat();
        System.out.print("Enter Time: ");
        float time = input.nextFloat();

        float interest = (principal * Rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
