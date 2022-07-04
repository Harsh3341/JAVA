//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int totalCol = row > n ? row - n : n - row + 1;

            for (int spaces = 1; spaces <= n - totalCol; spaces++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
