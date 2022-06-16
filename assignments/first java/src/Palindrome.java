import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String a = input.nextLine(), reverse = "";
        int strLength = a.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverse = reverse + a.charAt(i);
        }

        if (a.equals(reverse)) {
            System.out.println(a + " is a palindrome");
        } else {
            System.out.println(a + " is not a palindrome");
        }

    }
}
