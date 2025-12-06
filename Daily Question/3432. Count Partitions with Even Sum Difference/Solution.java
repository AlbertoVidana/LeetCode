class Solution {
    public int countPartitions(int[] nums) {
        int coun = 0, sumL = 0, sumR = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sumL += nums[i];
            for (int j = i+1; j < nums.length; j++) {
                sumR += nums[j];
            }
            if (Math.abs(sumL - sumR) % 2 == 0) {
                coun++;
            }
            sumR = 0;
        }
        return coun;
    }
}