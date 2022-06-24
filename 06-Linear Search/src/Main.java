public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 43, 56, 12, -11, 28 };
        int target = 56;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans);
        System.out.println(ans2);

    }

    // Search in the array: return the indexif item is found
    // otherise if not found return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }

        // run a for loop

        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target

            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        //
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }

        // run a for loop

        for (int element : arr) {
            // check for element at every index if it is = target

            if (element == target) {
                return element;
            }
        }

        //
        return -1;
    }
}
