class Solution {
    public int minSwaps(int[] nums) {
        if (nums.length <= 1) return 0;
        int[] swapNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            nums[i] = 0;
            for (int j = 0; j < num.length(); j++) {
                nums[i] = nums[i] + Character.getNumericValue(num.charAt(j));
            }
            swapNums[i] = nums[i];
        }
        Arrays.sort(nums);
        int coun = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (swapNums[i] != nums[i]) {
                coun++;
            }
        }
        return coun;
    }
}