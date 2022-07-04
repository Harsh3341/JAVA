//  4 4 4 4 4 4 4  
//  4 3 3 3 3 3 4   
//  4 3 2 2 2 3 4   
//  4 3 2 1 2 3 4   
//  4 3 2 2 2 3 4   
//  4 3 3 3 3 3 4   
//  4 4 4 4 4 4 4

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }

    static void pattern31(int n) {
        int originalN = n - 1;
        n = 2 * originalN;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col)) + 1;
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
