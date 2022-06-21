import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // arr[0] = 23;
        // arr[1] = 43;
        // arr[2] = 32;
        // arr[3] = 65;
        // arr[4] = 61;

        // System.out.println(arr[3]);

        // input using for loops

        for (int i = 0; i < arr.length; i++) {

            arr[i] = in.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // for (int i : arr) {
        // System.out.println(i);
        // }

        System.out.println(Arrays.toString(arr));
    }
}
