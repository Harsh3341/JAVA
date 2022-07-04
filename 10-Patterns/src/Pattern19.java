//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *

public class Pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    static void pattern19(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalCol = row > n ? 2 * n - row : row;
            int totalSpace = row > n ? 2 * row - 2 * n : 2 * n - 2 * row;

            for (int col1 = 1; col1 <= totalCol; col1++) {
                System.out.print("*");
            }

            for (int spaces = 1; spaces <= totalSpace; spaces++) {
                System.out.print(" ");
            }

            for (int col2 = 1; col2 <= totalCol; col2++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
