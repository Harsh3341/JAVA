//    ****
//    *  *
//    *  *
//    *  *
//    ****

public class Pattern20 {
    public static void main(String[] args) {
        pattern20(10);
    }

    static void pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            if (row == 1 || row == n) {
                for (int col = 1; col <= n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                for (int col = 1; col <= 2; col++) {
                    System.out.print("*");
                    for (int space = 1; space <= n - 3; space++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
