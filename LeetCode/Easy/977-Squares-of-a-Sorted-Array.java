class Solution {
    public int[] sortedSquares(int[] nums) {

        boolean swapped;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < ans.length; i++) {
            swapped = false;
            for (int j = 1; j < ans.length - i; j++) {
                if (ans[j - 1] > ans[j]) {
                    int temp = ans[j - 1];
                    ans[j - 1] = ans[j];
                    ans[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return ans;
    }
}