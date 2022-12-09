class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int n = nums.length - 1;
        int run = k % nums.length;
        int start = n - run + 1;
        int end = n - run;
        int count = 0;

        for (int i = start; i < nums.length; i++) {
            ans[count] = nums[i];
            count++;
        }

        for (int i = 0; i <= end; i++) {
            ans[count] = nums[i];
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }

    }
}