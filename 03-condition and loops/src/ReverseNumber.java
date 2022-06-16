import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sum = 0;
        while (0 < n) {
            int temp = n % 10;
            sum = temp + (sum * 10);
            n = n / 10;
        }

        System.out.println(sum);
    }
}
