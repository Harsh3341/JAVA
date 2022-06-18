public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 2, 3, 4, 5 };
        change(arr);
        System.out.println(arr[0]);
    }

    static void change(int[] arr) {
        // change the value of the array
        arr[0] = 10;
    }
}
