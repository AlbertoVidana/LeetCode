class Solution {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += c - '0';
            }
            nums[i] = sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}