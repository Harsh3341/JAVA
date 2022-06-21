import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int[][] arr = new int[3][];

        // int[][] arr2D = {
        // { 1, 2, 3 },
        // { 4, 5 },
        // { 7, 8, 9 }
        // };

        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        // input

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output

        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
    }
}
