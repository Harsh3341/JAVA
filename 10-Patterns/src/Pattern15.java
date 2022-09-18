//      *
//     * *
//    *   *
//   *     *
//  *       *
//   *     *
//    *   *
//     * *
//      *

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }

    static void pattern15(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalSpace = row > n ? 2 * n - row + 1 : 2 * row - 3;
            int totalSpace2 = row > n ? row - n : n - row;

            for (int spaces = 1; spaces <= totalSpace2; spaces++) {
                System.out.print(" ");
            }
            if (row == 1 || row == 2 * n - 1) {
                System.out.print("*");
            } else {
                for (int col = 1; col <= 2; col++) {
                    System.out.print("*");
                    for (int space = 1; space <= totalSpace; space++) {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
