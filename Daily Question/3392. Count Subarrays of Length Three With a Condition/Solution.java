class Solution {
    public int countSubarrays(int[] nums) {
        int coun = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            Double vid = Double.valueOf(nums[i+1]) / 2;
            if ((nums[i]) + (nums[i + 2]) == vid) {
                coun++;
            }
        }
        return coun;
    }
}