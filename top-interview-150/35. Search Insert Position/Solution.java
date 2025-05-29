class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] > target || nums[0] == target) return 0;
        for (int i = 1; i < nums.length; i++) {
            System.out.println(nums[i-1] + " < " + target + " < " + nums[i]);
            if (nums[i] == target) {
                return i;
            } else if (nums[i-1] < target && target < nums[i]) {
                return i;
            } 
        }
        return nums.length;
    }
}