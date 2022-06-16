import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in INR: ");
        float inr = input.nextInt();

        float val = inr / 78;

        System.out.println("Value in USD: " + val);
    }
}
