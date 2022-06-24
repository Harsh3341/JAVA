public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { -12, -6, -4, 1, 5, 7, 10, 12, 22, 45 };
        int[] arr = { 45, 22, 12, 10, 7, 5, 1, -4, -6, -12 };
        int target = 7;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            } else {

                if (target > arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;

                }
            }
        }
        return -1;
    }
}
