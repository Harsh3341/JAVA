package bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 5, 6, 3, 6 };

        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;

        for (int i : arr) {
            unique ^= i;
        }

        return unique;
    }
}
