public class Floor {
    public static void main(String[] args) {
        int[] arr = { -12, -6, -4, 1, 5, 7, 10, 12, 22, 45 };
        int target = -13;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index: the greatest number <= target

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }
        }
        return end;
    }
}
