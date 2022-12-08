class Solution {
    public boolean canJump(int[] nums) {
        int pos = 0;
        int curr = 0;

        while (curr < nums.length) {
            if (curr > pos) {
                return false;
            }

            pos = max(nums[curr] + curr, pos);
            curr++;
        }

        return true;
    }

    int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}