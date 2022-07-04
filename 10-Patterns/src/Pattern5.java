// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed , we need to add a newline
            System.out.println();
        }

        for (int irow = 1; irow <= n - 1; irow++) {
            for (int icol = n - 1; icol >= irow; icol--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
